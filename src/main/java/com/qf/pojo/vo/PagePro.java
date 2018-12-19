package com.qf.util;

import java.util.List;

public class PagePro<E> {
    /*
     * 分页需要解决的五个问题
     * 1.一共有多少个商品
     * 2.一页需要展示的商品个数
     * 3.需要几页
     * 4.当前是第几页
     * 5.当前页的所有产品
     * */

    /**
     * offset是偏移量，在该类中会通过算法计算得到（不需要传入）
     * allPagecount 一共有多少页在该类中通过算法得到（不需要传入）
     */
    private int sumProduct;//产品的个数
    private int pageProcuct;//一页有多少个产品
    private int allPagecount;//一共有多少页（页的总数）
    private int currentPage;//当前是第几页
    private int offset;//偏移量（开始值的下标）limit offset,pagesize
    private List<E> product;

    public int getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(int sumProduct) {
        this.sumProduct = sumProduct;
    }

    public int getPageProcuct() {
        return pageProcuct;
    }

    public void setPageProcuct(int pageProcuct) {
        this.pageProcuct = pageProcuct;
    }

    public int getAllPagecount() {
        //(产品的个数+一页有多少个产品-1)/一页有多少个产品
        return (this.sumProduct + this.pageProcuct - 1) / this.pageProcuct;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getOffset() {
        //(当前页-1)*一页有多少个产品
        return (this.currentPage - 1) * this.pageProcuct;
    }

    public List<E> getProduct() {
        return product;
    }

    public void setProduct(List<E> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "PagePro [sumProduct=" + sumProduct + ", pageProcuct=" + pageProcuct + ", allPagecount=" + allPagecount
                + ", currentPage=" + currentPage + ", offset=" + offset + ", product=" + product + "]";
    }


}
