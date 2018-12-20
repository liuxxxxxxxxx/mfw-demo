package com.qf.service;

import com.qf.pojo.vo.PageVO;
import com.qf.pojo.vo.TravelVO;

import java.util.List;

public interface IndexService {

    PageVO<TravelVO> listTravel(int pageIndex, int pageSize, int total);

    int totalTravels();
}
