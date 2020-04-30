package com.ak98neon.todo.web.dto;

import com.ak98neon.todo.support.Dates;
import com.ak98neon.todo.task.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private String name;
    private String description;
    private String date;

    public static TaskDto of(Task task) {
        return new TaskDto(
                task.getName(),
                task.getDescription(),
                task.getDate().toString()
        );
    }

    public Task to() {
        return new Task(
                getName(),
                getDescription(),
                Dates.stringToDate(getDate())
        );
    }
}
