package by.itacademy.audit.dao;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user", schema = "logs")
public class UserDao {

    @Id
    @SequenceGenerator(name = "user_gen", sequenceName = "user_sg", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    private Long id;

    private UUID uuid;
    private String mail;
    private String fio;
    private String role;

    public UserDao() {
    }

    public UserDao(UUID uuid, String mail, String fio, String role) {
        this.uuid = uuid;
        this.mail = mail;
        this.fio = fio;
        this.role = role;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDao userDao = (UserDao) o;

        if (!uuid.equals(userDao.uuid)) return false;
        if (!mail.equals(userDao.mail)) return false;
        if (!fio.equals(userDao.fio)) return false;
        return role.equals(userDao.role);
    }

    @Override
    public int hashCode() {
        int result = uuid.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + fio.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }
}
