package by.epam.third_task.fifth;

public class Shop {

    private String shopName;
    private Customer[] customers;

    public Shop(String shopName, Customer[] customers){
        this.shopName = shopName;
        this.customers = customers;
    }

    public void alphabetSorting(){
        for (int i = 0; i < customers.length-1; i++){
            int min = i;
            for (int j = i+1; j < customers.length; j++){

                if (customers[min].getSurname().compareTo(customers[j].getSurname()) > 0){
                    min = j;
                }
                else if (customers[min].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[min].getName().compareTo(customers[j].getName()) > 0) {
                    min = j;
                }
                else if (customers[min].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[min].getName().compareTo(customers[j].getName()) == 0 &&
                        customers[min].getPatronymic().compareTo(customers[j].getPatronymic()) > 0){
                    min = j;
                }
            }

            Customer tmp = customers[i];
            customers[i] = customers[min];
            customers[min] = tmp;
        }

        for (Customer i : customers){
            System.out.println(i.toString());
        }
    }

    public void cardsInInterval(int left, int right){
        for (int i = 0; i < customers.length; i++){

            if (customers[i].getCreditCardNumber() >= left && customers[i].getCreditCardNumber() <= right){
                System.out.println(customers[i].toString());
            }

        }
    }
}
