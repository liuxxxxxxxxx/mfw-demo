package com.qf.service.impl;

import com.qf.dao.TbHotelDao;
import com.qf.pojo.po.TbHotel;
import com.qf.pojo.vo.HotelVo;
import com.qf.service.HotelService;
import com.qf.util.PagePro;
import org.apache.ibatis.session.SqlSessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

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
    private final String SUCCESS="success";
    private final String ERROR="error";
    @Override
    public PagePro<TbHotel> listsHotel(int currentPage, int pageCount) {
        PagePro<TbHotel> pageProduct = new PagePro<>();
        try {
            //得到该表的所有的记录条数
            int count = dao.getCount();
            //为分页类赋值
            pageProduct.setCurrentPage(currentPage);
            pageProduct.setPageProcuct(pageCount);
            pageProduct.setSumProduct(count);
            //获得分页的偏移量
            int offset = pageProduct.getOffset();
            //获取到该记录
            List<TbHotel> lists = dao.listTbHotel(offset, pageCount);
            pageProduct.setProduct(lists);
            return pageProduct;
        } catch (SqlSessionException e) {
            return null;
        }

    }

    @Override
    public String updateHotel(Map maps) {
        TbHotel hotel = new TbHotel();
        try {
            Object obj = maps.get("params");
            Map<String, Object> map = (Map<String, Object>) obj;
            hotel.setHotel_id(String.valueOf(map.get("hotel_id")));
            hotel.setHotel_name(String.valueOf(map.get("hotel_name")));
            hotel.setHotel_location(String.valueOf(map.get("hotel_location")));
            hotel.setHotel_rate(Integer.parseInt(map.get("hotel_rate").toString()));
            hotel.setHotel_intime(String.valueOf(map.get("hotel_intime")));
            hotel.setHotel_outtime(String.valueOf(map.get("hotel_outtime")));
            hotel.setHotel_buildtime(String.valueOf(map.get("hotel_buildtime")));
            hotel.setHotel_rebuildtime(String.valueOf(map.get("hotel_rebuildtime")));
            hotel.setHotel_rooms(Integer.parseInt(map.get("hotel_rooms").toString()));
            hotel.setHotel_help(String.valueOf(map.get("hotel_help")));

            //main_facility
            List main_facility = (List) map.get("main_facility");
            StringBuffer main_facilitys = new StringBuffer();
            for (int i = 0; i < main_facility.size(); i++) {
                String s = (String) main_facility.get(i);
                main_facilitys.append(s);
                if (i < main_facility.size()) {
                    main_facilitys.append(",");
                }
            }
            //hotel_service
            List hotel_service = (List) map.get("hotel_service");
            StringBuffer hotel_services = new StringBuffer();
            for (int i = 0; i < hotel_service.size(); i++) {
                String s = (String) hotel_service.get(i);
                hotel_services.append(s);
                if (i < main_facility.size()) {
                    hotel_services.append(",");
                }
            }
            //hotel_facility
            List hotel_facility = (List) map.get("hotel_facility");
            StringBuffer hotel_facilitys = new StringBuffer();
            for (int i = 0; i < hotel_facility.size(); i++) {
                String s = (String) hotel_facility.get(i);
                hotel_facilitys.append(s);
                if (i < main_facility.size()) {
                    hotel_facilitys.append(",");
                }
            }
            //room_facility
            List room_facility = (List) map.get("room_facility");
            StringBuffer room_facilitys = new StringBuffer();
            for (int i = 0; i < room_facility.size(); i++) {
                String s = (String) room_facility.get(i);
                room_facilitys.append(s);
                if (i < main_facility.size()) {
                    room_facilitys.append(",");
                }
            }
            hotel.setMain_facility(main_facilitys.toString());
            hotel.setHotel_service(hotel_services.toString());
            hotel.setHotel_facility(hotel_facilitys.toString());
            hotel.setRoom_facility(room_facilitys.toString());
            int i=dao.updateHotel(hotel);
            if(i>0){
                return SUCCESS;
            }
                return ERROR;

        } catch (SqlSessionException e) {
            return ERROR;
        }
    }

    @Override
    public String removeHotel(String hotel_id) {
        try{
            int i=dao.removeHotel(hotel_id);
            if(i>0){
                return SUCCESS;
            }
            return ERROR;
        }
        catch (SqlSessionException e){
            return ERROR;
        }
    }

    @Override
    public String addHotel(Map maps) {
        TbHotel hotel = new TbHotel();
        try {
            Object obj = maps.get("params");
            Map<String, Object> map = (Map<String, Object>) obj;
            hotel.setHotel_id(String.valueOf(map.get("hotel_id")));
            hotel.setHotel_name(String.valueOf(map.get("hotel_name")));
            hotel.setHotel_location(String.valueOf(map.get("hotel_location")));
            hotel.setHotel_rate(Integer.parseInt(map.get("hotel_rate").toString()));
            hotel.setHotel_intime(String.valueOf(map.get("hotel_intime")));
            hotel.setHotel_outtime(String.valueOf(map.get("hotel_outtime")));
            hotel.setHotel_buildtime(String.valueOf(map.get("hotel_buildtime")));
            hotel.setHotel_rebuildtime(String.valueOf(map.get("hotel_rebuildtime")));
            hotel.setHotel_rooms(Integer.parseInt(map.get("hotel_rooms").toString()));
            hotel.setHotel_help(String.valueOf(map.get("hotel_help")));
            //main_facility
            List main_facility = (List) map.get("main_facility");
            StringBuffer main_facilitys = new StringBuffer();
            for (int i = 0; i < main_facility.size(); i++) {
                String s = (String) main_facility.get(i);
                main_facilitys.append(s);
                if (i < main_facility.size()) {
                    main_facilitys.append(",");
                }
            }
            //hotel_service
            List hotel_service = (List) map.get("hotel_service");
            StringBuffer hotel_services = new StringBuffer();
            for (int i = 0; i < hotel_service.size(); i++) {
                String s = (String) hotel_service.get(i);
                hotel_services.append(s);
                if (i < main_facility.size()) {
                    hotel_services.append(",");
                }
            }
            //hotel_facility
            List hotel_facility = (List) map.get("hotel_facility");
            StringBuffer hotel_facilitys = new StringBuffer();
            for (int i = 0; i < hotel_facility.size(); i++) {
                String s = (String) hotel_facility.get(i);
                hotel_facilitys.append(s);
                if (i < main_facility.size()) {
                    hotel_facilitys.append(",");
                }
            }
            //room_facility
            List room_facility = (List) map.get("room_facility");
            StringBuffer room_facilitys = new StringBuffer();
            for (int i = 0; i < room_facility.size(); i++) {
                String s = (String) room_facility.get(i);
                room_facilitys.append(s);
                if (i < main_facility.size()) {
                    room_facilitys.append(",");
                }
            }
            hotel.setMain_facility(main_facilitys.toString());
            hotel.setHotel_service(hotel_services.toString());
            hotel.setHotel_facility(hotel_facilitys.toString());
            hotel.setRoom_facility(room_facilitys.toString());
            //手动封装
            String hotel_id = UUID.randomUUID().toString();
            hotel.setHotel_score(5);
            hotel.setHotel_id(hotel_id);
            hotel.setHotel_img("https://b2-q.mafengwo.net/s7/M00/70/2B/wKgB6lPReYKAQAUqAALGfI7XJWc38.jpeg?imageMogr2%2Fthumbnail%2F%211360x940r%2Fgravity%2FCenter%2Fcrop%2F%211360x940%2Fquality%2F90");
            int i=dao.addHotel(hotel);
            if(i>0){
                return SUCCESS;
            }
            return ERROR;
        } catch (SqlSessionException e) {
            return ERROR;
        }
    }
}
