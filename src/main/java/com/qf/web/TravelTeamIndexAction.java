package com.qf.web;

import com.qf.pojo.po.TravelTeam;
import com.qf.pojo.vo.TeamSearchVo;
import com.qf.service.TravelTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class TravelTeamIndexAction {

    @Autowired
    private TravelTeamService travelTeamServiceImpl;

    @GetMapping("/travelTeamIndex")
    public String travelTeamIndex(Model model){
        TeamSearchVo teamSearchVo=null;
        List<TravelTeam> travelTeams=travelTeamServiceImpl.listTravelTeamsByVo(teamSearchVo);
        System.out.println(travelTeams);
        model.addAttribute("travelTeams",travelTeams);
        return "travel_team";
    }

    @GetMapping("/travelTeams")
    public String listTravelTeamsByVo(Model model, TeamSearchVo teamSearchVo){
        List<TravelTeam> list=travelTeamServiceImpl.listTravelTeamsByVo(teamSearchVo);
        System.out.println(list);
        model.addAttribute("travelTeams",list);
        return "travel_team";
    }
}
