package HcN;

public class lopHcn{
    double widht, height;
    public lopHcn(){
    }
    public lopHcn( double widht ,double height){
        this.widht =widht;
        this.height = height;
    }
    public double getArea(){
        return this.widht* this.height;
    }
    public double getPerimeter(){
        return (this.widht+ this.height) * 2;
    }
    public String display(){
        return "lopHCN{" + "widht"+ widht + "height=" + height + "}";
    }

}
