package com.lvw.designpattern.gof.structure.adapter.toolkits;

import com.lvw.designpattern.gof.structure.adapter._3rd.Extent;
import com.lvw.designpattern.gof.structure.adapter._3rd.TextView;

/**
 * Adapter
 */
public class TextShape implements Shape {

    TextView textView; // adaptee

    public TextShape() {
        this.textView = new TextView();
    }

    @Override
    public void move() {
        // customize move for textView
    }

    @Override
    public BoundingBox boundingBox() {
        Extent extent = textView.getExtent();

        BoundingBox box = null;
        // cast extent to BoundingBox
        // BoundingBox box = (BoundingBox) extent;

        return box;
    }
}
