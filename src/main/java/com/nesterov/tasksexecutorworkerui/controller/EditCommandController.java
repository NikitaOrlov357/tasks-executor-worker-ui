package com.nesterov.tasksexecutorworkerui.controller;

import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/command")
public class EditCommandController {

    @PatchMapping(value = "/edit", consumes = "application/json")
    public void editCommand(@RequestBody CommandData commandData){
        log.info(commandData.toString());
    }
}
