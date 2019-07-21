package com.codingame.game;

public class Action {
    public final int num;
    public Player player;

    public Action(Player player, int num) {
        this.player = player;
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Action) {
            Action other = (Action) obj;
            return num == other.num;
        } else {
            return false;
        }
    }
}