package sda.documents;

import sda.documents.converters.DocumentConverter;
import sda.documents.converters.IDocumentConverter;
import sda.documents.exceptions.FileReaderException;
import sda.documents.exceptions.FileWriterException;

public class App
{
    public static void main( String[] args ) {
        String inputFilePath = "/media/slawek/DANE/Documents/#Programowanie/Java/sda_j5_documentconverter (copy)/src/main/java/sda/documents/files/in.csv";
        String outputFilePath = "/media/slawek/DANE/Documents/#Programowanie/Java/sda_j5_documentconverter (copy)/src/main/java/sda/documents/files/out.csv";

        IDocumentConverter documentConverter = new DocumentConverter();
        try {
            documentConverter.convert(inputFilePath, outputFilePath);
        } catch (FileReaderException e) {
            System.out.println("BŁĄD! ODCZYTANIE PLIKU NIE POWIODŁO SIĘ!");
        } catch (FileWriterException e) {
            System.out.println("BŁĄD! ZAPISANIE PLIKU NIE POWIODŁO SIĘ!");
        }
    }
}
