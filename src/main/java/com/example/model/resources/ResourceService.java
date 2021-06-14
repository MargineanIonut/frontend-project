package com.example.model.resources;

import com.example.model.config.CarouselConfig;
import com.example.model.resources.base.GlobalResource;
import com.example.model.resources.base.ShopResource;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceService {
    @Value("${storage.path}")
    String storagePath;

    private String resolveStorageFilePath(ShopResource res) {
        String path = storagePath + res.getTheme().name().toLowerCase()+ "/" +
                res.getLang().name().toLowerCase() + "/" + res.getFileName();
        return path;
    }

    private String resolveStorageFilePath(GlobalResource res) {
        String path = storagePath +"global" + "/" + res.getFileName();
        return path;
    }

    public String readFile(String filePath) throws IOException {
        //reading a file
        String expected_value = "Hello";
        Path path = Paths.get(filePath);
        List<String> strings = Files.readAllLines(path);

        String result = strings.stream()
                .collect(Collectors.joining("\n"));
        return result;
    }

    public void writeFile(String filePath, String content) throws IOException {
        //writing a file
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }

    public String readResource(GlobalResource resource) throws IOException {
        String filePath = resolveStorageFilePath(resource);
        return readFile(filePath);
    }

    public String readResource(ShopResource resource) throws IOException {
        String filePath = resolveStorageFilePath(resource);
        return readFile(filePath);
    }
}
