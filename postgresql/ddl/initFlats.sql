CREATE ROLE realtV1 WITH LOGIN PASSWORD 'HW)!WD%ey*@t)<C?dbxn2W-';
CREATE DATABASE flat
    WITH
    OWNER = realtV1
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
\connect flat;
CREATE SCHEMA realt
    AUTHORIZATION realtV1;
CREATE TABLE IF NOT EXISTS realt.flats(
    "id" text NOT NULL,
    "category" integer,
	"usd840" integer,
	"rub933" integer,
    "payment_status" integer,
    "raise_date" date,
    "created_at" date,
    "updated_at" date,
    seller text COLLATE pg_catalog."default",
    "state_region_name" text COLLATE pg_catalog."default",
    "state_district_name" text COLLATE pg_catalog."default",
    "town_name" text COLLATE pg_catalog."default",
    "town_district_name" text COLLATE pg_catalog."default",
    "town_sub_district_name" text COLLATE pg_catalog."default",
    "street_name" text COLLATE pg_catalog."default",
    "house_number" integer,
    "url" text COLLATE pg_catalog."default",
	"description" text COLLATE pg_catalog."default",
    "area_total" double precision,
    "rooms" integer,
    "storey" integer,
    imgs text,
    dt_create timestamp with time zone NOT NULL,
    dt_update timestamp with time zone NOT NULL,
	UNIQUE(url)
);
ALTER TABLE IF EXISTS realt.flats
    OWNER to realtv1;
CREATE SEQUENCE IF NOT EXISTS flat.realt.generator;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA realt to realtv1;