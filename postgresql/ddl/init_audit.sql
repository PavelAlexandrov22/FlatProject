CREATE ROLE auditor WITH LOGIN PASSWORD 'Eu2WA&kdcFJayGtWS6uZYrG59';

CREATE DATABASE audit
    WITH
    OWNER = realtv1
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
\connect audit;

CREATE SCHEMA logs AUTHORIZATION auditor;

CREATE TABLE logs.role
(id bigint NOT NULL,
 type_name text NOT NULL,
 UNIQUE (type_name),
 PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS "audit".logs.type_sg OWNED BY logs.role.id;
ALTER TABLE IF EXISTS logs.role OWNER to auditor;

INSERT INTO logs.role(
    id, type_name)
VALUES
    (nextval('logs.type_sg'), 'USER'),
    (nextval('logs.type_sg'), 'REPORT');

CREATE TABLE logs.user
(
	id bigint NOT NULL,
    uuid UUID NOT NULL,
    mail text NOT NULL,
    fio text NOT NULL,
	role text NOT NULL,
    PRIMARY KEY (id)
);	

CREATE SEQUENCE IF NOT EXISTS "audit".logs.user_sg OWNED BY logs.user.id;
ALTER TABLE IF EXISTS logs.user OWNER to auditor;

CREATE TABLE logs.t_audit
(
	id bigint NOT NULL,
    uuid UUID,
	dt_create timestamp with time zone NOT NULL,
	t_user bigint REFERENCES logs.user (id),
	t_text text,
	t_type bigint REFERENCES logs.role (id),
    id_string text NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS "audit".logs.t_audit_sg OWNED BY logs.t_audit.id;
ALTER TABLE IF EXISTS logs.t_audit OWNER to auditor;