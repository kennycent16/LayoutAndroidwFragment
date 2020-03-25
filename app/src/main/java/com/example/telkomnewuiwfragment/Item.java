package com.example.telkomnewui;

public class Item {
    private Integer image;
    private String judul;
    private String judul2;
    private String content;
    private String content2;
    private String price;
    private String pricedisc;

    public Item(Integer image, String judul, String content, String price,String pricedisc,String judul2,String content2) {
        this.image = image;
        this.judul = judul;
        this.content = content;
        this.price = price;
        this.pricedisc=pricedisc;
        this.judul2=judul2;
        this.content2=content2;
    }

    public String getJudul2() {
        return judul2;
    }

    public void setJudul2(String judul2) {
        this.judul2 = judul2;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getPricedisc() {
        return pricedisc;
    }

    public void setPricedisc(String pricedisc) {
        this.pricedisc = pricedisc;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
