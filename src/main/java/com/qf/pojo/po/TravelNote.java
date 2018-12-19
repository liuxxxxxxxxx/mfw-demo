package com.qf.pojo.po;

import java.util.List;

public class TravelNote {
    private int id;
    private String travelNoteId;
    private String travelNoteTitle;
    private String travelNoteBanner;
    private String travelNoteBeginTime;
    private int travelNotePeriod;
    private int travelNotePrice;
    private String travelNoteStyle;
    private int travelNoteBrowses;
    private int travelNoteLikes;
    private int travelNoteCollects;
    private int travelNoteShares;
    private String travelNoteDestination;
    private List<TravelContent> travelContent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravelNoteId() {
        return travelNoteId;
    }

    public void setTravelNoteId(String travelNoteId) {
        this.travelNoteId = travelNoteId;
    }

    public String getTravelNoteTitle() {
        return travelNoteTitle;
    }

    public void setTravelNoteTitle(String travelNoteTitle) {
        this.travelNoteTitle = travelNoteTitle;
    }

    public String getTravelNoteBanner() {
        return travelNoteBanner;
    }

    public void setTravelNoteBanner(String travelNoteBanner) {
        this.travelNoteBanner = travelNoteBanner;
    }

    public String getTravelNoteBeginTime() {
        return travelNoteBeginTime;
    }

    public void setTravelNoteBeginTime(String travelNoteBeginTime) {
        this.travelNoteBeginTime = travelNoteBeginTime;
    }

    public int getTravelNotePeriod() {
        return travelNotePeriod;
    }

    public void setTravelNotePeriod(int travelNotePeriod) {
        this.travelNotePeriod = travelNotePeriod;
    }

    public int getTravelNotePrice() {
        return travelNotePrice;
    }

    public void setTravelNotePrice(int travelNotePrice) {
        this.travelNotePrice = travelNotePrice;
    }

    public String getTravelNoteStyle() {
        return travelNoteStyle;
    }

    public void setTravelNoteStyle(String travelNoteStyle) {
        this.travelNoteStyle = travelNoteStyle;
    }

    public int getTravelNoteBrowses() {
        return travelNoteBrowses;
    }

    public void setTravelNoteBrowses(int travelNoteBrowses) {
        this.travelNoteBrowses = travelNoteBrowses;
    }

    public int getTravelNoteLikes() {
        return travelNoteLikes;
    }

    public void setTravelNoteLikes(int travelNoteLikes) {
        this.travelNoteLikes = travelNoteLikes;
    }

    public int getTravelNoteCollects() {
        return travelNoteCollects;
    }

    public void setTravelNoteCollects(int travelNoteCollects) {
        this.travelNoteCollects = travelNoteCollects;
    }

    public int getTravelNoteShares() {
        return travelNoteShares;
    }

    public void setTravelNoteShares(int travelNoteShares) {
        this.travelNoteShares = travelNoteShares;
    }

    public String getTravelNoteDestination() {
        return travelNoteDestination;
    }

    public void setTravelNoteDestination(String travelNoteDestination) {
        this.travelNoteDestination = travelNoteDestination;
    }

    public List<TravelContent> getTravelContent() {
        return travelContent;
    }

    public void setTravelContent(List<TravelContent> travelContent) {
        this.travelContent = travelContent;
    }

    @Override
    public String toString() {
        return "TravelNote{" +
                "id=" + id +
                ", travelNoteId='" + travelNoteId + '\'' +
                ", travelNoteTitle='" + travelNoteTitle + '\'' +
                ", travelNoteBanner='" + travelNoteBanner + '\'' +
                ", travelNoteBeginTime='" + travelNoteBeginTime + '\'' +
                ", travelNotePeriod=" + travelNotePeriod +
                ", travelNotePrice=" + travelNotePrice +
                ", travelNoteStyle='" + travelNoteStyle + '\'' +
                ", travelNoteBrowses=" + travelNoteBrowses +
                ", travelNoteLikes=" + travelNoteLikes +
                ", travelNoteCollects=" + travelNoteCollects +
                ", travelNoteShares=" + travelNoteShares +
                ", travelNoteDestination='" + travelNoteDestination + '\'' +
                ", travelContent=" + travelContent +
                '}';
    }

    public TravelNote() {
    }
}
