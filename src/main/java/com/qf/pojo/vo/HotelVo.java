package com.qf.pojo.vo;

import java.util.Arrays;
import java.util.List;

/**
 * @param
 * @Author: HEJIE
 * @Time: 15:43 2018/12/20
 * @version: v1.0
 */
public class HotelVo {
    private int id;
    private String hotel_id;
    private String hotel_name;
    private String hotel_location;
    private double hotel_score;
    private int hotel_rate;
    private String hotel_intime;
    private String hotel_outtime;
    private String hotel_buildtime;
    private String hotel_rebuildtime;
    private int hotel_rooms;
    private List<String> main_facility;
    private List<String> hotel_service;
    private List<String> hotel_facility;
    private List<String> room_facility;
    private String hotel_help;
    private String hotel_img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_location() {
        return hotel_location;
    }

    public void setHotel_location(String hotel_location) {
        this.hotel_location = hotel_location;
    }

    public double getHotel_score() {
        return hotel_score;
    }

    public void setHotel_score(double hotel_score) {
        this.hotel_score = hotel_score;
    }

    public int getHotel_rate() {
        return hotel_rate;
    }

    public void setHotel_rate(int hotel_rate) {
        this.hotel_rate = hotel_rate;
    }

    public String getHotel_intime() {
        return hotel_intime;
    }

    public void setHotel_intime(String hotel_intime) {
        this.hotel_intime = hotel_intime;
    }

    public String getHotel_outtime() {
        return hotel_outtime;
    }

    public void setHotel_outtime(String hotel_outtime) {
        this.hotel_outtime = hotel_outtime;
    }

    public String getHotel_buildtime() {
        return hotel_buildtime;
    }

    public void setHotel_buildtime(String hotel_buildtime) {
        this.hotel_buildtime = hotel_buildtime;
    }

    public String getHotel_rebuildtime() {
        return hotel_rebuildtime;
    }

    public void setHotel_rebuildtime(String hotel_rebuildtime) {
        this.hotel_rebuildtime = hotel_rebuildtime;
    }

    public int getHotel_rooms() {
        return hotel_rooms;
    }

    public void setHotel_rooms(int hotel_rooms) {
        this.hotel_rooms = hotel_rooms;
    }

    public List<String> getMain_facility() {
        return main_facility;
    }

    public void setMain_facility(List<String> main_facility) {
        this.main_facility = main_facility;
    }

    public List<String> getHotel_service() {
        return hotel_service;
    }

    public void setHotel_service(List<String> hotel_service) {
        this.hotel_service = hotel_service;
    }

    public List<String> getHotel_facility() {
        return hotel_facility;
    }

    public void setHotel_facility(List<String> hotel_facility) {
        this.hotel_facility = hotel_facility;
    }

    public List<String> getRoom_facility() {
        return room_facility;
    }

    public void setRoom_facility(List<String> room_facility) {
        this.room_facility = room_facility;
    }

    public String getHotel_help() {
        return hotel_help;
    }

    public void setHotel_help(String hotel_help) {
        this.hotel_help = hotel_help;
    }

    public String getHotel_img() {
        return hotel_img;
    }

    public void setHotel_img(String hotel_img) {
        this.hotel_img = hotel_img;
    }

    @Override
    public String toString() {
        return "HotelVo{" +
                "id=" + id +
                ", hotel_id='" + hotel_id + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_location='" + hotel_location + '\'' +
                ", hotel_score=" + hotel_score +
                ", hotel_rate=" + hotel_rate +
                ", hotel_intime='" + hotel_intime + '\'' +
                ", hotel_outtime='" + hotel_outtime + '\'' +
                ", hotel_buildtime='" + hotel_buildtime + '\'' +
                ", hotel_rebuildtime='" + hotel_rebuildtime + '\'' +
                ", hotel_rooms=" + hotel_rooms +
                ", main_facility=" + main_facility +
                ", hotel_service=" + hotel_service +
                ", hotel_facility=" + hotel_facility +
                ", room_facility=" + room_facility +
                ", hotel_help='" + hotel_help + '\'' +
                ", hotel_img='" + hotel_img + '\'' +
                '}';
    }
}
