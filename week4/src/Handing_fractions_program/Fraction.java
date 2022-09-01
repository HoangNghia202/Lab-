package Handing_fractions_program;

public class Fraction {
    public int tu;
    public int mau;
    public double kQua;

    public Fraction() {
    }

    public Fraction(int tu, int mau, double kQua) {
        this.tu = tu;
        this.mau = mau;
        this.kQua = kQua;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public double getkQua() {
        return kQua;
    }

    public void setkQua(double kQua) {
        this.kQua = kQua;
    }

    @Override
    public String toString() {
        return tu+"/"+mau;
    }

    

    
}
