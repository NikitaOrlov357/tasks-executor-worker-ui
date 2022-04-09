package com.nesterov.tasksexecutorworkerui.controller;

import com.nesterov.tasksexecutorworkerui.dao.CommandsDao;
import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/command")
public class EditCommandController {
    CommandsDao commandsDao;

    public EditCommandController(CommandsDao commandsDao){
        this.commandsDao = commandsDao;
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public void addCommand(@RequestBody CommandData commandData){
        commandsDao.addCommand(commandData);
        log.info(commandData.toString());
    }

    @DeleteMapping(value = "/delete", consumes = "application/json")
    public void deleteCommand(@RequestBody CommandData commandData){
        commandsDao.deleteCommand(commandData);
        log.info(commandData.toString());
    }

    @PatchMapping(value = "/edit", consumes = "application/json")
    public void editCommand(@RequestBody CommandData commandData){
        commandsDao.editCommand(commandData);
        log.info(commandData.toString());
    }
}
