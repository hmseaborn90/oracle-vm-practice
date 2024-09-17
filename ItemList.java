/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import java.util.Arrays;


/**
 *
 * @author opc
 */
public class ItemList implements Handler{

    private Clothing[] items;
    
    public ItemList(Clothing[] itemsArray) {
        this.items = itemsArray;
    }
    
    
    @Override
    public void accept(ServerRequest req, ServerResponse res){
        res.status(Http.Status.OK_200);
        
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");
        
        StringBuilder result = new StringBuilder();
        
        for (var item : items){
            result.append(item+"\n");
        }
        
        res.send(result);
        
    }
    
}
