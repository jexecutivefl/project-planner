package com.memarso.projectplanner.stakeholder;

import com.memarso.projectplanner.model.BaseEntity;
import com.memarso.projectplanner.model.Note;
import com.memarso.projectplanner.plan.Plan;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class StakeHolder extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stakeHolder")
    private Set<Note> notes = new HashSet<>();
    //todo:add user
    @ManyToMany
    private Set<Plan> plans = new HashSet<>();
}
