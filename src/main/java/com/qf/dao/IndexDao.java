package com.qf.dao;

import com.qf.pojo.vo.TravelVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexDao {
    List<TravelVO> listTravel(@Param(value = "offset") int offset,@Param(value = "pageSize") int pageSize);

    int totalTravels();
}
