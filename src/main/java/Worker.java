import java.util.HashMap;
import java.util.Map;

public class Worker {
    int id;
    String firstName;
    String secondName;
    Map<Product, Integer> menu = new HashMap<Product, Integer>();
    public Worker() {
    }
    public Worker(String f_name,String s_name, Product product_name){
        this.firstName = f_name;
        this.secondName = s_name;
        id++;
        if(chek_servings(product_name)){
            menu.put(product_name, menu.get(product_name) + 1);
        }
        else menu.put(product_name, 1);

    }

    public boolean chek_servings(Product product_name){
        for (Map.Entry<Product, Integer> iterator : menu.entrySet()){
            if (iterator.getKey().equals(product_name)) return true;
        }
        return false;
    }
    public void data(){

    }
}
