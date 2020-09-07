package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) throws IOException{
        File employeesFile = new File(
            System.getProperty("user.dir") + "\\resources\\employees.txt");
        BufferedReader br = null;
            br = new BufferedReader(new FileReader(employeesFile));
            String st = "";
            if(st == null){
                throw new NullPointerException();
            }
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }



    }
}

