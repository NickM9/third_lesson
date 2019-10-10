package by.epam.classes_and_objects.fifth;

import java.util.Arrays;
import java.util.Objects;

public class Shop {

    private String shopName;
    private Customer[] customers;

    public Shop(String shopName, Customer[] customers){
        this.shopName = shopName;
        this.customers = customers;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(shopName, shop.shopName) &&
                Arrays.equals(customers, shop.customers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(shopName);
        result = 31 * result + Arrays.hashCode(customers);
        return result;
    }
}
