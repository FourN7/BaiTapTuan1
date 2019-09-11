package com.example.tinhdientichchuvi;

public class HinhChuNhat {
    private float d;
    private float r;

    public HinhChuNhat(float d, float r) {
        this.d = d;
        this.r = r;
    }

    public float tinhDienTich (float d,float r){
      return  this.d*this.r;
    }
    public  float tinhChuVi (float d,float r){
        return  (this.d+this.r)*2;
    }
    public  float tinhDTV(float d){
        return (this.d*this.d);
    }
    public  float chuviV(float d){
        return this.d*4;
    }
}
