package org.example;

public class Alma {
    public Alma(double suly, int hibakSzama){
        this._suly = suly;
        this._hibakSzama = hibakSzama;
    }
    private double _suly;
    private int _hibakSzama;

    public double getSuly() {
        return _suly;
    }
    public int getHibakSzama() {
        return _hibakSzama;
    }

}