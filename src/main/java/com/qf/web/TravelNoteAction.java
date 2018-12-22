package com.qf.web;

import com.qf.pojo.po.TravelNote;
import com.qf.pojo.vo.PageVO;
import com.qf.service.TravelNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/travel")
public class TravelNoteAction {

    @Autowired
    private TravelNoteService travelNoteService;

    @GetMapping("/travelnote/{id}")
    public String getTravelNote(@PathVariable String id){
        System.out.println(id);
        TravelNote noteById = travelNoteService.getNoteById(id);
        noteById.setTravelContent(travelNoteService.getTravelNoteContent(id));
        System.out.println(noteById);

        return null;
    }

    @PostMapping("/listTravels")
    public PageVO<TravelNote> listTravels(@RequestBody Map map){
        //获取当前页
        int pageIndex = 1;
        Object param1 = map.get("pageIndex");
        if (param1!=null){
            pageIndex = (int)param1;
        }
        //获取每页显示个数
        int pageSize = 5;
        Object param2 = map.get("pageSize");
        if(param2!=null){
            pageSize = (int)param2;
        }
        //搜索商品
        String searchVal = (String) map.get("searchVal");
        System.out.println(searchVal);
        //求出商品总数
        int total = travelNoteService.totalTravels(searchVal);
        //获得分页
        PageVO<TravelNote> pageVO = travelNoteService.pageListTravels(pageIndex,pageSize,total,searchVal);
        System.out.println(pageVO);
        return pageVO;
    }

    @DeleteMapping("/removeTravel")
    public void removeTravel(@RequestBody Map map){
        String travelNoteId = (String)map.get("travelNoteId");
        System.out.println("travelNoteId"+travelNoteId);
        travelNoteService.removeTravelByTravelNoteId(travelNoteId);
    }

    //批量删除用户
    @PostMapping("/removeTravels")
    public void removeTravels(@RequestBody Map map){
        String ids = (String)map.get("ids");
        System.out.println(ids);
        travelNoteService.removeTravels(ids);
    }

    @PostMapping("/insertTravel")
    public void insertTravel(@RequestBody Map map){
        TravelNote travelNote = new TravelNote();
        travelNote.setTravelNoteId(UUID.randomUUID().toString());
        travelNote.setTravelNoteTitle((String)map.get("travelNoteTitle"));
        travelNote.setTravelNoteBanner((String)map.get("travelNoteBanner"));
        travelNote.setTravelNoteBeginTime((String)map.get("travelNoteBeginTime"));
        travelNote.setTravelNotePeriod((int)map.get("travelNotePeriod"));
        travelNote.setTravelNotePrice((int)map.get("travelNotePrice"));
        travelNote.setTravelNoteStyle((String)map.get("travelNoteStyle"));
        travelNote.setTravelNoteDestination((String)map.get("travelNoteDestination"));

        System.out.println(travelNote);
        travelNoteService.insertTravel(travelNote);
    }

    @PutMapping("/editTravel")
    public void editTravel(@RequestBody Map map){
        TravelNote travelNote = new TravelNote();
        travelNote.setTravelNoteId((String)map.get("travelNoteId"));
        travelNote.setTravelNoteTitle((String)map.get("travelNoteTitle"));
        travelNote.setTravelNoteBanner((String)map.get("travelNoteBanner"));
        travelNote.setTravelNoteBeginTime((String)map.get("travelNoteBeginTime"));
        travelNote.setTravelNotePeriod((int)map.get("travelNotePeriod"));
        travelNote.setTravelNotePrice((int)map.get("travelNotePrice"));
        travelNote.setTravelNoteStyle((String)map.get("travelNoteStyle"));
        travelNote.setTravelNoteDestination((String)map.get("travelNoteDestination"));

        System.out.println(travelNote);
        travelNoteService.editTravel(travelNote);
    }
}
