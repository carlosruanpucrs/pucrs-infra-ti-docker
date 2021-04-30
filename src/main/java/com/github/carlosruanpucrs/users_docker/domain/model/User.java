package com.github.carlosruanpucrs.users_docker.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
public class User implements Serializable {

    private Integer id;
    private String name;
    private String soccerTeam;
    private String idol;
    private Integer idade;

}
