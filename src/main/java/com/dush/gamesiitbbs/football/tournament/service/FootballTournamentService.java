package com.dush.gamesiitbbs.football.tournament.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dush.gamesiitbbs.football.tournament.model.FootballTournament;
import com.dush.gamesiitbbs.football.tournament.repository.FootballTournamentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballTournamentService {
    
    @Autowired
    private FootballTournamentRepository footballTournamentRepository;

    public FootballTournament saveFootballTournament(FootballTournament footballTournament){
        //footballTournament.toString();
        
        return footballTournamentRepository.save(new FootballTournament(
            UUID.randomUUID().toString(),
            footballTournament.getName(),
            footballTournament.getStartDate(),
            footballTournament.getEndDate()
        ));
    }
    public Optional<FootballTournament> findFootballTournamentById(String id){
        return footballTournamentRepository.findById(id);
    }
    public List<FootballTournament> findAllFootballTournaments(){
        List<FootballTournament> _footballTournaments = new ArrayList<>();
        footballTournamentRepository.findAll().forEach(_footballTournament -> _footballTournaments.add(_footballTournament));
        return _footballTournaments;
    }
}
