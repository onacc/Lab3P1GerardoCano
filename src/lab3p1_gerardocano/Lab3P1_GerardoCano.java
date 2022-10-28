/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_gerardocano;
import java.util.Scanner;
/**
 *
 * @author gcano
 */
public class Lab3P1_GerardoCano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
       int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1.Diptongo");
            System.out.println("2.Sumatoria");
            System.out.println("3.Time Clock");
            System.out.println("4.Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    String palabra;
                    System.out.println("Ingrese una palabra");
                    palabra = read.next().toLowerCase();
                    for (int y = 0; y < palabra.length(); y++) {
                        char letra1 = palabra.charAt(y);
                        char letra2 = palabra.charAt(y++);
                        switch(letra1){
                            case 'a':
                            case 'o':
                            case 'i':
                            case 'u':
                            case 'e':
                            if(y<palabra.length()){
                                System.out.println(palabra+" es un diptongo");
                            }
                            else{
                                System.out.println(palabra+" no es diptongo");
                            }
                            break;
                            default:
                            break;
                        }
                                
                        
                    }
                    
                break;
                case 2:
                    double m = 0, v1 = 0 , v2 = 0 , vf =0 , v4 =0   ;
                    System.out.println("Sumatoria de PI");
                    System.out.println("Mientras mas grande el valor que ingrese, mayor es la aprox");
                    System.out.println("Ingrese un limite");
                    m = read.nextDouble();
                    for (int n = 0; n < m; n++) {
                        v2 = 2*n+1;
                        v1 = (double)Math.pow(-1,n)/v2;
                        v4 = v4+v1;
                    }
                    vf = 4*v4;
                    System.out.println("Resultado "+vf);
                    System.out.println();
                break;
                case 3:
                    int e;
                    System.out.println("Time clock");
                    System.out.println("Ingrese un entero impar");
                    e = read.nextInt();
                    if (e %2 !=0){
                         for(int u=0;u<e;u++){
                            for (int l = 0; l < e-u; l++) {
                             System.out.print(" ");//espacios de la izquierda
                    }
                         for (int f = -1; f <=e; f++) {
                        System.out.print("*");
                    }//imprime asterisco
                    System.out.println(" ");//espacios de la derecha*/
                }//fin for inicio
                System.out.println(" ");
            }
                    default:
                    System.out.println(" ");
                break;
            }
       }while (opcion !=4);
        
    }
    
}
