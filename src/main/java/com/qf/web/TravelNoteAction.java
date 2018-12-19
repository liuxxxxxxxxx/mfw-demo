package com.qf.web;

import com.qf.pojo.po.TravelNote;
import com.qf.service.TravelNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
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



}
