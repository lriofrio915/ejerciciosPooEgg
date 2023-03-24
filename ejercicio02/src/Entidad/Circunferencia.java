package Entidad;

public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double Area(Circunferencia objetoCircunferencia){
        double A;
        A = Math.PI * Math.pow(objetoCircunferencia.getRadio(), 2);
        return A;
    }
    
    public double Perimetro(Circunferencia objetoCircunferencia){
        double B;
        B = 2 * Math.PI * objetoCircunferencia.getRadio();
        return B;
    }
    
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

    
    
}


