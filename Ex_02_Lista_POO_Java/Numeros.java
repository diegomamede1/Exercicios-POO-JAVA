public class Numeros
{
        private int pNumero;
        private int sNumero;
        int impar = 0;
        
        public Numeros(){
            
        }
        
        public Numeros(int pNumero, int sNumero){
            this.pNumero = pNumero;
            this.sNumero = sNumero;
            
        }
        
        public int getPN(){
            return pNumero;
        }
        
        public void setPN(){
            this.pNumero = pNumero;
        }
        
        public int getSN(int pNumero){
            return sNumero;
        }
        
        public void setSN(int sNumero){
            this.sNumero = sNumero;
        }
        
        public int numeroImpar(int pNumero, int sNumero){
            
            for(int i = 0; i < sNumero; i++){   
                if(i % 3 == 0){
                    impar += impar;
                    System.out.println("numeros impares: " + impar);
                    
                }
                else{
                    return 0;
                }
            }
            
            return impar;
        }
} 

