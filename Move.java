/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Move implements Instruction {
    public Move(){
    }
    
    public void move(Ant ant, World world){
        world.moveAnt(ant);
    }
}
