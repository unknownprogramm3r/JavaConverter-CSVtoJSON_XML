package sda.files.reader;

import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class App {

    public static void main(String[] args) {

        //  Load file
        //  Process file
        //  Print file

        FileLoader fileLoader = new FileLoader();
        List<String> list = fileLoader.loadFile("/media/slawek/DANE/Documents/#Programowanie/Java/CSVReader/src/main/resources/test_csv.csv");

        FileProcessor processor = new FileProcessor();
        List<Map<String, String>> abc = processor.process(list);



    }

}
