package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {
    
    
    public Circunferencia crearCircunferencia(){
        
         Scanner read = new Scanner(System.in).useDelimiter("\n");
         Circunferencia objetoCircunferencia = new Circunferencia();
         System.out.println("--------------------------------------------------");
         System.out.println("    INGRESE EL VALOR DEL RADIO  ");
         System.out.println("--------------------------------------------------");
         objetoCircunferencia.setRadio(read.nextDouble());
         
         double y = objetoCircunferencia.getRadio();
         double x = objetoCircunferencia.Area(objetoCircunferencia);
         
         objetoCircunferencia.setArea(x);
         objetoCircunferencia.setPerimetro(objetoCircunferencia.Perimetro(objetoCircunferencia));
         
         return objetoCircunferencia;
    }
}


//public class CircunService {
//    
//    public Circunferencia crearCircunferencia(){
//        
//        Scanner read = new Scanner(System.in);
//        Circunferencia miCirculo = new Circunferencia();
//        
//        System.out.println("Ingrese el radio");
//        miCirculo.setRadio(read.nextDouble());
//        //Cálculo del área y setteo del mismo
//        double y = miCirculo.getRadio();
//        double x= miCirculo.calculoArea(y);
//        miCirculo.setArea(x);   
//        //Cálculo del períemtro  y setteo del mismo
//        miCirculo.setPerimetro(miCirculo.calculoPerimetro(miCirculo.getRadio()));
//        
//        return miCirculo;
// 
//    }
//    
//    
//}