package com.qf.pojo.vo;

public class TravelVO {
    private String travel_note_id;
    private String travel_note_title;
    private String travel_note_banner;
    private String travel_note_destination;
    private int travel_note_browses;
    private String travel_note_content_text;

    public String getTravel_note_id() {
        return travel_note_id;
    }

    public void setTravel_note_id(String travel_note_id) {
        this.travel_note_id = travel_note_id;
    }

    public String getTravel_note_title() {
        return travel_note_title;
    }

    public void setTravel_note_title(String travel_note_title) {
        this.travel_note_title = travel_note_title;
    }

    public String getTravel_note_banner() {
        return travel_note_banner;
    }

    public void setTravel_note_banner(String travel_note_banner) {
        this.travel_note_banner = travel_note_banner;
    }

    public String getTravel_note_destination() {
        return travel_note_destination;
    }

    public void setTravel_note_destination(String travel_note_destination) {
        this.travel_note_destination = travel_note_destination;
    }

    public int getTravel_note_browses() {
        return travel_note_browses;
    }

    public void setTravel_note_browses(int travel_note_browses) {
        this.travel_note_browses = travel_note_browses;
    }

    public String getTravel_note_content_text() {
        return travel_note_content_text;
    }

    public void setTravel_note_content_text(String travel_note_content_text) {
        this.travel_note_content_text = travel_note_content_text;
    }

    @Override
    public String toString() {
        return "TravelVO{" +
                "travel_note_id='" + travel_note_id + '\'' +
                ", travel_note_title='" + travel_note_title + '\'' +
                ", travel_note_banner='" + travel_note_banner + '\'' +
                ", travel_note_destination='" + travel_note_destination + '\'' +
                ", travel_note_browses=" + travel_note_browses +
                ", travel_note_content_text=" + travel_note_content_text +
                '}';
    }
}
