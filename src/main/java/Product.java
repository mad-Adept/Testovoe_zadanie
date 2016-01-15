import java.util.ArrayList;

public class Product {
    String name;
    int weight;
    int price;
    ArrayList<String> name_products = new ArrayList();

    public Product() {
    }

    public Product(String name, int weight, int price) {
        if (check_name(name)){
            System.out.println("Product name already exists!");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
        name_products.add(name);
    }

    public boolean check_name (String name){
        for (String iterator : name_products){
            if (iterator.equals(name)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name.equals(product.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
