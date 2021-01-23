package com.company;

import javax.swing.*;

public class NotHesaplama {
    public static void main(String[] args) {
        double vizeNotu,finalNotu;
        int devamsızlık;
        vizeNotu=vizeNotuAl();
        finalNotu=finalNotuAl();
        devamsızlık=devamsizlikAl();
        gecmeDurumuHesapla(vizeNotu,finalNotu,devamsızlık);
    }
    public static double vizeNotuAl(){
        String vize_Notu=JOptionPane.showInputDialog("Vize notunu girin");
        double not=Double.parseDouble(vize_Notu);
        while(not<0 || not>100){
            vize_Notu=JOptionPane.showInputDialog("Vize notunu 0 ile 100 arasında olacak şekilde giriniz");
            not=Double.parseDouble(vize_Notu);
        }
        return not ;
    }
    public static double finalNotuAl(){
        String final_Notu=JOptionPane.showInputDialog("Final notunu girin");
        double not=Double.parseDouble(final_Notu);
        while(not<0 || not>100){
            final_Notu=JOptionPane.showInputDialog("Final notunu 0 ile 100 arasında olacak şekilde giriniz");
            not=Double.parseDouble(final_Notu);
        }
        return not ;
    }
    public static int devamsizlikAl(){
        String devamsizlikSayisi=JOptionPane.showInputDialog("Devamsızlık sayınızı girin");
        return Integer.parseInt(devamsizlikSayisi);
    }
    public static double ortalamaHesapla(double vizeNot,double finalNot){
        return (vizeNot*0.4)+(finalNot*0.6);
    }
    public static void gecmeDurumuHesapla(double vizeNot,double finalNot,int devamsizlik){
        double ortalama= ortalamaHesapla(vizeNot,finalNot);
        if(ortalama >= 50 && devamsizlik < 10){
            JOptionPane.showMessageDialog(null,"Geçti \nOrtalama : "+ortalama+"\nVize Notu : "+vizeNot+"\nFinal Notu : "+finalNot+"\nDevamsızlık : "+devamsizlik);
        }
        else{
            JOptionPane.showMessageDialog(null,"Kaldı \nOrtalama : "+ortalama+"\nVize Notu : "+vizeNot+"\nFinal Notu : "+finalNot+"\nDevamsızlık : "+devamsizlik);
        }
    }

}
