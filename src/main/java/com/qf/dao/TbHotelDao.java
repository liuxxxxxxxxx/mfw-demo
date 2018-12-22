package com.qf.dao;

import com.qf.pojo.po.TbHotel;
import com.qf.pojo.vo.HotelVo;
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

    int updateHotel(TbHotel tbHotel);

    int removeHotel(String hotel_id);

    int addHotel(TbHotel hotel);

    List<TbHotel> listSearchHotel(@Param("hotel_name")String hotel_name,@Param("offset")int offset,@Param("pageCount")int pageCount);

//    List<TbHotel> listSearchHotelAll(@Param("hotel")TbHotel hotel,@Param("offset")int offset, @Param("pageCount")int pageCount);
    List<TbHotel> listSearchHotelAll(TbHotel tbHotel);
}

