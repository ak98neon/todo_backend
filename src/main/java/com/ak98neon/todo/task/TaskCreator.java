package com.ak98neon.todo.task;

import com.ak98neon.todo.web.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class TaskCreator {
    private TaskRepository taskRepository;

    public TaskCreator(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(TaskDto taskDto) {
        return taskRepository.saveAndFlush(taskDto.to());
    }

    public List<Task> getTasksByPeriod(String period) {
        OffsetDateTime timeByPeriod = getTimeByPeriod(period);
        return taskRepository.findAllByDate(timeByPeriod);
    }

    private OffsetDateTime getTimeByPeriod(String period) {
        if (period.equals("TODAY")) {
            return OffsetDateTime.now();
        } else if (period.equals("TOMORROW")) {
            return OffsetDateTime.now().plusDays(1);
        }
        return OffsetDateTime.now().plusDays(10);
    }
}
