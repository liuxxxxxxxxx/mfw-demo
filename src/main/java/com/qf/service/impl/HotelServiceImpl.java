package com.qf.service.impl;

import com.qf.dao.TbHotelDao;
import com.qf.pojo.po.TbHotel;
import com.qf.service.HotelService;
import com.qf.util.PagePro;
import org.apache.ibatis.session.SqlSessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @Author: HEJIE
 * @Time: 15:10 2018/12/19
 * @version: v1.0
 * 酒店的逻辑操作代码
 * listHotel方法通过当前页码和每页显示的条数获取展示到页面的json格式的酒店数据
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private TbHotelDao dao;
    @Override
    public PagePro<TbHotel> listsHotel(int currentPage, int pageCount) {
        PagePro<TbHotel> pageProduct=new PagePro<>();
        try{
            //得到该表的所有的记录条数
            int count=dao.getCount();
            //为分页类赋值
            pageProduct.setCurrentPage(currentPage);
            pageProduct.setPageProcuct(pageCount);
            pageProduct.setSumProduct(count);
            //获得分页的偏移量
            int offset=pageProduct.getOffset();
            //获取到该记录
            List<TbHotel> lists=dao.listTbHotel(offset,pageCount);
            pageProduct.setProduct(lists);
            return pageProduct;
        }catch(SqlSessionException e){
            return null;
        }

    }
}
