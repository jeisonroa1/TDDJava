/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author jroa
 */
public class Calc {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String operation = "+";
        while (!"q".equals(operation)) // Mientras la operación no sea q
        {
            double n1 = Calc.LecturaN1(); // Lectura numero 1
            double n2 = Calc.LecturaN2(); // Lectura numero 2
            operation = Calc.LecturaOperacion(); // Lectura Operacion
            System.out.println("Your answer is " + Calc.Resultado(n1, n2, operation)); // Imprime el resultado
        
        }
    }
    
    public static double LecturaN1(){
        
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = scannerObject.nextDouble();
        return n1;
        
        
    }
    
    public static double LecturaN2(){
        
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the second number");
        double n2 = scannerObject.nextDouble();
        return n2;
        
        
    }
    
    public static String LecturaOperacion(){
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation: (+,-,*,/,q Salir, l Log)");
        String operation = op.next();       
        return operation;
    }
    

    public static String Resultado(double n1,double n2, String operation){
        
        String value;
        double values;
        switch (operation)  {
        case "+":
            values = n1+n2;
            value = String.format ("%.2f", values);
            return value;

        case "-":
            values = n1-n2;
            value = String.format ("%.2f", values);
            return value;

        case "/":
            if (n2!= 0 ){
            values = n1/n2;
            value = String.format ("%.2f", values); 
            }
            else{
                value = "INF";
            }
            return value;

        case "*":
            values = n1*n2;
            value = String.format ("%.2f", values);
            return value;

        default:
            value = "ERROR DE OPERACION";
            return value;

        }
        
        
    }
    
//    public static String suma(double a, double b){
//        
//        double values = a+b;
//        String value = String.format ("%.2f", values);
//    return value;
//        
//    }
//    
//    public static String resta(double a, double b){
//        double values = a-b;
//        String value = String.format ("%.2f", values);
//    return value;
//        
//    }
//    
//    public static String multiplicacion(double a, double b){
//        double values = a*b;
//        String value = String.format ("%.2f", values);
//    return value;
//        
//    }
//    public static String division(double a, double b){
//        String value;
//        if (b!= 0 ){
//            double values = a/b;
//            value = String.format ("%.2f", values); 
//        
//        }
//        else{
//            value = "INF";
//        }
//        
//    return value;
//        
//    }
    
    
    
}
