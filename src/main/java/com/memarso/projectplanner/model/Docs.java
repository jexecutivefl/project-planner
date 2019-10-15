package com.memarso.projectplanner.model;

import com.memarso.projectplanner.plan.Plan;
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
public class Docs extends BaseEntity {
    private String file;
    @ManyToOne
    private Plan plan;
    @ManyToOne
    private Task task;
}
