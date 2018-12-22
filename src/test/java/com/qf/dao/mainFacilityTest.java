package com.qf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @param
 * @Author: HEJIE
 * @Time: 17:57 2018/12/22
 * @version: v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class mainFacilityTest {
    @Autowired
    MainFacility dao;
    @Test
    public void listTbHotelMainFacility() {
        dao.listTbHotelMainFacility();
    }
}