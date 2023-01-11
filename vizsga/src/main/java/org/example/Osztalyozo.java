package org.example;

public class Osztalyozo {
    private static double _A;// = 1.2;  //hevesnél ellenőrzéshez
    private static double _B;// = 1.5;  //hevesnél ellenőrzéshez
    private static double _C;// = 2;    //hevesnél ellenőrzéshez

    public static double getA() {
        return _A;
    }
    public static double getB() {
        return _B;
    }
    public static double getC() {
        return _C;
    }
    public static int getHibaHatar() {
        return _hibaHatar;
    }
    private static int _hibaHatar = 3;


    public Osztalyozo(double A, double B, double C,int hibaHatar){
        this._A = A;
        this._B = B;
        this._C = C;
        this._hibaHatar = hibaHatar;
    }

    public static Osztaly Osztalyzo(Alma a){
        if (a.getSuly() >= getC()){
            return Osztaly.HARMAD;
        }
        if(a.getSuly() >= getB() && a.getSuly() < getC()){
            return Osztaly.MASOD;
        }
        if (a.getSuly() >= getA() ){
            return Osztaly.ELSO;
        }
        if (a.getSuly() < getA() && a.getHibakSzama() <= _hibaHatar){
            return Osztaly.SZUPER;
        }
        else return Osztaly.HIBAS;
    }

}
