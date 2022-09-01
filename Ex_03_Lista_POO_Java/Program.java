import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double ctOposto = sc.nextDouble();
        double Hipotenusa = sc.nextDouble();
        double ctAdjacente = sc.nextDouble();

        Triangulo triangulo = new Triangulo(ctOposto, Hipotenusa, ctAdjacente);
        
        System.out.println(triangulo.tipoTriangulo());
        
        System.out.println(triangulo.area());
        
        System.out.println(triangulo.perimetro());
    }
}

