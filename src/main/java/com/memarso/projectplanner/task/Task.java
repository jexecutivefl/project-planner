package com.memarso.projectplanner.task;

import com.memarso.projectplanner.model.*;
import com.memarso.projectplanner.plan.Plan;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Task extends BaseEntity {
    private String name;
    private String goal;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BigDecimal highCost = new BigDecimal(0.00);
    private BigDecimal lowCost = new BigDecimal(0.00);
    private int highTime;
    private int lowTime;
    private TimeType timeType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<Docs> docs = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<Link> links = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<Note> notes = new HashSet<>();

    @ManyToOne
    private Plan plan;

    //todo:add user
    //todo:add Owner
}
