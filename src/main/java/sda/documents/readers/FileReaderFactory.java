package sda.documents.readers;

public class FileReaderFactory {
    public IFileReader produce(String filePath) {
        IFileReader result = null;
        if (filePath.endsWith(".csv")) {
            result = new CSVFileReader();
        }
        return result;
    }
}
