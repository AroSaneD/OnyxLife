package com.seniucas.arunas.model

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Array

/**
 * Created by god on 15.4.27.
 */
class World {

    private Array<Block> blocks;
    private Antanas player;

    public World(){
        createWorld()
    }

    private void createWorld(){
        player = new Antanas(new Vector2(7, 2))
    }

    public Array<Block> getBlocks(){
        blocks
    }

    public Antanas getPlayer(){
        player
    }

}
