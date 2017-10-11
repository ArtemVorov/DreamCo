package dreamco.project.repository.jdbc;

import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.util.List;

/**
 * User: temaprof
 * Date: 26.09.2016
 */

@Repository
public class JdbcDesireRepositoryImpl implements DesireRepository {

    private static final RowMapper<Desire> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Desire.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SimpleJdbcInsert insertUserDesire;

    @Autowired
    public JdbcDesireRepositoryImpl(DataSource dataSource) {
        this.insertUserDesire = new SimpleJdbcInsert(dataSource)
                .withTableName("desires")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public Desire save(Desire userDesire, int userId) {
        MapSqlParameterSource map = new MapSqlParameterSource()
                .addValue("id", userDesire.getId())
                .addValue("description", userDesire.getDescription())
                .addValue("barter", userDesire.getBarter())
                .addValue("categories", userDesire.getCategories())
                .addValue("date_time", userDesire.getDateTime())
                .addValue("user_id", userId);

        if (userDesire.isNew()) {
            Number newId = insertUserDesire.executeAndReturnKey(map);
            userDesire.setId(newId.intValue());
        } else {
            if (namedParameterJdbcTemplate.update("" +
                            "UPDATE desires " +
                            "   SET description=:description, barter=:barter, categories=:categories, date_time=:date_time " +
                            " WHERE id=:id AND user_id=:user_id"
                    , map) == 0) {
                return null;
            }
        }
        return userDesire;
    }

    @Override
    public boolean delete(int id, int userId) {
        return jdbcTemplate.update("DELETE FROM desires WHERE id=? AND user_id=?", id, userId) != 0;
    }

    @Override
    public Desire get(int id, int userId) {
        List<Desire> desires = jdbcTemplate.query(
                "SELECT * FROM desires WHERE id = ? AND user_id = ?", ROW_MAPPER, id, userId);
        return DataAccessUtils.singleResult(desires);
    }

    @Override
    public List<Desire> getAll(int userId) {
        return jdbcTemplate.query(
                "SELECT * FROM desires WHERE user_id=? ORDER BY date_time DESC", ROW_MAPPER, userId);
    }

    @Override
    public List<Desire> getBetween(String category, int userId) {
        return jdbcTemplate.query(
                "SELECT * FROM desires WHERE user_id=?  AND categories=?",
                ROW_MAPPER, userId, category);
    }
}