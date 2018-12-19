package com.qf.pojo.po;

public class TravelContent {
    private String travelNoteId;
    private int travelNoteContentNo;
    private int travelNoteContentType;
    private String travelNoteContentText;

    public String getTravelNoteId() {
        return travelNoteId;
    }

    public void setTravelNoteId(String travelNoteId) {
        this.travelNoteId = travelNoteId;
    }

    public int getTravelNoteContentNo() {
        return travelNoteContentNo;
    }

    public void setTravelNoteContentNo(int travelNoteContentNo) {
        this.travelNoteContentNo = travelNoteContentNo;
    }

    public int getTravelNoteContentType() {
        return travelNoteContentType;
    }

    public void setTravelNoteContentType(int travelNoteContentType) {
        this.travelNoteContentType = travelNoteContentType;
    }

    public String getTravelNoteContentText() {
        return travelNoteContentText;
    }

    public void setTravelNoteContentText(String travelNoteContentText) {
        this.travelNoteContentText = travelNoteContentText;
    }

    @Override
    public String toString() {
        return "TravelContent{" +
                "travelNoteId='" + travelNoteId + '\'' +
                ", travelNoteContentNo=" + travelNoteContentNo +
                ", travelNoteContentType=" + travelNoteContentType +
                ", travelNoteContentText='" + travelNoteContentText + '\'' +
                '}';
    }

    public TravelContent() {
    }
}
