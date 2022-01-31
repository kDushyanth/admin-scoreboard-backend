package com.dush.gamesiitbbs.football.tournament.repository;

import com.dush.gamesiitbbs.football.tournament.model.FootballTournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballTournamentRepository extends CrudRepository<FootballTournament,String>{
}
