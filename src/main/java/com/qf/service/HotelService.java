package com.qf.service;

import com.qf.pojo.po.TbHotel;
import com.qf.util.PagePro;

import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: HEJIE
 * @Time: 15:08 2018/12/19
 * @version: v1.0
 */
public interface HotelService {
    //dao
    PagePro<TbHotel> listsHotel(int currentPage, int pageCount);

    String updateHotel(Map map);

    String removeHotel(String hotel_id);

    String addHotel(Map map);
}
