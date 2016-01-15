import java.util.ArrayList;

public class Worker {
    int id;
    String firstName;
    String secondName;
    ArrayList<Product> menu = new ArrayList();
    public Worker() {
    }
    public Worker(String f_name,String s_name, Product pruduct_name){
        this.firstName = f_name;
        this.secondName = s_name;
        menu.add(pruduct_name);
        id++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (id != worker.id) return false;
        if (!firstName.equals(worker.firstName)) return false;
        if (!secondName.equals(worker.secondName)) return false;
        return !(menu != null ? !menu.equals(worker.menu) : worker.menu != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        return result;
    }
}
