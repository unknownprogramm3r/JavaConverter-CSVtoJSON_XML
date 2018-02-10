package sda.documents.converters;

import sda.documents.exceptions.FileReaderException;
import sda.documents.exceptions.FileWriterException;
import sda.documents.readers.FileReaderFactory;
import sda.documents.writers.FileWriterFactory;
import sda.documents.readers.IFileReader;
import sda.documents.writers.IFileWriter;

import java.util.List;
import java.util.Map;

public class DocumentConverter implements IDocumentConverter {

    @Override
    public void convert(String inputFilePath, String outputFilePath) throws FileReaderException, FileWriterException {
        //wczytanie pliku
        FileReaderFactory fileReaderFactory = new FileReaderFactory();
        IFileReader reader = fileReaderFactory.produce(inputFilePath);
        List<Map<String, String>> data = reader.read(inputFilePath);

        //zapis do pliku
        FileWriterFactory fileWriterFactory = new FileWriterFactory();
        IFileWriter fileWriter = fileWriterFactory.produce(outputFilePath);
        fileWriter.write(outputFilePath, data);
    }
}
