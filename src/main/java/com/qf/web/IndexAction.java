package com.qf.web;

import com.qf.pojo.vo.PageVO;
import com.qf.pojo.vo.TravelVO;
import com.qf.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexAction {
    @Autowired
    private IndexService indexService;
    //去首页
    @GetMapping("/index")
    public String index(Model model){
        //当前页
        int pageIndex = 1;

        //每页显示个数
        int pageSize = 10;

        int total = indexService.totalTravels();
        PageVO<TravelVO> pageVO = indexService.listTravel(pageIndex,pageSize,total);
        model.addAttribute("total",pageVO.getTotal());
        model.addAttribute("travelVOList",pageVO.getDate());
        model.addAttribute("totalPage",pageVO.getTotalPage());
        model.addAttribute("pageIndex",pageIndex);
        return "index";
    }
}
