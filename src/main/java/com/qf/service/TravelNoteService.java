package com.qf.service;

import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;
import com.qf.pojo.vo.PageVO;
import com.qf.util.PageInfo;

import java.util.List;

public interface TravelNoteService {

    TravelNote getNoteById(String tid);

    List<TravelContent> getTravelNoteContent(String tid);

    int totalTravels(String searchVal);

    PageVO<TravelNote> pageListTravels(int pageIndex, int pageSize, int total,String searchVal);

    void removeTravelByTravelNoteId(String travelNoteId);

    void insertTravel(TravelNote travelNote);

    void editTravel(TravelNote travelNote);

    void removeTravels(String ids);
}
