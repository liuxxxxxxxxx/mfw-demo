package com.qf.service.impl;

import com.qf.dao.IndexDao;
import com.qf.pojo.po.TravelNote;
import com.qf.pojo.vo.PageVO;
import com.qf.pojo.vo.TravelVO;
import com.qf.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexDao indexDao;
    @Override
    public PageVO<TravelVO> listTravel(int pageIndex, int pageSize, int total) {
        //设置
        PageVO<TravelVO> pageVO = new PageVO<>();
        pageVO.setPageIndex(pageIndex);
        pageVO.setPageSize(pageSize);
        pageVO.setTotal(total);
        pageVO.setOffset((pageVO.getPageIndex()-1)*pageVO.getPageSize());

        //一共有几页
        pageVO.setTotalPage((int)Math.ceil(pageVO.getTotal()*1.0/pageSize));
        int offset = pageVO.getOffset();
        System.out.println(offset);
        List<TravelVO> travelVOS = null;

        try{
            travelVOS = indexDao.listTravel(offset,pageSize);
            pageVO.setDate(travelVOS);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pageVO;
    }

    @Override
    public int totalTravels() {
        try{
            return indexDao.totalTravels();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
