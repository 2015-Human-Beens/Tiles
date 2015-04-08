/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import java.awt.Graphics;
import map.Map;
import map.MapVisualizerIntf;

/**
 *
 * @author kevin.lawrence
 */
public class TileMapVisualizer implements MapVisualizerIntf {

    @Override
    public void draw(Map map, Graphics graphics) {
        System.out.println("Drawing map...");
        int[][] mapData = ((TileMap) map).getData();
        
        
        for (int column = 0; column < mapData.length; column++){
            for (int row = 0; row < mapData[column].length; row++) {
                graphics.drawString(String.valueOf(mapData[column][row]), map.getPosition().x + (column * map.getCellWidth()), map.getPosition().y + (row * map.getCellHeight()));
            }
        }
    }
}
