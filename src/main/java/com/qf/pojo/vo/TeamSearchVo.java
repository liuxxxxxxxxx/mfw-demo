package com.qf.pojo.vo;

public class TeamSearchVo {
    private  String cate;
    private  String zone;
    private String city;
    private int road;

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "TeamSearchVo{" +
                "cate='" + cate + '\'' +
                ", zone='" + zone + '\'' +
                ", city='" + city + '\'' +
                ", road=" + road +
                '}';
    }
}
