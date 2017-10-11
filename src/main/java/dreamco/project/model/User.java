package dreamco.project.model;

import dreamco.project.util.DesireUtil;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


import javax.persistence.*;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
@NamedQueries({
        @NamedQuery(name = User.DELETE, query = "DELETE FROM User u WHERE u.id=:id"),
        @NamedQuery(name = User.BY_EMAIL, query = "SELECT u FROM User u LEFT JOIN FETCH u.roles WHERE u.email=?1"),
        @NamedQuery(name = User.ALL_SORTED, query = "SELECT u FROM User u LEFT JOIN FETCH u.roles ORDER BY u.name, u.email"),
})
@Entity // Создает сущность
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "users_unique_email_idx")}) // Привязка класса к таблице
//@NamedQueries({@NamedQuery(name = "", query = "")}) // Выполняется на этапе загрузки Hibernate
public class User extends NamedEntity {

    public static final String DELETE = "User.delete";
    public static final String ALL_SORTED = "User.getAllSorted";
    public static final String BY_EMAIL = "User.getByEmail";

    @Column(name = "email", nullable = false, unique = true) //
    @Email                                                   // Связывает поле с колонкой в таблице
    @NotEmpty                                                //
    protected String email;                                  //

    @Column(name = "password", nullable = false)
    @NotEmpty
    @Length(min = 5)
    protected String password;

    @Column(name = "enabled", nullable = false)
    protected boolean enabled = true;

    @Column(name = "registered", columnDefinition = "timestamp default now()")
    protected Date registered = new Date();

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    protected Set<Role> roles;

    @Column(name = "count_barter", columnDefinition = "default 3")
    protected int countBarter = DesireUtil.DEFAULT_BARTER;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.getCountBarter(), u.isEnabled(), u.getRoles());
    }

    public User(Integer id, String name, String email, String password, Role role, Role... roles) {
        this(id, name, email, password, DesireUtil.DEFAULT_BARTER, true, EnumSet.of(role, roles));
    }

    public User(Integer id, String name, String email, String password, int countBarter, boolean enabled, Set<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.countBarter = countBarter;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCountBarter() {
        return countBarter;
    }

    public void setCountBarter(int countBarter) {
        this.countBarter = countBarter;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User (" +
                "id=" + id +
                ", email=" + email +
                ", name=" + name +
                ", enabled=" + enabled +
                ", roles=" + roles +
                ", countBarter=" + countBarter +
                ')';
    }
}
