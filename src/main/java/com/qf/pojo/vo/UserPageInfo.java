package com.qf.pojo.vo;

public class UserPageInfo {
    private int pageIndex;
    private int pageSize;
    private int offset;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return (pageIndex - 1)*pageSize;
    }


}
