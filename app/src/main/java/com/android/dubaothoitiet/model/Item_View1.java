package com.android.dubaothoitiet.model;

public class Item_View1 {
    private int imgAva;
    private String day1, tempBig, tempSmall, city, status;

    public Item_View1(int imgAva, String day1, String tempBig, String tempSmall, String city, String status) {
        this.imgAva = imgAva;
        this.day1 = day1;
        this.tempBig = tempBig;
        this.tempSmall = tempSmall;
        this.city = city;
        this.status = status;
    }

    public Item_View1() {
    }

    public int getImgAva() {
        return imgAva;
    }

    public void setImgAva(int imgAva) {
        this.imgAva = imgAva;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getTempBig() {
        return tempBig;
    }

    public void setTempBig(String tempBig) {
        this.tempBig = tempBig;
    }

    public String getTempSmall() {
        return tempSmall;
    }

    public void setTempSmall(String tempSmall) {
        this.tempSmall = tempSmall;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
