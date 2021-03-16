/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Persegi extends main{
    int sisi;
    
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    public float luas() {
        return this.sisi * this.sisi;
    }
    
    public float keliling(){
        return this.sisi * 4;
    }
}