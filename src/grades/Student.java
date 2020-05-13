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
    public String getName(){
       return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    public void getGrades(){
        grades.put();
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

        student2.addGrade(91);
        student2.addGrade(98);
        student2.addGrade(99);
        System.out.println(student2.name +"'s grades are: " + student2.grades);
        System.out.println("The amount of grades " + student2.name + " has is: " + student2.grades.size());
        System.out.println("The average of " + student2.name + "'s grades is: " + student2.getGradeAverage());


    }


}

