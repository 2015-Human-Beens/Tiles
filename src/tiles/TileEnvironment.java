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
class TileEnvironment extends Environment implements TileProviderIntf {
    private TileMap tileMap;
    private Texture texture;
    
    public TileEnvironment() {
    
    }

    @Override
    public void initializeEnvironment() {
        texture = new Texture();
        
        tileMap = new TileMap(null, new Dimension(16, 16), new Dimension(5, 5));
        tileMap.setMapVisualizer(new TileMapVisualizer(this));
        int[][] testMap = new int[][]{
            { 2, 2, 2, 3, 4 },
            { 2, 3, 3, 3, 1 },
            { 3, 3, 1, 1, 1 },
            { 3, 1, 1, 1, 1 },
            { 1, 1, 1, 4, 4 }
        };
        tileMap.setData(testMap);
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

    @Override
    public Image getTile(Integer iD) {
        return texture.getTexture(iD);
    }
    
}
