package javaapplication2;
public class JavaApplication2 {
    
    public static void main(String[] args) {
    for(int i=0;i<20;i++){
    double random = (double) Math.floor(Math.random()*(5-(-5)+1)+(-5));
        System.out.println(funciond(random));
    }
    }
    public static double funciond(double random){
        double funcion = Math.sin(Math.toRadians(Math.exp(random)/Math.pow(random, -1)));
        return funcion;        
    }
}
