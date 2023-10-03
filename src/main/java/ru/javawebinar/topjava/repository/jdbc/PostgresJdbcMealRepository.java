package ru.javawebinar.topjava.repository.jdbc;

import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

import static ru.javawebinar.topjava.Profiles.POSTGRES_DB;

@Repository
@Profile(POSTGRES_DB)
public class PostgresJdbcMealRepository extends AbstractJdbcMealRepository<LocalDateTime> {
    public PostgresJdbcMealRepository(final JdbcTemplate jdbcTemplate, final NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        super(jdbcTemplate, namedParameterJdbcTemplate);
    }

    @Override
    protected LocalDateTime getDate(final LocalDateTime localDateTime) {
        return localDateTime;
    }
}
