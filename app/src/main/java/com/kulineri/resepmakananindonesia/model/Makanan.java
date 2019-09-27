package com.kulineri.resepmakananindonesia.model;

public class Makanan {
    private String nama;
    private String detil, bahan, cara;
    private int gambar;

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detil;
    }

    public void setDetail(String detil) {
        this.detil = detil;
    }

    public int getPhoto() {
        return gambar;
    }

    public void setPhoto(int gambar) {
        this.gambar = gambar;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }
}

