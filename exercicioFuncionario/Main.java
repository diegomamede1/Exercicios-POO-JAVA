import java.util.Scanner;

public class Main
{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario(); 
        
        System.out.println("Insira salario base: ");
        f1.salarioBase = sc.nextDouble();
        
        System.out.println("Insira a quantidade de filhos: ");
        f1.qtdFilhos = sc.nextInt();
        
        System.out.println("Usa vale transporte? responda 1 para sim ou 2 para não");
        f1.valeTransporte = sc.nextInt();
        
        System.out.println("Trabalha a noite? responda 1 para sim ou 2 para não");
        f1.adicionalNoturno = sc.nextInt();
        
        System.out.println("O funcionário é vendedor? responda 1 para sim ou 2 para não");
        f1.Vendedor = sc.nextInt();
        if(f1.Vendedor == 1){
            System.out.println("Digite o percentual de vendas: ");
            f1.porcentagemVendas = sc.nextDouble();
        }
        
        f1.calculoSalario();
        
        System.out.println("Salarío final que a empresa tera que pagar para o funcionário é: " + f1.salarioFinal);
        
   }
}
   
   


