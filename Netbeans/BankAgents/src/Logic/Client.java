
package Logic;

/**
This is the class responsible for managing the Clients. 
 */
public class Client {
    
    protected String Name;
    protected String Operation; 

    public Client(String Name, String Operation) {
        this.Name = Name;
        this.Operation = Operation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String Operation) {
        this.Operation = Operation;
    }
    
    
    
    
    
}
