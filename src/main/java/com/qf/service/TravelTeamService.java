package com.qf.service;

import com.qf.pojo.po.TravelTeam;
import com.qf.pojo.vo.TeamSearchVo;
import com.qf.pojo.vo.TravelTeamPo;

import java.util.List;

public interface TravelTeamService {
    List<TravelTeam> listTravelTeams(TravelTeamPo travelTeamPo);
    int removeTravelTeam(String travel_team_id);
    int saveTravelTeam(TravelTeam travelTeam);
    int updateTravelTeam(TravelTeam travelTeam);
    int countTravelTeams(TravelTeamPo travelTeamPo);
    List<TravelTeam> listTravelTeamsByVo(TeamSearchVo teamSearchVo);
}
