package com.devfuner.study.jackson.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Body {

    @JacksonXmlElementWrapper(useWrapping = true, localName = "items")
    private List<Item> items;

    public Body() {
    }

    public Body(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Body{" +
                "items=" + items +
                '}';
    }
}
