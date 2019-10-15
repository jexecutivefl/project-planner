package com.memarso.projectplanner.model;

import com.memarso.projectplanner.plan.Plan;
import com.memarso.projectplanner.stakeholder.StakeHolder;
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
public class Note extends BaseEntity {
    private String note;
    @ManyToOne
    private Plan plan;
    @ManyToOne
    private StakeHolder stakeHolder;
    @ManyToOne
    private Task task;
}
