package com.android.dubaothoitiet.model;

public class Item_View2 {
    private int imgAva2;
    private String day2, status2, tempBig2, tempSmall2;

    public Item_View2(int imgAva2, String day2, String status2, String tempBig2, String tempSmall2) {
        this.imgAva2 = imgAva2;
        this.day2 = day2;
        this.status2 = status2;
        this.tempBig2 = tempBig2;
        this.tempSmall2 = tempSmall2;
    }

    public Item_View2() {
    }

    public int getImgAva2() {
        return imgAva2;
    }

    public void setImgAva2(int imgAva2) {
        this.imgAva2 = imgAva2;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getTempBig2() {
        return tempBig2;
    }

    public void setTempBig2(String tempBig2) {
        this.tempBig2 = tempBig2;
    }

    public String getTempSmall2() {
        return tempSmall2;
    }

    public void setTempSmall2(String tempSmall2) {
        this.tempSmall2 = tempSmall2;
    }
}
