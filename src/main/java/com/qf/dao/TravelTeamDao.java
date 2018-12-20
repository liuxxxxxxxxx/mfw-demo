package com.qf.dao;

import com.qf.pojo.po.TravelTeam;
import com.qf.pojo.vo.TeamSearchVo;
import com.qf.pojo.vo.TravelTeamPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelTeamDao {
    List<TravelTeam> listTravelTeams(TravelTeamPo travelTeamPo);
    int removeTravelTeam(@Param("travel_team_id") String travel_team_id);
    int saveTravelTeam(TravelTeam travelTeam);
    int updateTravelTeam(TravelTeam travelTeam);
    Long countTravelTeams(TravelTeamPo travelTeamPo);

    List<TravelTeam> listTravelTeamsByVo(@Param("teamSearchVo") TeamSearchVo teamSearchVo);
}
