package com.qf.web;

import com.qf.pojo.po.TravelTeam;
import com.qf.pojo.vo.TravelTeamPo;
import com.qf.service.TravelTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class TravelTeamAction {

    @Autowired
    private TravelTeamService travelTeamServiceImpl;

    //获得分页搜索数据
    @ResponseBody
    @GetMapping("/listTravelTeams")
    public Map<String,Object> listTravelTeams(TravelTeamPo travelTeamPo){
        Map<String,Object> map=new HashMap<>();
        int total=travelTeamServiceImpl.countTravelTeams(travelTeamPo);
        //解决搜索跳页问题
        int c=(total+travelTeamPo.getPageSize()-1)/travelTeamPo.getPageSize();
        if((c-1)*travelTeamPo.getPageSize()<travelTeamPo.getOffset()){
            travelTeamPo.setOffset((c-1)*travelTeamPo.getPageSize());
        }
        List<TravelTeam> travelTeams = travelTeamServiceImpl.listTravelTeams(travelTeamPo);
        map.put("data",travelTeams);
        map.put("total",total);
        return  map;
    };
    //删除指定数据
    @ResponseBody
    @DeleteMapping("/removeTravelTeam/{travel_team_id}")
    public int removeTravelTeam(@PathVariable("travel_team_id") String travel_team_id){
        int i = travelTeamServiceImpl.removeTravelTeam(travel_team_id);
        return i;
    };
    //新增数据
    @ResponseBody
    @PostMapping("/saveTravelTeam")
    public  int saveTravelTeam(TravelTeam travelTeam){
        int i = travelTeamServiceImpl.saveTravelTeam(travelTeam);
        return i;
    };
    //修改数据
    @ResponseBody
    @PostMapping("/updateTravelTeam")
    public  int updateTravelTeam(TravelTeam travelTeam){
        int i=0;
        if(travelTeam.getTravel_team_id()!=null) {
            i = travelTeamServiceImpl.updateTravelTeam(travelTeam);
        }
        return i;
    };
}
