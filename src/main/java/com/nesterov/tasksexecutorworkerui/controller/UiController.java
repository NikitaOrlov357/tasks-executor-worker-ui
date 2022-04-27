package com.nesterov.tasksexecutorworkerui.controller;

import com.nesterov.tasksexecutorworkerui.dao.CommandsDao;
import com.nesterov.tasksexecutorworkerui.dto.CommandData;
import com.nesterov.tasksexecutorworkerui.integrations.WorkerIntegrationsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/ui/command")
public class UiController {
    private final CommandsDao commandsDao;
    private final WorkerIntegrationsService workerIntegrationsService;

    @GetMapping(value = "/add")
    public String showAddingCommandPage(Model model) {
        model.addAttribute("commandData", new CommandData());
        model.addAttribute("commandsType", commandsDao.getAllTypes());
        model.addAttribute("regularity", workerIntegrationsService.getRegularity());
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
