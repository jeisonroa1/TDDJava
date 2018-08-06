
package calc;

/**
 *
 * @author JR
 */
public class Log {
    String log;
    
    String formato(double n1, double n2, String operation) {
        String cadena = ("\n" + n1 + " " + operation + " " + n2 + " " + "="+ " "
                    + Calc.Resultado(n1, n2, operation) );
        return cadena;
    }

    public void agregarEntrada(String salida) {
        log += salida;
    }
    
    public String imprimirLog() {
        return log;
    }
    
    
}
