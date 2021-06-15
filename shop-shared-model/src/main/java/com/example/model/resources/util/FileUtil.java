package com.example.model.resources.util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {
    public static String readFile(String filePath) throws IOException {
        //reading a file
        String expected_value = "Hello";
        Path path = Paths.get(filePath);
        List<String> strings = Files.readAllLines(path);
        String result = strings.stream()
                .collect(Collectors.joining("\n"));
        return result;
    }

    public static void writeFile(String filePath, String content) throws IOException {
        //writing a file
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
}
