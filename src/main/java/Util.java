import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class Util {

    private final static String PATH = "src\\main\\resources\\";

    public ArrayList<Worker> getData_Worker() {
        Gson gson = new Gson();
        ArrayList<Worker> worker_list = new ArrayList();
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(PATH + "worker.json"));
            worker_list = gson.fromJson(buffer, ArrayList.class);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Исключение, чтения файла из метода getData_Worker(), для пути src\\main\\resources\\worker.json");
        }
        return worker_list;
    }

    public void setData_Worker(ArrayList<Worker> worker_list) {
        try {
            Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(PATH + "worker.json");
            writer.write(gson.toJson(worker_list));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение, записи в файл, по пути: src\\main\\resources\\worker.json ");
        }
    }

    public ArrayList<Product> getData_Product() {
        Gson gson = new Gson();
        ArrayList<Product> products_list = null;
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(PATH + "worker.json"));
            products_list = gson.fromJson(buffer, ArrayList.class);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Исключение, чтения файла из метода getData_Product(), для пути src\\main\\resources\\product.json");
        }
        return products_list;
    }

    public void setData_Product(ArrayList<Product> product_list) {
        try {
            Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(PATH + "product.json");
            writer.write(gson.toJson(product_list));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение, записи в файл, по пути: src\\main\\resources\\product.json ");
        }
    }
}




