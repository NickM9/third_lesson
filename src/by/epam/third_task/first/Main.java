package by.epam.third_task.first;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилии и номеров групп студентов, имеющих оцнки, равные только 9 и 10.
 */

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Игорев И.И.", 3, new int[]{9, 10, 9, 10, 9});
        students[1] = new Student("Селезнёв С.С.", 3);
        students[2] = new Student("Воробьёв В.В.", 1, new int[]{10, 10, 10, 10, 10});
        students[3] = new Student("Иванов И.И.", 3, new int[]{1, 3, 7, 6, 9});
        students[4] = new Student("Баранов Б.Б.", 2, new int[]{10, 9, 10, 9, 10});
        students[5] = new Student("Мухин М.М.", 1);
        students[6] = new Student("Валерьянов В.В.", 1);
        students[7] = new Student("Иванов И.А.", 2);
        students[8] = new Student("Семашко В.А.", 2);
        students[9] = new Student("Навальный И.В.", 3);

        System.out.println("Список всех студентов : ");
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }
        System.out.println("----------------------------\n");

        System.out.println("Список отличноиков : ");
        for (int i = 0; i < students.length; i++){
            students[i].printGoodStudent();
        }

    }
}
