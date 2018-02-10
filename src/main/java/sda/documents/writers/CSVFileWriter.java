package sda.documents.writers;

import sda.documents.exceptions.FileWriterException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CSVFileWriter implements IFileWriter {

    @Override
    public void write(String filePath, List<Map<String, String>> data) throws FileWriterException {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            List<String> rows = prepareRows(data);

            for (String row : rows) {
                bufferedWriter.write(row+"\n");
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new FileWriterException(e.getMessage(), e);
        }
    }

    private List<String> prepareRows(List<Map<String, String>> data) {
        List<String> result = new ArrayList<>();

        result.add("<root>");

        List<String> headers = new ArrayList<>();
        for (String key : data.get(0).keySet()) {
            headers.add(key);
        }
        String headerRow = "";
        for (String header : headers) {
            headerRow = headerRow + header + ";";
        }
        result.add(headerRow);

        for (Map<String, String> rowData : data) {
            String row = "";
            for (String header : headers) {

            row = row + rowData.get(header) + header;

            }

        }
        return result;
    }

}
