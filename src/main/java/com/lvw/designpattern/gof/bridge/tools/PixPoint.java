package com.lvw.designpattern.gof.bridge.tools;

import lombok.Data;

/**
 * 像素点
 */
public class PixPoint extends Point {

    private int color;

    public PixPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


}
