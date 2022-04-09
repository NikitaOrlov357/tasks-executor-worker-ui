package com.nesterov.tasksexecutorworkerui.dao;

import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Slf4j
@Repository
public class CommandsDao {
    private final DataSource hikariDataSource;

    public CommandsDao(DataSource hikariDataSource) {
        this.hikariDataSource = hikariDataSource;
    }

    public void addCommand(CommandData commandData){
        String sql = " INSERT INTO commands (command, type, regularity, start, owner ) VALUES (?, ?, ?, ?, ?)";
        log.debug("sql = {} ", sql);
        getJdbcTemplate().update(
                sql,
                commandData.getCommand(),
                commandData.getType(),
                commandData.getRegularity(),
                commandData.getStart(),
                commandData.getOwner()
        );
    }

    public void deleteCommand(CommandData commandData){
        String sql = "DELETE FROM commands WHERE (id) = ?";
        log.debug("sql = {} ", sql);
        getJdbcTemplate().update(
                sql,
                commandData.getId()
        );
    }

    public void editCommand(CommandData commandData){
        String sql = "UPDATE commands SET command = ?, type = ?, regularity = ?, start = ?, owner = ? WHERE id = ?";
        log.debug("sql = {} ", sql);
        getJdbcTemplate().update(
                sql,
                commandData.getCommand(),
                commandData.getType(),
                commandData.getRegularity(),
                commandData.getStart(),
                commandData.getOwner(),
                commandData.getId()
        );
    }

    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(hikariDataSource);
    }

}
