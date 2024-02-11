package by.itacademy.user.controller.dto.audit;

import java.util.UUID;

public class AuditDto {

    private long dt_create;
    private AuditUserDto auditUserDto;
    private String text;
    private Type type;
    private String id;

    public AuditDto() {
    }

    public AuditDto(long dt_create, AuditUserDto auditUserDto, String text, Type type, String id) {
        this.dt_create = dt_create;
        this.auditUserDto = auditUserDto;
        this.text = text;
        this.type = type;
        this.id = id;
    }

    public long getDt_create() {
        return dt_create;
    }

    public void setDt_create(long dt_create) {
        this.dt_create = dt_create;
    }

    public AuditUserDto getAuditUserDto() {
        return auditUserDto;
    }

    public void setAuditUserDto(AuditUserDto auditUserDto) {
        this.auditUserDto = auditUserDto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
