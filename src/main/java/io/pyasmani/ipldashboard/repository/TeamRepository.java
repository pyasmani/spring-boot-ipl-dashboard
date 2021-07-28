package io.pyasmani.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.pyasmani.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
