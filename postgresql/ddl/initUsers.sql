CREATE ROLE secmanager WITH LOGIN PASSWORD 'Eu2WA&kdcFJayGtWS6uZYrG59';
CREATE DATABASE "user-service"
WITH
    OWNER = secmanager
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


\connect "user-service";

CREATE SCHEMA security AUTHORIZATION secmanager;

CREATE TABLE security.role
(id bigint NOT NULL,
 role_name text NOT NULL,
 UNIQUE (role_name),
 PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS "user-service".security.role_sg OWNED BY security.role.id;
ALTER TABLE IF EXISTS security.role OWNER to secmanager;

CREATE TABLE security.status
(
    id bigint NOT NULL,
    status_name text NOT NULL,
    UNIQUE (status_name),
    PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS "user-service".security.status_sg OWNED BY security.status.id;
ALTER TABLE IF EXISTS security.status OWNER to secmanager;

CREATE TABLE security.users
(
    uuid UUID DEFAULT gen_random_uuid (),
    mail text NOT NULL,
    fio text NOT NULL,
    password text NOT NULL,
    dt_create timestamp with time zone NOT NULL,
    dt_update timestamp with time zone NOT NULL,
    role bigint REFERENCES security.role (id),
    status bigint REFERENCES security.status (id),
    UNIQUE (mail),
    PRIMARY KEY (uuid)
);

ALTER TABLE IF EXISTS security.users OWNER to secmanager;

CREATE TABLE security.code
(
    id bigint NOT NULL,
    uuid UUID REFERENCES security.users (uuid),
    code text NOT NULL,
    dt_created_code timestamp with time zone NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS "user-service".security.code_sg OWNED BY security.code.id;
ALTER TABLE IF EXISTS security.code OWNER to secmanager;
ALTER TABLE security.code ALTER COLUMN id SET DEFAULT nextval('security.code_sg');

GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA security to secmanager;

INSERT INTO security.role(
    id, role_name)
VALUES
    (nextval('security.role_sg'), 'ADMIN'),
    (nextval('security.role_sg'), 'USER'),
    (nextval('security.role_sg'), 'MANAGER');

INSERT INTO security.status(
    id, status_name)
VALUES
    (nextval('security.status_sg'), 'WAITING_ACTIVATION'),
    (nextval('security.status_sg'), 'ACTIVATED'),
    (nextval('security.status_sg'), 'DEACTIVATED');

INSERT INTO security.users(
    mail, fio, password, dt_create, dt_update, role, status)
VALUES ('admin@flats.itAcademy.by', 'admin', '$2a$10$Iyl5ELwGVQ3XP5zlYKoM/uvxG.iVckAsjYh9i7tfH8iO6.LoDGPsq', now(), now(), (select id from security.role where role_name='ADMIN'), (select id from security.status where status_name='ACTIVATED'));

