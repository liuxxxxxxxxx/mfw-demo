package com.qf.pojo.vo;

public class TravelTeamPo {
    private int offset;
    private int pageSize;
    private String search;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "TravelTeamPo{" +
                "offset=" + offset +
                ", pageSize=" + pageSize +
                ", search='" + search + '\'' +
                '}';
    }
}
