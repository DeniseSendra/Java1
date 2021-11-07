
package sendradenisejava1;

import java.util.Scanner;

public class SendraDeniseJava1 {

    public static void main(String[] args) {
     
        Scanner info = new Scanner(System.in);   
        String nombre= "", apellido= "", hobby= "",editor= "",sistema= "";
        int edad= 0;
      
        System.out.println("Bienvenido! Le pedimos que ingrese sus datos");      
        System.out.print("Ingrese su nombre: ");
        nombre = info.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = info.nextLine();
        System.out.print("Ingrese su hobby: ");
        hobby = info.nextLine();
        System.out.print("Ingrese su editor de código favorito: ");
        editor = info.nextLine();
        System.out.print("Ingrese su sistema operativo: ");
        sistema = info.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = info.nextInt();
        
        System.out.println("");
        System.out.println("Muchas gracias  por ingresar sus datos " + nombre + " " + apellido);
        System.out.println("A continuación le mostramos los datos que ha ingresado: ");
        System.out.println("Su edad es de: " + edad + " años");
        System.out.println("En su tiempo libre, su hobby es " + hobby);
        System.out.println("Usted utiliza como sistema operativo " + sistema + 
                " y su editor de código es " + editor);
        
    }
    
}
