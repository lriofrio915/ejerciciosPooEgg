package Service;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro(){
        Libro objetoLibro = new Libro ();
        System.out.println("--------------------------------------------------");
        System.out.println("    INGRESE LOS SIGUIENTES DATOS DEL LIBRO  ");
        System.out.println("--------------------------------------------------");
        System.out.print("       ISBN: ");
        objetoLibro.setISBN(read.nextLine());
        System.out.print("       TÍTULO: ");
        objetoLibro.setTitulo(read.nextLine());
        System.out.print("       AUTOR: ");
        objetoLibro.setAutor(read.nextLine());
        System.out.print("       NÚMERO DE PÁGINAS: ");
        objetoLibro.setNumPaginas(read.nextInt());
        
        return objetoLibro;
    }
    
    public void mostrarLibro(Libro objetoLibro){
        System.out.println("--------------------------------------------------");
        System.out.println("    LOS DATOS DEL LIBRO SON LOS SIGUIENTES  ");
        System.out.println("--------------------------------------------------");
        
        String a, b, c;
        int d;
        a = objetoLibro.getISBN();
        b = objetoLibro.getTitulo();
        c = objetoLibro.getAutor();
        d = objetoLibro.getNumPaginas();
        
        System.out.println("ISBN: " + a);
        System.out.println("TíTULO: " + b);
        System.out.println("AUTOR: " + c);
        System.out.println("NúMERO DE PáGINAS: " + d);
        
    }

   

}
