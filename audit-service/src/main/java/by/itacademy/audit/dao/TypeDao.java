package by.itacademy.audit.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class TypeDao {

    @Id
    @SequenceGenerator(name = "type_sg")
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="type_name")
    private Type type;

    public TypeDao() {
    }

    public TypeDao(Type type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
