package com.dush.gamesiitbbs.football.match_details.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballTeamScore {
    private String name;
    private int goals;
    private List<FootballPlayerScore> footballPlayerScores;
}
