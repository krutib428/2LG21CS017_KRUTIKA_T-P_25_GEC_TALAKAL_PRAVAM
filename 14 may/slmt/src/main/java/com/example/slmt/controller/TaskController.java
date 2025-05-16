package com.example.slmt.controller;

import com.example.slmt.model.Task;
import com.example.slmt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasklist")
    public String showTaskList(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        model.addAttribute("task", new Task()); // for form binding
        return "tasklist";
    }

    @PostMapping("/addtask")
    public String addTask(@ModelAttribute("task") Task task) {
        task.setRole("Member"); // default role
        taskService.saveTask(task);
        return "redirect:/tasklist";
    }
}