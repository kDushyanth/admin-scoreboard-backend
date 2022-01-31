package com.dush.gamesiitbbs.football.tournament_details.model;

import java.time.LocalDate;
import java.util.List;

import com.dush.gamesiitbbs.football.match.model.FootballMatch;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("football_tournament_details")
public class FootballTournamentDetails {
    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    List<FootballMatch> matches;
}
