package com.qf.dao;



import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelNoteDao {
    TravelNote getNoteById(String tid);

    List<TravelContent> getTravelNoteContent(String tid);

    int totalTravels(@Param(value = "travel_note_title")String travel_note_title);

    List<TravelNote> pageListTravels(@Param(value="offset")int offset, @Param(value = "pageSize") int pageSize,@Param(value = "travel_note_title")String travel_note_title);

    void removeTravelByTravelNoteId(String travelNoteId);

    void insertTravel(TravelNote travelNote);

    void editTravel(TravelNote travelNote);

    void removeTravels(List<String> list);
}
