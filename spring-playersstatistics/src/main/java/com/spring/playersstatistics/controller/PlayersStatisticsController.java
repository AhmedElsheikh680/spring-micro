package com.spring.playersstatistics.controller;


import com.spring.playersstatistics.config.PlayersStatisticsConfig;
import com.spring.playersstatistics.model.PlayersStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PlayersStatisticsController {

    @Autowired

    private PlayersStatisticsConfig playersStatisticsConfig;

    @GetMapping("/players")
    public PlayersStatistics getPlayersStatistics(){
        return  new PlayersStatistics(playersStatisticsConfig.getNumberTeams(), playersStatisticsConfig.getNumberPlayers(), playersStatisticsConfig.getCountry());
    }
}
