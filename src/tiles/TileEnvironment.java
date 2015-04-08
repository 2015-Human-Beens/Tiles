/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import environment.Environment;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author kevin.lawrence
 */
class TileEnvironment extends Environment {
    private TileMap tileMap;
    
    
    public TileEnvironment() {
    
    }

    @Override
    public void initializeEnvironment() {
        tileMap = new TileMap(null, new Dimension(10, 10), new Dimension(5, 5));
        tileMap.setMapVisualizer(new TileMapVisualizer());
    }

    @Override
    public void timerTaskHandler() {
    
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (tileMap != null){
            tileMap.drawMap(graphics);
        }
    }
    
}
