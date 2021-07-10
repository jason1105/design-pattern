package com.lvw.designpattern.gof.structure.flyweight.core;

/**
 * Flyweight interface
 */
public interface Human {

    /**
     * shared method for every flyweight object
     *
     * @param name 这是一个外部状态 (extrinsic)
     */
    void description(String name);
}
