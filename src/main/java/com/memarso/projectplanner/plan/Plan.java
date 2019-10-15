package com.memarso.projectplanner.plan;

import com.memarso.projectplanner.model.BaseEntity;
import com.memarso.projectplanner.model.Docs;
import com.memarso.projectplanner.model.Note;
import com.memarso.projectplanner.stakeholder.StakeHolder;
import com.memarso.projectplanner.task.Task;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Plan extends BaseEntity {
    private String name;
    private PlanType type;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Set<Task> tasks = new HashSet<>();
    @ManyToMany(mappedBy = "plans")
    private Set<StakeHolder> stakeHolders = new HashSet<>();
    //todo: add users
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Set<Docs> docs = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plan")
    private Set<Note> notes = new HashSet<>();
}
