package com.qf.web;

import com.qf.pojo.po.*;
import com.qf.pojo.vo.HotelSearchVO;
import com.qf.service.HotelService;
import com.qf.util.PagePro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: HEJIE
 * @Time: 15:04 2018/12/19
 * @version: v1.0
 */
@Controller
public class HotelAction {
    @Autowired
    private HotelService service;

    @CrossOrigin
    @ResponseBody
    @GetMapping("allHotelByPage")
     public PagePro<TbHotel> getListsTbHotel(@RequestParam(defaultValue = "1")int currentPage,@RequestParam(defaultValue = "10")int pageCount){

        PagePro<TbHotel> tbHotels = service.listsHotel(currentPage, pageCount);
       /* String main_facility = tbHotels.getProduct().get(0).getMain_facility();
        String substring = main_facility.substring(1, main_facility.length() - 1).replace("'","");
        String[] split = substring.split(",");
        for(String str:split){
            System.out.println(str);
        }*/
        return tbHotels;
    }
    @CrossOrigin
    @PostMapping("updateHotel")
    @ResponseBody
    public String updateHotel(@RequestBody Map map){
        String result = service.updateHotel(map);
        return result;
    }

    @CrossOrigin
    @ResponseBody
    @DeleteMapping("removeHotel/{delId}")
    public String removeHotel(@PathVariable("delId")String delId){
        return service.removeHotel(delId);
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("addHotel")
    public String addHotel(@RequestBody Map map){
        String result = service.addHotel(map);
        return result;
    }
    @GetMapping("jspgetListsTbHotel")
    public String jspGetListsTbHotel(@RequestParam(defaultValue = "1")int currentPage, @RequestParam(defaultValue = "10")int pageCount, Model model){
        PagePro<TbHotel> tbHotels = service.listsHotel(currentPage, pageCount);
        model.addAttribute("hotels",tbHotels);
        return "hotel_index";
    }
    @GetMapping("allServiceTb")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> allServiceTb(){
        Map<String,Object> map=new HashMap<>();
        List<TbHotelFacility> tbHotelFacility=service.ListTbHotelFacility();
        List<TbHotelMainFacility> tbHotelMainFacility=service.TbHotelMainFacility();
        List<TbHotelService> tbHotelService=service.TbHotelService();
        List<TbRoomFacility> tbRoomFacility=service.TbRoomFacility();
        map.put("tbHotelFacility",tbHotelFacility);
        map.put("tbHotelMainFacility",tbHotelMainFacility);
        map.put("tbHotelService",tbHotelService);
        map.put("tbRoomFacility",tbRoomFacility);
        return map;
    }
    @GetMapping("searchHotel")
    @ResponseBody
    @CrossOrigin
    public PagePro<TbHotel> getListsTbHotelBySearch(HotelSearchVO search,@RequestParam(defaultValue = "1")int currentPage,@RequestParam(defaultValue = "10")int pageCount){
        //ubuntuTest
        return service.getListsTbHotelBySearch(search,currentPage,pageCount);
    }
}
