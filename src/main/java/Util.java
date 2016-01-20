import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class Util {

    final static String PATH = "src\\main\\resources";

    public ArrayList<Worker> getData_Worker() {
        Gson gson = new Gson();
        ArrayList<Worker> worker_list = null;
        File f = new File(PATH + "worker.json");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Исключение, создания перменной reader, для пути: src\\main\\resources\\worker.json");
        }
        char[] buffer = new char[(int) f.length()];
        try {
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение, чтения файла в массив buffer, для метода getData_Worker");
        }
        worker_list = gson.fromJson(new String(buffer), ArrayList.class);
        return worker_list;
    }

    public void setData_Worker(ArrayList<Worker> worker_list) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
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
        ArrayList<Product> worker_list = null;
        File f = new File(PATH + "product.json");
        FileReader reader = null;
        try {
            reader = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Исключение, создания перменной reader, для пути: src\\main\\resources\\product.json");
        }
        char[] buffer = new char[(int) f.length()];
        try {
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение, чтения файла в массив buffer, getData_Product");
        }
        worker_list = gson.fromJson(new String(buffer), ArrayList.class);
        return worker_list;
    }

    public void setData_Product(ArrayList<Product> product_list) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(PATH + "product.json");
            writer.write(gson.toJson(product_list));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение, записи в файл, по пути: src\\main\\resources\\product.json ");
        }
    }
}




