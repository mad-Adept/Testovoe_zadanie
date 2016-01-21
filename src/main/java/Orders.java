import java.util.ArrayList;
import java.util.Map;

/*
Первый отчет состоит из таблицы со столбцами: название блюда, количество, стоимость. После таблицы должна быть напечатана полная стоимость заказа.
Второй отчет состоит из таблицы со столбцами: имя сотрудника, заказанные блюда, стоимость его обеда.
    "firstName": "А.",
    "secondName": "Пупкин",
    "menu": {
      "Product{name='Рис отварной с маслом', weight=170, price=16, list_products=[Рис отварной с маслом]}": 1,
      "Product{name='Рулет с изюмом', weight=75, price=15, list_products=[Рулет с изюмом]}": 1,
      "Product{name='Салат изюменка', weight=100, price=35, list_products=[Салат изюменка]}": 1,
      "Product{name='Печень по королевски', weight=150, price=54, list_products=[Печень по королевски]}": 1
 */

public class Orders {

        public void printPlacedOrder(){
            ArrayList<Worker> workers_list = new Util().getData_Worker();
            for (int iter = 0; iter < workers_list.size(); iter++) {
                for (Map.Entry<Product, Integer> pair : workers_list.get(iter).getMenu().entrySet()) {
                    pair.getKey();
                    pair.getValue();
                    pair.getKey().getPrice();
                }
            }
        }


        public  void printReceivedOrder(){

        }
    }

