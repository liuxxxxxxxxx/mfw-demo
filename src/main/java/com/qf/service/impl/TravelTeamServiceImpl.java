package com.qf.service.impl;

import com.qf.dao.TravelTeamDao;
import com.qf.pojo.po.TravelTeam;
import com.qf.pojo.vo.TravelTeamPo;
import com.qf.service.TravelTeamService;
import com.qf.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelTeamServiceImpl implements TravelTeamService {

    @Autowired
    private TravelTeamDao travelTeamDao;

    @Override
    public List<TravelTeam> listTravelTeams(TravelTeamPo travelTeamPo) {
        return travelTeamDao.listTravelTeams(travelTeamPo);
    }

    @Override
    public int removeTravelTeam(String travel_team_id) {
        return travelTeamDao.removeTravelTeam(travel_team_id);
    }

    @Override
    public int saveTravelTeam(TravelTeam travelTeam) {
        travelTeam.setTravel_team_id(RandomUtil.getRandomStringByCharAndNumber(16));
        if(travelTeam.getTravel_team_img()==null||travelTeam.getTravel_team_img()==""){
            travelTeam.setTravel_team_img("https://i.loli.net/2017/08/21/599a521472424.jpg");
        }
        travelTeam.setTravel_team_peoples(0);
        travelTeam.setTravel_team_collects(0);
        return travelTeamDao.saveTravelTeam(travelTeam);
    }

    @Override
    public int updateTravelTeam(TravelTeam travelTeam) {
        return travelTeamDao.updateTravelTeam(travelTeam);
    }

    @Override
    public int countTravelTeams(TravelTeamPo travelTeamPo) {
        Long l=travelTeamDao.countTravelTeams(travelTeamPo);
        return l.intValue();
    }
}
