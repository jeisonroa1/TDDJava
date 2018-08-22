/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.function.Supplier;



/**
This is the class responsible for managing the agents.
 */
public abstract class Employee implements Supplier <String>{
    
    protected String Name;
    protected String Task = "Avalaible"; 
    protected long LastTime;
    Random r=new Random();

    public Employee(String Name) {
        this.Name = Name;
    }
    
    
    public void deposit (){
        try {
            LastTime = (r.nextInt(15-10)+10)*1000; 
            Thread.sleep(LastTime); 
            this.setTask("Avalaible");
        } catch (InterruptedException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void withdraw (){
        try {
            LastTime = (r.nextInt(15-10)+10)*1000; 
            Thread.sleep(LastTime);
            this.setTask("Avalaible");
        } catch (InterruptedException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void issueSolution (){
        try {
            LastTime = (r.nextInt(15-10)+10)*1000; 
            Thread.sleep(LastTime);
            this.setTask("Avalaible");
        } catch (InterruptedException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public double getLastTime() {
        return LastTime;
    }

    public void setLastTime(long LastTime) {
        this.LastTime = LastTime;
    }

    
    @Override
    public String get() {
        if ("Withdraw".equals(this.getTask())) {this.withdraw();}
        if ("Deposit".equals(this.getTask())) {this.deposit();}
        if ("Issue".equals(this.getTask())) {this.issueSolution();}
        return String.valueOf(LastTime/1000);
    }
    
   
    
    
}
