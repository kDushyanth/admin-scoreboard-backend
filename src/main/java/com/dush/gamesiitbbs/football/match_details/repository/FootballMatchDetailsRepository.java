package com.dush.gamesiitbbs.football.match_details.repository;

import com.dush.gamesiitbbs.football.match_details.model.FootballMatchDetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballMatchDetailsRepository extends CrudRepository<FootballMatchDetails,String>{
}
