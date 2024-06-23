import java.util.ArrayList;

public class ProductManagementSystem {

    ArrayList<Product> listProducts;

    void add(Product product) {
        listProducts.add(product);
    }

    void add(int index, Product product) {
        listProducts.add(index, product);
    }

    Product get(int index) {
        return listProducts.get(index);
    }

    boolean isEmpty() {
        return listProducts.isEmpty();
    }

    boolean remove(Product product) {
        return listProducts.remove(product);
    }

    boolean removeById(String id) {
        return listProducts.removeIf(product -> product.getId().equals(id));
    }

    Product getById(String id) {
        for (Product p : listProducts) {
            if (p.getId().equals(id)) ;
            return p;
        }
        return null;
    }






    @Override
    public String toString() {
        return super.toString();
    }
}
