/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import environment.ApplicationStarter;

/**
 *
 * @author kevin.lawrence
 */
public class Tiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Tile Map Test", new TileEnvironment());
    }
    
}
