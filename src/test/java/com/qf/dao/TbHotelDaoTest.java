package com.qf.dao;

import com.qf.pojo.po.TbHotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @param
 * @Author: HEJIE
 * @Time: 14:27 2018/12/19
 * @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TbHotelDaoTest {
    @Autowired
    private TbHotelDao dao;

    @Test
    public void listTbHotel() {
        List<TbHotel> tbHotels = dao.listTbHotel(0, 100);
        System.out.println(tbHotels.size());
    }

    @Test
    public void getCount() {
        int count=dao.getCount();
        System.out.println(count);
    }
}