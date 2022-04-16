package com.nesterov.tasksexecutorworkerui.controller;

import com.nesterov.tasksexecutorworkerui.dao.CommandsDao;
import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/ui/command")
public class UiController {

    @GetMapping(value = "/add")
    public String showAddingCommandPage(Model model) {
        model.addAttribute("commandData", new CommandData());
        return "addingCommandPage";
    }

    @GetMapping(value = "/delete")
    public String showDeletingCommandPage(Model model) {
        model.addAttribute("commandData", new CommandData());
        return "deleteCommandPage";
    }
    @GetMapping(value = "/edit")
    public String showEditingCommandPage(Model model) {
        model.addAttribute("commandData", new CommandData());
        return "editCommandPage";
    }
}
