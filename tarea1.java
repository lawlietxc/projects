package javaapplication1;
import java.util.Random;
public class tarea {
    
    public static void main(String[] args) {
    for(int i=0;i<20;i++){
        Random generadorAleatorios = new Random();
    double random = (double) Math.floor(Math.random()*(5-(-5)+1)+(-5));
   // System.out.println("numeros random"+random);
      //  System.out.println();
         //       System.out.println();
        System.out.println(funciond(random));
    }
    /*double b = Math.toRadians(90);
    double s = Math.sin(b); 
    System.out.println(s);*/
    }
    
    public static double funciond(double random){
        /*double func = Math.exp(random)/Math.pow(random, -1);
        double funcc = Math.toRadians(func);
        double funccc= Math.sin(funcc);
        return funccc;*/
        double funcion = Math.sin(Math.toRadians(Math.exp(random)/Math.pow(random, -1)));
        return funcion;        
    }
}
