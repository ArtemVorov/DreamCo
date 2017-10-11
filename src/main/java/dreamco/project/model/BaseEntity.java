package dreamco.project.model;

import javax.persistence.*;

/**
 * User: temaprof
 * Date: 19.09.2016
 */

@MappedSuperclass // На каждый суперкласс отдельная таблица
@Access(AccessType.FIELD)
public class BaseEntity {
    public static final int START_SEQ = 100000;

    @Id                                                                                         //
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1)    // значение полю id будет присвоенно на основе global_seq
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")               //
    protected Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (this.id == null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        if (id == null || that.id == null) {
            return false;
        }
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return (id == null) ? 0 : id;
    }
}
