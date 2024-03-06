import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Instanciação da clase que implementa o Predicate;
        //list.removeIf(new ProductPredicate());

        // Implementação básica de Predicado;
        //list.removeIf(p -> p.getPrice() >= 100);

        //Implementação com Method Reference com método Estático:
        // list.removeIf(Product::staticProductPredicate);

        //Implementação com Method Reference com método Estático:
         list.removeIf(Product::nonStaticProductPredicate);


        for (Product p : list){
            System.out.println(p);
        }




    }
}