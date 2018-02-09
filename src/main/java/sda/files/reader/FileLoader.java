package sda.files.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    public List<String> loadFile (String path) {

        BufferedReader reader = null;

        List<String> tempList = new ArrayList<>();

        try {

            File file = new File(path);
            reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                tempList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return tempList;
    }
}
