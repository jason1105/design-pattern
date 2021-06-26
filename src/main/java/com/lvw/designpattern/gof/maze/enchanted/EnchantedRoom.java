package com.lvw.designpattern.gof.maze.enchanted;

import com.lvw.designpattern.gof.maze.default_.Room;

public class EnchantedRoom extends Room {

    Spell spell;

    public EnchantedRoom(int _roomNumber, Spell spell) {
        super(_roomNumber);
        this.spell = spell;
    }
}

class Spell {
    private String spell;

    public Spell(String spell) {
        this.spell = spell;
    }
}