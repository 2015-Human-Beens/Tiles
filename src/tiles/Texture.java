/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiles;

import images.ImageManager;
import images.ResourceTools;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 *
 * @author Benjamin
 */
public class Texture {

    private ImageManager textures;
    private BufferedImage tileSheet;
    private HashMap<Integer, String> textureIDs;

    private static final String TEXTURE_GRASS = "GRASS";
    private static final String TEXTURE_WATER = "WATER";
    private static final String TEXTURE_SAND = "SAND";
    private static final String TEXTURE_MOUNTAIN = "MOUNTAIN";
    
    public Image getTexture(Integer iD){
        return textures.getImage(textureIDs.get(iD));
    }

    {
        textureIDs = new HashMap<>();
        textureIDs.put(1, TEXTURE_GRASS);
        textureIDs.put(2, TEXTURE_WATER);
        textureIDs.put(3, TEXTURE_SAND);
        textureIDs.put(4, TEXTURE_MOUNTAIN);                
                
        textures = new ImageManager();
        tileSheet = (BufferedImage) ResourceTools.loadImageFromResource("resources/textures.png");

        textures.addImage(TEXTURE_GRASS, tileSheet.getSubimage(0, 0, 16, 16));
        textures.addImage(TEXTURE_WATER, tileSheet.getSubimage(16, 0, 16, 16));
        textures.addImage(TEXTURE_SAND, tileSheet.getSubimage(32, 0, 16, 16));
        textures.addImage(TEXTURE_MOUNTAIN, tileSheet.getSubimage(0, 16, 16, 16));
    }
    
    
}
