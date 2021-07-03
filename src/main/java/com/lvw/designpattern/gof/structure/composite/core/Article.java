package com.lvw.designpattern.gof.structure.composite.core;

public interface Article {

    void add(Article article);

    void remove(Article article);

    void printArticle();

    double calculate();
}
