package READING_FILE;

import CLEAN.NULL_find;
import STORE_DATA.storing_data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public read()
    {
        try {
            FileReader f = new FileReader("/run/media/frostknight/HD/workspace vs/mini_project/src/main/java/READING_FILE/somefile.csv");
            BufferedReader br = new BufferedReader(f);
            String columnNames = br.readLine();
            String[] attributes = columnNames.split(",");
            System.out.println("No. of attributes: "+attributes.length);
            for (String attribute : attributes) {
                System.out.print("Parameters:" + " " + attribute);// ONLY do this if it exists
            }
            System.out.println();
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                int id = Integer.parseInt(s[0].trim());
                int year = Integer.parseInt(s[1].trim());
                String city = s[2].trim().replace("\"", "");
//                NULL_find n = new NULL_find();\
                storing_data d = new storing_data(id,year,city);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
