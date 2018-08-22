
package Logic;
import UI.Presentation;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
This is the class responsible for managing the flow of clients and agents.
 */
public class Dispatcher {
    
    long initTime;
    Presentation UI = new Presentation();       //Object for presentation.
    ExecutorService executor = Executors.newFixedThreadPool(10);
    
    public void attend(Client Client, Employee Employee) {
        Employee.setTask(Client.getOperation());
        CompletableFuture
                .supplyAsync(Employee, executor)
                .thenAccept(time -> {
                    UI.show("The "+Client.getName()+" has made a "+ 
                            Client.getOperation() + " and it takes " + time+
                            "S. Attended by "+ Employee.getName());
                });
    }
    
    public void close() {
        executor.shutdown();
    }
}
