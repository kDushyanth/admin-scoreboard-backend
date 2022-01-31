package com.dush.gamesiitbbs.football.tournament_details.service;

import com.dush.gamesiitbbs.football.tournament_details.model.FootballTournamentDetails;
import com.dush.gamesiitbbs.football.tournament_details.repository.FootballTournamentDetailsRepository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballTournamentDetailsService {
    @Autowired
    FootballTournamentDetailsRepository footballTournamentDetailsRepository;
    
    public Optional<FootballTournamentDetails>findFootballTournamentDetailsById(String id){
        return footballTournamentDetailsRepository.findById(id);
    } 
    public FootballTournamentDetails saveFootballTournamentDetails(FootballTournamentDetails footballTournamentDetails){
        FootballTournamentDetails _footballTournamentDetails = new FootballTournamentDetails(
            footballTournamentDetails.getId(),
            footballTournamentDetails.getName(),
            footballTournamentDetails.getStartDate(),
            footballTournamentDetails.getEndDate(),
            footballTournamentDetails.getMatches()
        );
        return footballTournamentDetailsRepository.save(_footballTournamentDetails);
    }
}
