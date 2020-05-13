package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

public Student(String name){
    this.name = name;
    this.grades = new ArrayList<>();

}
    // returns the student's name
    public String getName(String name){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int sumOfAllGrades = 0;
       for(int grade :  grades ){
           sumOfAllGrades += grade;
       }
       return sumOfAllGrades / grades.size();
    }


    public static void main(String[] args) {

    Student student1 = new Student("DeLayne LaBove");
    Student student2 = new Student("Jacques Boutte");


        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(92);
        System.out.println(student1.name +"'s grades are: " + student1.grades);
        System.out.println("The amount of grades " + student1.name + " has is: " + student1.grades.size());
        System.out.println("The average of " + student1.name + "'s grades is: " + student1.getGradeAverage());

    }


}

