package by.itacademy.user.dao;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "code")
public class VerificationCodeDAO {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "code_sg")
    @SequenceGenerator(name = "code_sg",sequenceName = "code_sg", allocationSize = 1)
    private int id;
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false,referencedColumnName = "uuid",name = "uuid")
    private User user;
    private String code;
    @Column(name = "dt_created_code")
    private LocalDateTime dtCreatedCode;

    public VerificationCodeDAO() {
    }

    public VerificationCodeDAO(User user, String code, LocalDateTime dtCreatedCode) {
        this.user = user;
        this.code = code;
        this.dtCreatedCode = dtCreatedCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getDtCreatedCode() {
        return dtCreatedCode;
    }

    public void setDtCreatedCode(LocalDateTime dtCreatedCode) {
        this.dtCreatedCode = dtCreatedCode;
    }
}
