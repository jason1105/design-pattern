package com.lvw.designpattern.gof.structure.composite.core;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Article {

    List<Article> items = new ArrayList<>();

    @Override
    public void add(Article article) {
        items.add(article);
    }

    @Override
    public void remove(Article article) {
        items.remove(article);
    }

    @Override
    public void printArticle() {
        for (Article article : items) {
            article.printArticle();
        }
    }

    @Override
    public double calculate() {
        double sum = 0;

        for (Article article : items) {
            sum += article.calculate();
        }

        return sum;
    }
}
