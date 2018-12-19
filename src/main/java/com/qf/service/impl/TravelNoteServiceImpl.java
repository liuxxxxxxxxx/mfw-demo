package com.qf.service.impl;

import com.qf.dao.TravelNoteDao;
import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;
import com.qf.service.TravelNoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelNoteServiceImpl implements TravelNoteService{
    private final static Logger logger = LoggerFactory.getLogger(TravelNoteServiceImpl.class);

    @Autowired
    private TravelNoteDao travelNoteDao;

    @Override
    public TravelNote getNoteById(String tid) {
        try {
            return travelNoteDao.getNoteById(tid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<TravelContent> getTravelNoteContent(String tid) {
        try{
            return travelNoteDao.getTravelNoteContent(tid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
