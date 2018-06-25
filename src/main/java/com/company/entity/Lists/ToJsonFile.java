package com.company.entity.Lists;

import com.company.entity.Goods;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.List;

public class ToJsonFile {

    public void writeToFile(List<? extends Goods> list,String newFileName ) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        mapper.setDateFormat(sdf);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String arrayToJson = mapper.writeValueAsString(list);
        File file = new File("src/resources/" + newFileName + ".json");
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(arrayToJson);
        bw.close();
    }
}
