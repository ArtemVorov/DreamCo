package dreamco.project.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by temaprof on 19.09.2016.
 */
@NamedQueries({
        @NamedQuery(name = Desire.GET, query = "SELECT m FROM Desire m WHERE m.id=:id AND m.user.id=:userId"),
        @NamedQuery(name = Desire.ALL_SORTED, query = "SELECT m FROM Desire m WHERE m.user.id=:userId ORDER BY m.dateTime DESC"),
        @NamedQuery(name = Desire.DELETE, query = "DELETE FROM Desire m WHERE m.id=:id AND m.user.id=:userId"),
        @NamedQuery(name = Desire.GET_BETWEEN, query = "SELECT m FROM Desire m " +
                "WHERE m.user.id=:userId AND m.categories=:categories"),

//        @NamedQuery(name = Meal.UPDATE, query = "UPDATE Meal m SET m.dateTime = :datetime, m.calories= :calories," +
//                "m.description=:desc where m.id=:id and m.user.id=:userId")
})
@Entity
@Table(name = "desires", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "date_time"}, name = "desires_unique_user_datetime_idx")})
public class Desire extends BaseEntity {  // Описание параметров бартера
    public static final String GET = "Desire.get";
    public static final String ALL_SORTED = "Desire.getAll";
    public static final String DELETE = "Desire.delete";
    public static final String GET_BETWEEN = "Desire.getBetween";

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime dateTime;

    @Column(name = "description", nullable = false)
    @NotEmpty
    private String description;

    @Column(name = "barter", nullable = false)
    @Range(min = 0, max = 5)
    private String barter;

    @Column(name = "categories", nullable = false)
    @NotEmpty
    private String categories;

    @ManyToOne(fetch = FetchType.LAZY)  // не нужно со всеми желаниями вытягивать юзера
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Desire() {

    }

    public Desire(LocalDateTime dateTime, String description, String barterPropose, String categories) {
        this(null, dateTime, description, barterPropose, categories);
    }

    public Desire(Integer id, LocalDateTime dateTime, String desireDescription, String barterPropose, String categories) {
        super(id);
        this.dateTime = dateTime;
        this.description = desireDescription;
        this.barter = barterPropose;
        this.categories = categories;
    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBarter(String barter) {
        this.barter = barter;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }


    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public String getBarter() {
        return barter;
    }

    public String getCategories() {
        return categories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Desire{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", barter='" + barter + '\'' +
                ", categories='" + categories + '\'' +
                '}';
    }


}
