package com.company.DataStorage.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonRead {

    private String fileName;

    public JsonRead(String fileName) {
        this.fileName = fileName;
    }

    public String jsonRead() {

        Path filePath = Paths.get("src/resources/goods.json");
        String jsonObject = "";
        try {
            jsonObject = new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            System.out.println("cant read file: " + e);
        }
        return jsonObject;
    }


}
