/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import java.awt.Dimension;
import java.awt.Image;
import map.Map;

/**
 *
 * @author kevin.lawrence
 */
public class TileMap extends Map {

    public TileMap(Image background, Dimension gridCellSize, Dimension gridSize) {
        super(background, gridCellSize, gridSize);
    }

    private int[][] data = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};

    /**
     * @return the data
     */
    public int[][] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int[][] data) {
        this.data = data;
    }
    
    
    
}
