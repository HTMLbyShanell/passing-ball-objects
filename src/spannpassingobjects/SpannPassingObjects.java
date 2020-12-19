/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spannpassingobjects;

/**
 *
 * @author shanell spann
 */
public class SpannPassingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ball baseball = new Ball(3.00, 3.65, 9.25, "white", "baseball");
        Ball basketball = new Ball(16.00, 7.65, 28.25, "orange", "basketball");
        
        Catcher c = new Catcher();
        c.catchBall(baseball);
        c.catchBall(basketball);
    };
    
}
