package com.qf.service.impl;

import com.qf.dao.TravelNoteDao;
import com.qf.pojo.po.TravelContent;
import com.qf.pojo.po.TravelNote;
import com.qf.pojo.vo.PageVO;
import com.qf.service.TravelNoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public int totalTravels(String searchVal) {
        try{
            return travelNoteDao.totalTravels(searchVal);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public PageVO<TravelNote> pageListTravels(int pageIndex, int pageSize, int total,String searchVal) {
        //设置
        PageVO<TravelNote> pageVO = new PageVO<>();
        pageVO.setPageIndex(pageIndex);
        pageVO.setPageSize(pageSize);
        pageVO.setTotal(total);
        pageVO.setOffset((pageVO.getPageIndex()-1)*pageVO.getPageSize());
        int offset = pageVO.getOffset();
        System.out.println(offset);
        List<TravelNote> travelNotes = null;

        try{
            travelNotes = travelNoteDao.pageListTravels(offset,pageSize,searchVal);
            pageVO.setDate(travelNotes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pageVO;
    }

    @Override
    public void removeTravelByTravelNoteId(String travelNoteId) {
        try{
            travelNoteDao.removeTravelByTravelNoteId(travelNoteId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void removeTravels(String ids) {
        try{
            String[] split = ids.split(",");
            List<String> list = new ArrayList();
            for (int i=0;i<split.length;i++){
                list.add(split[i]);
            }
            travelNoteDao.removeTravels(list);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertTravel(TravelNote travelNote) {
        try{
            travelNoteDao.insertTravel(travelNote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void editTravel(TravelNote travelNote) {
        try{
            travelNoteDao.editTravel(travelNote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
