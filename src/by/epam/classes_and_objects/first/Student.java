package by.epam.classes_and_objects.first;

/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилии и номеров групп студентов, имеющих оцнки, равные только 9 и 10.
 */

import java.util.Arrays;
import java.util.Objects;

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

    public String getFIO() {
        return FIO;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        String res = FIO + " номер группы " + groupNumber + " оценки: ";

        for (int i = 0; i < marks.length; i++){
            res += marks[i] + " ";
        }

        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return groupNumber == student.groupNumber &&
                FIO.equals(student.FIO) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(FIO, groupNumber);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }
}
