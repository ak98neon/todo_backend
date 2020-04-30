package com.ak98neon.todo.task;

import com.ak98neon.todo.web.dto.TaskDto;
import org.springframework.stereotype.Service;

@Service
public class TaskCreator {
    private TaskRepository taskRepository;

    public TaskCreator(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(TaskDto taskDto) {
        return taskRepository.saveAndFlush(taskDto.to());
    }
}
