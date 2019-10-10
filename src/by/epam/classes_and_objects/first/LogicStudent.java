package by.epam.classes_and_objects.first;

public class LogicStudent {

    public Student[] takeGoodStudent(Student[] students){
        Student[] goodStudents;
        goodStudents = new Student[countOfFoodStudents(students)];
        int goodIndex = 0;

        for (int i = 0; i < students.length; i++){
            if (isGoodStudent(students[i])){
                goodStudents[goodIndex] = students[i];
                goodIndex++;
            }
        }

        return goodStudents;
    }

    public int countOfFoodStudents(Student[] students){
        int goodCount = 0;

        for (int i = 0; i < students.length; i++){
            if (isGoodStudent(students[i])){
                goodCount++;
            }
        }
        return goodCount;
    }

    public boolean isGoodStudent(Student student){
        boolean isGood = true;

        for (int i = 0; i < student.getMarks().length; i++){

            if (student.getMarks()[i] < 9){
                isGood = false;
            }
        }
        return isGood;
    }

}
