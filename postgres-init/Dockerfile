FROM postgres

ENV POSTGRES_PASSWORD 00zomifi

ENV POSTGRES_DB moonlight

EXPOSE 5432

ADD users-table.sql /docker-entrypoint-initdb.d/