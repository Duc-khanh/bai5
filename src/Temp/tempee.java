package Temp;

public class tempee {
    private double C;
    public tempee (double C){
        this.C = C;
    }
    public double getC(){
        return C;
    }
    public double toF(){
        return C * 9 / 5 + 32;
    }
    public double toK(){
        return  C + 273.15;
    }
}
