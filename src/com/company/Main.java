package com.company;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();


        //    Verify that if the game piece is not frozen then the call to freeze sets the frozen variable to true.
        {
            assert !GamePiece.getFrozen();
            GamePiece.freeze();
            assert GamePiece.getFrozen();
        }

        //    Verify that if the game piece is frozen then the call to unfreeze sets the frozen variable to false.
        {
            assert GamePiece.getFrozen();
            GamePiece.unfreeze();
            assert !GamePiece.getFrozen();
        }

        //    Verify that if the game piece is not frozen then the call to move results in the new position.
        {
            assert !GamePiece.getFrozen();
            GamePiece.move(25, 25);
            assert GamePiece.getPostionX() == 25 && GamePiece.getPositionY == 25;
        }
//    Verify that if the game piece is frozen then the call to move does not change the position.
        {
            assert GamePiece.getFrozen();
            GamePiece.move(80, 140);
            assert GamePiece.getPostionX() == 25 && GamePiece.getPositionY == 25;
        }

        System.out.println("Assertions passed, yippppeeee!");
    }





