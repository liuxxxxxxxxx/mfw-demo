package com.qf.dao;

import com.qf.pojo.po.TbHotel;
import com.qf.pojo.po.TbHotelFacility;
import com.qf.pojo.vo.HotelSearchVO;
import com.qf.pojo.vo.HotelVo;
import com.qf.service.HotelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
//    private HotelService service;

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

    @Test
    public void updateHotel() {
        TbHotel hotel=new TbHotel();
        hotel.setHotel_id("9011242");
        hotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
        hotel.setHotel_buildtime("2009");
        hotel.setHotel_facility("2018");
        hotel.setHotel_intime("14:00");
        hotel.setHotel_outtime("12:00");
        hotel.setHotel_rate(4);
        hotel.setHotel_location("杭州灵隐支路白乐桥272号");
        hotel.setHotel_rebuildtime("2009");
        hotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
        hotel.setRoom_facility("叫醒服务, 雨伞租借服务, 宽带上网, 空调, 洗漱用品, 电视, 淋浴设施, 毛巾, 拖鞋");
        hotel.setHotel_name("杭州半亩方塘客栈sss");
        hotel.setHotel_img("https://p4-q.mafengwo.net/s8/M00/8D/0D/wKgBpVV1SoeAXRKSACPZXF9NFzo95.jpeg?imageMogr2%2Fthumbnail%2F%211360x940r%2Fgravity%2FCenter%2Fcrop%2F%211360x940%2Fquality%2F90");
        int i=dao.updateHotel(hotel);
    }

    @Test
    public void removeHotel() {
        dao.removeHotel("1001");
    }

    @Test
    public void addHotel() {
       /* TbHotel hotel=new TbHotel();
        hotel.setHotel_id("9011242");
        hotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
        hotel.setHotel_buildtime("2009");
        hotel.setHotel_facility("2018");
        hotel.setHotel_intime("14:00");
        hotel.setHotel_outtime("12:00");
        hotel.setHotel_rate(4);
        hotel.setHotel_location("杭州灵隐支路白乐桥272号");
        hotel.setHotel_rebuildtime("2009");
        hotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
        hotel.setRoom_facility("叫醒服务, 雨伞租借服务, 宽带上网, 空调, 洗漱用品, 电视, 淋浴设施, 毛巾, 拖鞋");
        hotel.setHotel_name("杭州半亩方塘客栈sss");
        hotel.setHotel_img("https://p4-q.mafengwo.net/s8/M00/8D/0D/wKgBpVV1SoeAXRKSACPZXF9NFzo95.jpeg?imageMogr2%2Fthumbnail%2F%211360x940r%2Fgravity%2FCenter%2Fcrop%2F%211360x940%2Fquality%2F90");
        int i=dao.addHotel(hotel);*/
    }

    @Test
    public void listSearchHotel() {
        dao.listSearchHotel("酒店",0,1000);
    }

    @Test
    public void listSearchHotelAll() {
        HotelSearchVO tbHotel=new HotelSearchVO();
        tbHotel.setHotel_id("9011242");
        tbHotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
      /*  tbHotel.setHotel_buildtime("2009");
        tbHotel.setHotel_facility("2018");
        tbHotel.setHotel_intime("14:00");
        tbHotel.setHotel_outtime("12:00");
        tbHotel.setHotel_rate(4);
        tbHotel.setHotel_location("杭州灵隐支路白乐桥272号");
        tbHotel.setHotel_rebuildtime("2009");
        tbHotel.setHotel_help("酒店攻略\n" +
                "必读客栈距离灵隐寺仅有5分钟步行路程。客栈距离西湖有15分钟车程，距离杭州火车站有30分钟车程。客栈距离杭州萧山国际机场有1小时路程。贴士客房享有典雅的装饰，提供空调、平板电视、带淋浴的私人浴室以及电热水壶。客栈设有提供旅游和订票服务的24小时前台以及私人花园。客栈设有图书馆及会议室。");
        tbHotel.setRoom_facility("叫醒服务, 雨伞租借服务, 宽带上网, 空调, 洗漱用品, 电视, 淋浴设施, 毛巾, 拖鞋");
       */
      tbHotel.setHotel_name("杭州");
        tbHotel.setHotel_location("杭州市");
        tbHotel.setHotel_rate(4);
        tbHotel.setHotel_facility("%商务中心%理发美容室%SPA%门卫%前台保险柜%");
        tbHotel.setOffset(1);
        tbHotel.setPageCount(2);
        dao.listSearchHotelAll(tbHotel);
    }
    @Test
    public void testAppend(){
        List<String> list=new ArrayList<>();
        list.add("免费停车");
        list.add("我就是测试的");
        list.add("看看行不行");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            sb.append(s);
            if(i<list.size()-1){
                sb.append(",");
            }
        }
        System.out.println(sb);
    }
   /* @Test
    public void testMap(){
        Map<String,Object> map=new HashMap<>();
        List<TbHotelFacility> tbHotelFacility=service.ListTbHotelFacility();
        map.put("test",tbHotelFacility);
        Object test = map.get("test");
    }*/
}