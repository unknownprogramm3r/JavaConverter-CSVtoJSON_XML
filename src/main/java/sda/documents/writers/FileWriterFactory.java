package sda.documents.writers;

public class FileWriterFactory {
    public IFileWriter produce(String filePath) {
        IFileWriter result = null;
        if (filePath.endsWith(".csv")) {
            result = new CSVFileWriter();
        }else if (filePath.endsWith(".xml")){
            result = new XMLFileWriter();
        }
        return result;
    }

}
