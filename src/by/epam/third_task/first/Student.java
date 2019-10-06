package by.epam.third_task.first;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилии и номеров групп студентов, имеющих оцнки, равные только 9 и 10.
 */

import java.util.Arrays;

public class Student {

    private final String FIO;
    private int groupNumber;
    private int[] marks;

    public Student(String FIO, int groupNumber) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        marks = new int[5];

        for (int i = 0; i < marks.length; i++){
            marks[i] = (int)(Math.random() * 10 + 1);
        }
    }

    public Student(String FIO, int groupNumber, int[] marks) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public void printGoodStudent(){
        boolean isGood = true;

        for (int i = 0; i < marks.length; i++){

            if (marks[i] != 9 && marks[i] != 10){
                isGood = false;
            }
        }

        if (isGood){
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        String res = FIO + " номер группы " + groupNumber + " оценки: ";

        for (int i = 0; i < marks.length; i++){
            res += marks[i] + " ";
        }

        return res;
    }
}
