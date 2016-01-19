import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Util{
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArrayList getData() {
               Gson gson = new Gson();
        try {

            File f = new File("src\\main\\resources\\users.json");
            FileReader reader = new FileReader(f);
            char[] buffer = new char[(int) f.length()];
            reader.read(buffer);
            ArrayList<User> list = gson.fromJson(new String(buffer), ArrayList.class);
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Исключение 2!");
        }
    }
}

