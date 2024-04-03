package com.example.a2001215653_nguyentanhuudanh_buoi05_btvn;

public class Music {
    int id;
    int img;
    String name;

    public  Music(int id, int img, String name)
    {
        this.id = id;
        this.img = img;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getImg()
    {
        return  img;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }
}
