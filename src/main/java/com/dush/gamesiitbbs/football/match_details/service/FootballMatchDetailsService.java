package com.dush.gamesiitbbs.football.match_details.service;

import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatchDetails;
import com.dush.gamesiitbbs.football.match_details.repository.FootballMatchDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballMatchDetailsService {
    
    @Autowired
    private FootballMatchDetailsRepository footballMatchRepository;
    public FootballMatchDetails saveFootballMatch(FootballMatchDetails footballMatch){
        return footballMatchRepository.save(new FootballMatchDetails(
            footballMatch.getId(),
            footballMatch.getNumber(),
            footballMatch.getTournamentId(),
            footballMatch.getTournamentName(),
            footballMatch.getDate(),
            footballMatch.getFootballTeamScores()
        ));
    }
    public Optional<FootballMatchDetails> findFootballMatchById(String id){
        return footballMatchRepository.findById(id);
    }
}
