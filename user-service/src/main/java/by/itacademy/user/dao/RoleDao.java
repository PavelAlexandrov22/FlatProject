package by.itacademy.user.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class RoleDao {

    @Id
    @SequenceGenerator(name = "role_sg")
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="role_name")
    private Role role;

    public RoleDao() {
    }

    public RoleDao(Role role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleDao roleDao = (RoleDao) o;

        return role == roleDao.role;
    }

    @Override
    public int hashCode() {
        return role.hashCode();
    }
}
