
package Logic;

import UI.Presentation;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
The main Thread is here.
 */
public class Principal {

    public static void main(String[] args) {
        Presentation UI = new Presentation(); 
        Employee arrayEmployee[]= fillEmployees();  //Employees Array.
        Client arrayClient[]= fillClients();        //Clients Array.
        Dispatcher Dispatcher = new Dispatcher();   //Object Dispatcher
        
        for(int i=0;i<arrayClient.length;i++) {
            
            for(int j=0;j<arrayEmployee.length;j++){
                if (arrayEmployee[j].getTask().equals("Avalaible")) {
                    Dispatcher.attend(arrayClient[i],arrayEmployee[j]);
                    j = 1000;
                }
                else if (j == arrayEmployee.length-1){try {
                    Thread.sleep(1000);
                    j=0;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Principal.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
}
            }    
        }
        Dispatcher.close();
    }
    public static Employee [] fillEmployees(){
        Employee arrayEmployee[]=new Employee[10];
        Cashier Cashier1 = new Cashier("Cashier1");
        Cashier Cashier2 = new Cashier("Cashier2");
        Cashier Cashier3 = new Cashier("Cashier3");
        Cashier Cashier4 = new Cashier("Cashier4");
        Cashier Cashier5 = new Cashier("Cashier5");
        Cashier Cashier6 = new Cashier("Cashier6");
        Supervisor Supervisor1 = new Supervisor("Supervisor1");
        Supervisor Supervisor2 = new Supervisor("Supervisor2");
        Supervisor Supervisor3 = new Supervisor("Supervisor3");
        Director Director1 = new Director("Director");
        
        arrayEmployee[0] = Cashier1;
        arrayEmployee[1] = Cashier2;
        arrayEmployee[2] = Cashier3;
        arrayEmployee[3] = Cashier4;
        arrayEmployee[4] = Cashier5;
        arrayEmployee[5] = Cashier6;
        arrayEmployee[6] = Supervisor1;
        arrayEmployee[7] = Supervisor2;
        arrayEmployee[8] = Supervisor3;
        arrayEmployee[9] = Director1;
        return arrayEmployee;
    
    }
    public static Client[] fillClients(){
        Client arrayClient[]=new Client[11]; 
        arrayClient[0]=new Client("Client1","Withdraw");
        arrayClient[1]=new Client("Client2","Deposit");
        arrayClient[2]=new Client("Client3","Deposit");
        arrayClient[3]=new Client("Client4","Issue");
        arrayClient[4]=new Client("Client5","Withdraw");
        arrayClient[5]=new Client("Client6","Issue");
        arrayClient[6]=new Client("Client7","Withdraw");
        arrayClient[7]=new Client("Client8","Deposit");
        arrayClient[8]=new Client("Client9","Withdraw");
        arrayClient[9]=new Client("Client10","Deposit");
        arrayClient[10]=new Client("Client11","Deposit");
        
        return arrayClient;
    }
    
    
}
