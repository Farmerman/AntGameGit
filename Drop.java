/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Drop implements Instruction{
    public Drop(){
    }
    
    void drop(Ant ant){
        ant.dropFood();
    }
}
