package com.ak98neon.todo.task;

import com.ak98neon.todo.model.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task extends Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private OffsetDateTime date;

    public Task(OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        super(createdAt, updatedAt);
    }

    public Task(final String name, final String description, final OffsetDateTime date) {
        super(OffsetDateTime.now(), OffsetDateTime.now());
        this.name = name;
        this.description = description;
        this.date = date;
    }
}
