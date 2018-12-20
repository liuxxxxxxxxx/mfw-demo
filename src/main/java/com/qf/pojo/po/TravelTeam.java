package com.qf.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class TravelTeam {
    private String travel_team_id;
    private String travel_team_title;
    private String travel_team_keyword;
    private String travel_team_type;
    private String travel_team_shoper;
    private String travel_team_line;
    private BigDecimal travel_team_price;
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date travel_team_beginTime;
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date travel_team_endTime;
    private String travel_team_origin;
    private String travel_team_distance;
    private int travel_team_peoples;
    private int travel_team_collects;
    private String travel_team_img;

    public String getTravel_team_img() {
        return travel_team_img;
    }

    public void setTravel_team_img(String travel_team_img) {
        this.travel_team_img = travel_team_img;
    }

    public String getTravel_team_id() {
        return travel_team_id;
    }

    public void setTravel_team_id(String travel_team_id) {
        this.travel_team_id = travel_team_id;
    }

    public String getTravel_team_title() {
        return travel_team_title;
    }

    public void setTravel_team_title(String travel_team_title) {
        this.travel_team_title = travel_team_title;
    }

    public String getTravel_team_keyword() {
        return travel_team_keyword;
    }

    public void setTravel_team_keyword(String travel_team_keyword) {
        this.travel_team_keyword = travel_team_keyword;
    }

    public String getTravel_team_type() {
        return travel_team_type;
    }

    public void setTravel_team_type(String travel_team_type) {
        this.travel_team_type = travel_team_type;
    }

    public String getTravel_team_shoper() {
        return travel_team_shoper;
    }

    public void setTravel_team_shoper(String travel_team_shoper) {
        this.travel_team_shoper = travel_team_shoper;
    }

    public String getTravel_team_line() {
        return travel_team_line;
    }

    public void setTravel_team_line(String travel_team_line) {
        this.travel_team_line = travel_team_line;
    }

    public BigDecimal getTravel_team_price() {
        return travel_team_price;
    }

    public void setTravel_team_price(BigDecimal travel_team_price) {
        this.travel_team_price = travel_team_price;
    }

    public Date getTravel_team_beginTime() {
        return travel_team_beginTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public void setTravel_team_beginTime(Date travel_team_beginTime) {
        this.travel_team_beginTime = travel_team_beginTime;
    }

    public Date getTravel_team_endTime() {
        return travel_team_endTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public void setTravel_team_endTime(Date travel_team_endTime) {
        this.travel_team_endTime = travel_team_endTime;
    }

    public String getTravel_team_origin() {
        return travel_team_origin;
    }

    public void setTravel_team_origin(String travel_team_origin) {
        this.travel_team_origin = travel_team_origin;
    }

    public String getTravel_team_distance() {
        return travel_team_distance;
    }

    public void setTravel_team_distance(String travel_team_distance) {
        this.travel_team_distance = travel_team_distance;
    }

    public int getTravel_team_peoples() {
        return travel_team_peoples;
    }

    public void setTravel_team_peoples(int travel_team_peoples) {
        this.travel_team_peoples = travel_team_peoples;
    }

    public int getTravel_team_collects() {
        return travel_team_collects;
    }

    public void setTravel_team_collects(int travel_team_collects) {
        this.travel_team_collects = travel_team_collects;
    }

    @Override
    public String toString() {
        return "TravelTeam{" +
                "travel_team_id='" + travel_team_id + '\'' +
                ", travel_team_title='" + travel_team_title + '\'' +
                ", travel_team_keyword='" + travel_team_keyword + '\'' +
                ", travel_team_type='" + travel_team_type + '\'' +
                ", travel_team_shoper='" + travel_team_shoper + '\'' +
                ", travel_team_line='" + travel_team_line + '\'' +
                ", travel_team_price=" + travel_team_price +
                ", travel_team_beginTime=" + travel_team_beginTime +
                ", travel_team_endTime=" + travel_team_endTime +
                ", travel_team_origin='" + travel_team_origin + '\'' +
                ", travel_team_distance='" + travel_team_distance + '\'' +
                ", travel_team_peoples=" + travel_team_peoples +
                ", travel_team_collects=" + travel_team_collects +
                ", travel_team_img='" + travel_team_img + '\'' +
                '}';
    }
}
