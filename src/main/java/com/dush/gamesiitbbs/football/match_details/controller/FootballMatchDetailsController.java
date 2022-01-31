package com.dush.gamesiitbbs.football.match_details.controller;

import java.util.Optional;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatchDetails;
import com.dush.gamesiitbbs.football.match_details.service.FootballMatchDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballMatchDetailsController {

    @Autowired
    FootballMatchDetailsService footballMatchService;

    @GetMapping("/api/football-match-details/{match-id}")
    public ResponseEntity<FootballMatchDetails> getFootballMatchById(@PathVariable("match-id") String matchId){
        Optional<FootballMatchDetails> _footballMatch = footballMatchService.findFootballMatchById(matchId);
        return _footballMatch.map(match -> ResponseEntity.ok().body(match))
                             .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("/api/football-match-details/")
    public ResponseEntity<FootballMatchDetails> saveFootballMatch(@RequestBody FootballMatchDetails footballMatch){
        FootballMatchDetails _footballMatch = footballMatchService.saveFootballMatch(footballMatch);
        return new ResponseEntity<FootballMatchDetails>(_footballMatch,HttpStatus.CREATED);
    }

}
