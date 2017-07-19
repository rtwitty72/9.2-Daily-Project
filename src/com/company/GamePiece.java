package com.company;

/**
 * Created by macbookpro on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;



    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;

}

    public int getPositionX() {
        return positionX;

    }

    public int getPositionY() {
        return positionY;

    }

    public boolean isFrozen() {
        return frozen;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int x, int y){
     if (frozen)
         return;
         positionX =  x;
         positionY =  y;

    }

    public void freeze(){
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;


    }
    }







