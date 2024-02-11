package by.itacademy.user.dao;

import jakarta.persistence.*;

@Entity
@Table(name="status")
public class StatusDao {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_name")
    private Status status;

    public StatusDao() {
    }

    public StatusDao(Status status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusDao statusDao = (StatusDao) o;

        return status == statusDao.status;
    }

    @Override
    public int hashCode() {
        return status.hashCode();
    }
}
