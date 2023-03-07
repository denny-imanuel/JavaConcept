package ListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListObject {

    private List<Sales> sales;
    private List<Product> products;
    private List<Customer> customers;

    public ListObject() {
        sales = new ArrayList<Sales>();
        products = new ArrayList<Product>();
        customers = new ArrayList<Customer>();

        sales.add(new Sales(0, "Nick", 0, 0, 10, 100.0F));
        sales.add(new Sales(1, "James", 1, 1, 12, 120.0F));
        products.add(new Product(0, "iPhone 1", 100, 80F));
        products.add(new Product(1, "iPhone 2", 100, 100F));
        customers.add(new Customer(0, "Bob", "Main St", "123"));
        customers.add(new Customer(1, "Bill", "Wall St", "234"));
    }

    public void LeftJoin() {

    }

    public void RightJoin() {

    }

    public void InnerJoin() {

    }

    public void OuterJoin() {

    }

    public void UnionMerge() {

    }

}
