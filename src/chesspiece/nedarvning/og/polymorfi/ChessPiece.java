/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chesspiece.nedarvning.og.polymorfi;

import javafx.scene.paint.Color;

/**
 *
 * @author jibba_000
 */
public abstract class ChessPiece {
    private String name;
    private Color color;
    private int xPosition;
    private int yPosition;
    
    public ChessPiece(String name, Color color, int xPosition, int yPosition){
        name = this.name;
        color = this.color;
        xPosition = this.xPosition;
        yPosition = this.yPosition;
    }
    public boolean canMoveTo(int x, int y){
        if((x >= 1 && x <= 8)&&
                (y >= 1 && y <= 8)&&
                (x != xPosition && y != yPosition)){
        
        return true;
        
    }
        else{
            return false;
        }
    }
    public String positionToField(int x, int y){
        return x > 1 && x < 8 ? String.valueOf((char)(x + 'A' - 1) + "," + y) : null ;
    }
    
}
