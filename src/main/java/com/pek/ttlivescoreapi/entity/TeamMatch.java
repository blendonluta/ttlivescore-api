package com.pek.ttlivescoreapi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class TeamMatch {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne()
    private Event event;

    @ManyToOne()
    private Team team1;

    @ManyToOne()
    private Team team2;

}
