package com.dush.gamesiitbbs.football.match.service;

import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.football.match.model.FootballMatch;
import com.dush.gamesiitbbs.football.match.repository.FootballMatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballMatchService{
    @Autowired
    FootballMatchRepository footballMatchRepository;
    public Optional<FootballMatch> findFootballMatchById(String id){
        return footballMatchRepository.findById(id);
    }
    public Iterable<FootballMatch> findAllFootballMatches(){
        return footballMatchRepository.findAll();
    }
    public FootballMatch addFootballMatch(FootballMatch footballMatch){
        return footballMatchRepository.save(new FootballMatch(
            UUID.randomUUID().toString(),
            footballMatch.getNumber(),
            footballMatch.getTournamentId(),
            footballMatch.getTournamentName(),
            footballMatch.getDate(),
            footballMatch.getTeam1Name(),
            footballMatch.getTeam2Name(),
            footballMatch.getTeam1Goals(),
            footballMatch.getTeam2Goals()
        ));
    }
}
