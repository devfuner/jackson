package com.devfuner.study.jackson.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.List;

public class XmlParsing {

    public String xml() throws IOException {

        File file = new ClassPathResource("data.xml").getFile();

        XmlMapper mapper = new XmlMapper();

        String xml = inputStreamToString(new FileInputStream(file));

        Response root = mapper.readValue(xml, Response.class);
        List<Item> list = root.getBody().getItems();

        return root.toString();
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
