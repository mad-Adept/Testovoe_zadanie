import java.util.ArrayList;

public class Start {
        public static void main(String[] args) {
                Data data = new Data();
                ArrayList<Worker> workers_list = new Util().getData_Worker();
                for (Worker w : workers_list){
                        System.out.println(w);
                }
        }
}