package com.example.brickbreaker_game;

public class Brick {
    private boolean visible;
    int column, row, width, height;

    public Brick(int row, int column, int width, int height) {
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;
        this.visible = true; // Initially visible
    }

    public boolean getVisibility() {
        return visible;
    }

    public void setInvisible() {
        this.visible = false;
    }

    public int getLeft() {
        return column * width;
    }

    public int getRight() {
        return column * width + width;
    }

    public int getTop() {
        return row * height;
    }

    public int getBottom() {
        return row * height + height;
    }
}
