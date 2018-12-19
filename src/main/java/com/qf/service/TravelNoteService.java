package com.qf.service;

import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;

import java.util.List;

public interface TravelNoteService {

    TravelNote getNoteById(String tid);

    List<TravelContent> getTravelNoteContent(String tid);
}
