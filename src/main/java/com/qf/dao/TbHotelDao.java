package com.qf.dao;

import com.qf.pojo.po.TbHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @param
 * @Author: HEJIE
 * @Time: 14:17 2018/12/19
 * @version: v1.0
 */
public interface TbHotelDao {
    List<TbHotel> listTbHotel(@Param("offset")int offset, @Param("pageCount")int pageCount);

    int getCount();
}
