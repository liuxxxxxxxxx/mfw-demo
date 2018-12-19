package com.qf.service;

import com.qf.pojo.po.TbHotel;
import com.qf.util.PagePro;

import java.util.List;

/**
 * @param
 * @Author: HEJIE
 * @Time: 15:08 2018/12/19
 * @version: v1.0
 */
public interface HotelService {
    PagePro<TbHotel> listsHotel(int currentPage, int pageCount);
}
