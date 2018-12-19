package com.qf.dao;



import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;

import java.util.List;

public interface TravelNoteDao {
    TravelNote getNoteById(String tid);

    List<TravelContent> getTravelNoteContent(String tid);
}
