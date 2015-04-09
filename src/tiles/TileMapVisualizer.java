/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import map.Map;
import map.MapVisualizerIntf;

/**
 *
 * @author kevin.lawrence
 */
public class TileMapVisualizer implements MapVisualizerIntf{

    private TileProviderIntf tileProvider;
    
    public TileMapVisualizer(TileProviderIntf tileProvider){
        this.tileProvider = tileProvider;
    }
    
    @Override
    public void draw(Map map, Graphics graphics) {
        System.out.println("Drawing map...");
        int[][] mapData = ((TileMap) map).getData();
        
        
        for (int column = 0; column < mapData.length; column++){
            for (int row = 0; row < mapData[column].length; row++) {
//                graphics.drawString(String.valueOf(mapData[column][row]), map.getPosition().x + (row * map.getCellWidth()), map.getPosition().y + ((column + 1) * map.getCellHeight()));
                Point topLeft = new Point(column, row);
                graphics.drawImage(tileProvider.getTile(mapData[row][column]), map.getCellSystemCoordinate(topLeft).x, map.getCellSystemCoordinate(topLeft).y, null);
            }
        }
    }

    /**
     * @return the tileProvider
     */
    public TileProviderIntf getTileProvider() {
        return tileProvider;
    }

    /**
     * @param tileProvider the tileProvider to set
     */
    public void setTileProvider(TileProviderIntf tileProvider) {
        this.tileProvider = tileProvider;
    }
}
