package com.ak98neon.todo.web;

import com.ak98neon.todo.task.TaskCreator;
import com.ak98neon.todo.web.dto.TaskDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/todo")
public class TodoApi {
    private TaskCreator taskCreator;

    public TodoApi(TaskCreator taskCreator) {
        this.taskCreator = taskCreator;
    }

    @PostMapping("/task")
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        return TaskDto.of(taskCreator.createTask(taskDto));
    }
}
