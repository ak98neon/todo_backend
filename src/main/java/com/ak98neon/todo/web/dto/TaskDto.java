package com.ak98neon.todo.web.dto;

import com.ak98neon.todo.support.Dates;
import com.ak98neon.todo.task.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private Long id;
    private String name;
    private String description;
    private String date;

    public static TaskDto of(Task task) {
        return new TaskDto(
                task.getId(),
                task.getName(),
                task.getDescription(),
                task.getDate().toString()
        );
    }

    public static List<TaskDto> toListDto(List<Task> tasks) {
        return tasks.stream()
                .map(TaskDto::of)
                .collect(Collectors.toList());
    }

    public Task to() {
        return new Task(
                getName(),
                getDescription(),
                Dates.stringToDate(getDate())
        );
    }
}
