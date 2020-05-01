package com.ak98neon.todo.web;

import com.ak98neon.todo.task.TaskCreator;
import com.ak98neon.todo.web.dto.TaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1/todo")
@Slf4j
public class TodoApi {
    private TaskCreator taskCreator;

    public TodoApi(TaskCreator taskCreator) {
        this.taskCreator = taskCreator;
    }

    @PostMapping("/tasks")
    @ResponseStatus(code = HttpStatus.CREATED)
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        return TaskDto.of(taskCreator.createTask(taskDto));
    }

    @GetMapping("/tasks")
    public List<TaskDto> getTasks(@PathParam("period") String period) {
        return TaskDto.toListDto(taskCreator.getTasksByPeriod(period));
    }
}
