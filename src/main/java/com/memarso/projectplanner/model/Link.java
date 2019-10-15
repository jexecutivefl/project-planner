package com.memarso.projectplanner.model;

import com.memarso.projectplanner.task.Task;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Link extends  BaseEntity {
    private String link;
    @ManyToOne
    private Task task;
}
