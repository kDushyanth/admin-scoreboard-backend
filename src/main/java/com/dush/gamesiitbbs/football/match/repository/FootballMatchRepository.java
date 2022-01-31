package com.dush.gamesiitbbs.football.match.repository;

import com.dush.gamesiitbbs.football.match.model.FootballMatch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballMatchRepository extends CrudRepository<FootballMatch,String>{
}
