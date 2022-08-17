import java.util.Scanner;


public class Pontos
{
    Scanner scan = new Scanner(System.in);
    
    double x1;
    double x2;
    double y1;
    double y2;

    public Pontos(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getX1(){
        return x1;
    }
    
    public void setX1(){
        this.x1 = x1;
    }
    
    public double getX2(){
        return x2;
    }
    
    public void setX2(){
        this.x2 = x2;
    }
    
    public double getY1(){
        return y1;
    }
    
    public void setY2(){
        this.y2 = y2;
    }

     public double calcularDistancia(){
        double calculo = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return calculo;
    }
}