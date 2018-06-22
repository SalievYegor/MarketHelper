package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class JsonRead {

    private String fileName;

    public JsonRead(String fileName) {
        this.fileName = fileName;
    }

    public String jsonRead() {

        Path filePath = Paths.get("src/main/resources/" + fileName + ".json");
        String jsonObject = "";
        List productList = new LinkedList();
        try {
            jsonObject = new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            System.out.println("cant read file: " + e);
        }
        return jsonObject;
    }
}