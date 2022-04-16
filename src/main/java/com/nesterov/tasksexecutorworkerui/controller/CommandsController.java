package com.nesterov.tasksexecutorworkerui.controller;

import com.nesterov.tasksexecutorworkerui.dao.CommandsDao;
import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/command")
public class CommandsController {
    private final CommandsDao commandsDao;

    public CommandsController(CommandsDao commandsDao){
        this.commandsDao = commandsDao;
    }

    @PostMapping(value = "/add")
    public void addCommand(@ModelAttribute CommandData commandData){
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
