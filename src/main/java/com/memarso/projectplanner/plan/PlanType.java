package com.memarso.projectplanner.plan;

import com.memarso.projectplanner.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PlanType extends BaseEntity {
    private String type;
}
