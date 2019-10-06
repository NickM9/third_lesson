package by.epam.third_task.fifth;

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

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankNumber;

    public Customer (int id, String surname, String name, String patronymic,
                     String address, int creditCardNumber, int bankNumber){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankNumber = bankNumber;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setCreditCardNumber(int creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardNumber(){
        return creditCardNumber;
    }

    public void setBankNumber(int bankNumber){
        this.bankNumber = bankNumber;
    }

    public int getBankNumber(){
        return bankNumber;
    }

    @Override
    public String toString(){
        return "id : " + id + "\n" +
                "Фамилия : " + surname + "\n" +
                "Имя : " + name + "\n" +
                "Отчество : " + patronymic + "\n" +
                "Адресс : " + address + "\n" +
                "Номер кредитной карты : " + creditCardNumber + "\n" +
                "Номер банковского счёта : " + bankNumber + "\n" +
                "---------------------------------------------------\n";
    }
}
