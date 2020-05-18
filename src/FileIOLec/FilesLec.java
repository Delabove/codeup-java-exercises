package FileIOLec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FilesLec {
    public static void main(String[] args) {
//        absolute vs relative
//        /: when a path starts with /, it refers to the filesystem root,
//        otherwise it is used to separate directories in a path
//       .: current directory
//       ..: parent directory
//
//        -Always know where you are
//        -Save data in another folder outside of src, its not supposed to
//        have things that are not java.
//        thing

//        1. Work with a directory. Ask yourself: "What do I have to
//        work with.
//        PATH FIRST:
//        Define name
        String directory = "data";
//        Define file name
        String filename = "info.txt";
        String secondName = "names.csv";

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        List<String> numberList = Arrays.asList("1", "2", "5", "8", "90");

//        Make sure the directory exists and if not, create it.
//        below is where the file will live
        Path dataDirectory = Paths.get(directory);

//        below is where the file will live

        Path dataFile = Paths.get(directory, filename);
        Path mySecondFile = Paths.get(directory, secondName);

//        <import the class to make red diappear>


        if (Files.notExists(dataDirectory)) {
//            add try..

            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException exp){
                System.out.println("Problems creating the directory");
                exp.printStackTrace();
            }


        }


        if (! Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e){
                System.out.println("Problems creating file");
                e.printStackTrace();
            }
        }

//         WE ARE OPENING DIRECTORIES WITH FILES INSIDE OF THEM INSIDE OF JAVA.
//        JUST LIKE THE FINDER FILE ON YOUR COMPUTER, YOUR FILES NEED FOLDERS
//        TO STORE.
//        !!! CHECK YOURSELF BEFORE YOU WRECK YOURSELF
//        "/" to dataDirectory will give another level of directory


//    In order to write files provide 2 paramaters... file path and List


    try {
        Files.write(dataFile, numberList);
        Files.write(mySecondFile, groceryList);
    } catch (IOException e){
        System.out.println("Problem with file.");
        e.printStackTrace();
    }

    try {
        List<String> lines = Files.readAllLines(dataFile);
        for (String line: lines){
            System.out.println("line = " + line);
        }
    } catch (IOException e){
        System.out.println("Problems reading the file");
        e.printStackTrace();
    }
    }
}
