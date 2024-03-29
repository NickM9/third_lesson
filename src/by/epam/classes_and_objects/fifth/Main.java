package by.epam.classes_and_objects.fifth;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы set- и get-
методы и метод toString(). Создать второй класс агрегирующий массив типа Customer, с
подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счёта.
Найти и вывести:
а) список покупателей в алфавитном порядке;
б) список покупателей у которых номер кредитной карточки находится в заданном интервале.
 */

public class Main {
    public static void main(String[] args) {

        Customer[] customers = new Customer[8];
        customers[0] = new Customer(1001, "Иванов", "Иван", "Иванович",
                "Притыцкого, 1", 6556, 50008);
        customers[1] = new Customer(1003, "Селезнев", "Игорь", "Валерьевич",
                "Дзержинского, 1", 6566, 50007);
        customers[2] = new Customer(1008, "Мухина", "Евгения", "Олеговна",
                "Дзержинского, 101", 6582, 50005);
        customers[3] = new Customer(1002, "Воробьёв", "Дмитрий", "Анатольеич",
                "Партизанский, 10", 6545, 50011);
        customers[4] = new Customer(1000, "Ванеев", "Олег", "Николаевич",
                "Независмости, 184", 6592, 50010);
        customers[5] = new Customer(1006, "Леонтьев", "Михаил", "Максимович",
                "Партизанский, 10", 6555, 50015);
        customers[6] = new Customer(1010, "Баранов", "Пётр", "Петрович",
                "Дзержинского, 102", 6584, 5006);
        customers[7] = new Customer(1004, "Васильев", "Василий", "Васильевич",
                "Независмости, 188", 6590, 50011);

        Shop evroopt = new Shop("Евроопт", customers);
        ShopLogic shopLogic = new ShopLogic();

        System.out.println("Список покупателей в алфавитном порядке");
        shopLogic.alphabetSorting(evroopt);
        shopLogic.viewCustomers(evroopt);

        System.out.println("############################################\n");

        System.out.println("Список покупателей с картами в заданном диапазоне : \n");
        shopLogic.cardsInInterval(evroopt, 6550, 6590);
        shopLogic.viewCustomers(evroopt);
    }
}
