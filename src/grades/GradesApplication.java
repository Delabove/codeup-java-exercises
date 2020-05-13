package grades;

import oop.Person;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap();


        Student bif = new Student("DeLayne");

        bif.addGrade(90);
        bif.addGrade(95);
        bif.addGrade(92);

        Student packer = new Student("Jacques");

        packer.addGrade(91);
        packer.addGrade(98);
        packer.addGrade(99);

        Student opdiamond = new Student("Grayson");

        opdiamond.addGrade(97);
        opdiamond.addGrade(99);
        opdiamond.addGrade(99);

        Student bigcountry = new Student("Jade");

        bigcountry.addGrade(92);
        bigcountry.addGrade(93);
        bigcountry.addGrade(94);

        students.put(bif.getName(), bif);
        students.put(packer.getName(), packer);
        students.put(opdiamond.getName(), opdiamond);
        students.put(bigcountry.getName(), bigcountry);

        for(String id: students.keySet()){
            System.out.println("id = " + id);
        }


    }
}
