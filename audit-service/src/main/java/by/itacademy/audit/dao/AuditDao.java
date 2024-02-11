package by.itacademy.audit.dao;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "t_audit")
public class AuditDao {
    @Id
    @SequenceGenerator(name = "audit_gen", sequenceName = "t_audit_sg", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_gen")
    @Column(name = "id")
    private int id;
    private UUID uuid;
    @Column(name = "dt_create")
    private LocalDateTime dtCreate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "t_user", referencedColumnName = "id")
    private UserDao userDao;
    @Column(name = "t_text")
    private String text;
    @ManyToOne()
    @JoinColumn(name = "t_type", referencedColumnName = "id")
    private TypeDao typeDao;
    @Column(name = "id_string")
    private String idString;

    public AuditDao() {
    }

    public AuditDao(UUID uuid, LocalDateTime dtCreate, UserDao userDao, String text, TypeDao typeDao, String idString) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.userDao = userDao;
        this.text = text;
        this.typeDao = typeDao;
        this.idString = idString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TypeDao getTypeDao() {
        return typeDao;
    }

    public void setTypeDao(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }
}
