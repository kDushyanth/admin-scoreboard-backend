package com.dush.gamesiitbbs.football.tournament_details.repository;

import com.dush.gamesiitbbs.football.tournament_details.model.FootballTournamentDetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballTournamentDetailsRepository extends CrudRepository<FootballTournamentDetails,String>{
}
