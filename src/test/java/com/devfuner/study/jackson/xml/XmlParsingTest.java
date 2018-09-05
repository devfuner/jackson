package com.devfuner.study.jackson.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class XmlParsingTest {

    @Test
    public void xml() throws Exception {
        XmlParsing xmlParsing = new XmlParsing();

        String xml = xmlParsing.xml();

        System.out.println(xml);
    }
}