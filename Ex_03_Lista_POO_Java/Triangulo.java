public class Triangulo{
    
    private double ctOposto;
    private double hipotenusa;
    private double ctAdjacente;

    public Triangulo(){

    }

    public Triangulo(double ctOposto, double hipotenusa, double ctAdjacente) {
        this.ctOposto = ctOposto;
        this.hipotenusa = hipotenusa;
        this.ctAdjacente = ctAdjacente;
    }

    public double getCtOposto() {
        return ctOposto;
    }

    public void setCtOposto(double ctOposto) {
        this.ctOposto = ctOposto;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getCtAdjacente() {
        return ctAdjacente;
    }

    public void setCtAdjacente(double ctAdjacente) {
        this.ctAdjacente = ctAdjacente;
    }

    public double area() {
        return (getCtAdjacente() * getHipotenusa()) / 2;
    }

    public double perimetro() {
        return getHipotenusa() + getCtAdjacente() + getCtOposto();
    }


    public String tipoTriangulo(){
        if(getCtOposto() == getCtAdjacente() && getCtOposto() == getHipotenusa() && getCtAdjacente() == getHipotenusa()){
            return "O triangulo é equilatero";
        } 
        
        else if (getCtOposto() != getCtAdjacente() && getCtOposto() != getHipotenusa() && getCtAdjacente() != getHipotenusa()){
            return "O triangulo é escaleno";
        }
        
        return "O triangulo é isoceles";
    }
}