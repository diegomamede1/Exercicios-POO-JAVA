public class Funcionario
{
    double salarioBase;
    int qtdFilhos;
    double inss;
    int valeTransporte;
    int adicionalNoturno;
    int Vendedor;
    double porcentagemVendas;
    double salarioFinal;
    
    public double calculoSalario(){
        salarioBase -= salarioBase * 0.13;
        
        if(qtdFilhos > 0){
            if(qtdFilhos > 3){
                qtdFilhos = 3;
            }
            
            salarioBase += qtdFilhos * 50;
            
        }
        if(valeTransporte == 1){
            
            salarioBase -= (salarioBase * 0.03);
            
        }
        if(adicionalNoturno == 1){
            
            salarioBase += (salarioBase * 0.05);
            
        }
        if(Vendedor == 1){
            
            salarioBase += (porcentagemVendas * 0.02);
            
        }
        
        salarioFinal = salarioBase;
        
        return salarioFinal;
    }
}