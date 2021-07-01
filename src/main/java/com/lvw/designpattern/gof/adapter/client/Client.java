package com.lvw.designpattern.gof.adapter.client;

import com.lvw.designpattern.gof.adapter.toolkits.BoundingBox;
import com.lvw.designpattern.gof.adapter.toolkits.TextShape;

public class Client {
    public static void main(String[] args) {
        TextShape textShape = new TextShape();
        BoundingBox boundingBox = textShape.boundingBox();

    }
}
