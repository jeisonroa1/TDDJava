
package calc;

import java.util.Scanner;

public class Calc {

 
    static Scanner scannerObject = new Scanner(System.in);
    static Log log = new Log();
    public static void main(String[] args) {
        // TODO code application logic here
        String operation = "+";
        while (!"q".equals(operation)) // Mientras la operación no sea q
        {
            double n1 = Calc.LecturaN1(); // Lectura numero 1
            double n2 = Calc.LecturaN2(); // Lectura numero 2
            operation = Calc.LecturaOperacion(); // Lectura Operacion
            String salida = log.formato(n1,n2,operation);
            log.agregarEntrada(salida); // Agrega al log
            System.out.println(salida); // Imprime el resultado
        
        }
    }
    
    public static double LecturaN1(){
        System.out.println("Enter first number");
        double n1 = scannerObject.nextDouble();
        return n1;    }
    
    public static double LecturaN2(){
        System.out.println("Enter the second number");
        double n2 = scannerObject.nextDouble();
        return n2;    }
    
    public static String LecturaOperacion(){
        System.out.println("Enter your operation: (+,-,*,/,q Salir, l Log)");
        String operation = scannerObject.next();       
        return operation;    }    

    public static String Resultado(double n1,double n2, String operation){
        switch (operation)  {
        case "+":   return String.format ("%.2f", n1+n2);
        case "-":   return String.format ("%.2f", n1-n2);
        case "/":   if (n2!= 0 ){ return String.format ("%.2f", n1/n2);  }
                    else{   return "INF";      }
        case "*":   return String.format ("%.2f",n1*n2);
        case "l":   return log.imprimirLog();
        default:    return "ERROR DE OPERACION";     }
    }
    
// /*
    public static String suma(double a, double b){
        
        double values = a+b;
        String value = String.format ("%.2f", values);
    return value;
        
    }
    
    public static String resta(double a, double b){
        double values = a-b;
        String value = String.format ("%.2f", values);
    return value;
        
    }
    
    public static String multiplicacion(double a, double b){
        double values = a*b;
        String value = String.format ("%.2f", values);
    return value;
        
    }
    public static String division(double a, double b){
        String value;
        if (b!= 0 ){
            double values = a/b;
            value = String.format ("%.2f", values); 
        
        }
        else{
            value = "INF";
        }
        
    return value;
        
    }
    // */
}
