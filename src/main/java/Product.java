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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getName_products() {
        return name_products;
    }

    public void setName_products(ArrayList<String> name_products) {
        this.name_products = name_products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        if (price != product.price) return false;
        if (!name.equals(product.name)) return false;
        return name_products.equals(product.name_products);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + price;
        result = 31 * result + name_products.hashCode();
        return result;
    }
}
