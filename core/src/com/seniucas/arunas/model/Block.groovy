package com.seniucas.arunas.model

import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

/**
 * Created by god on 15.4.27.
 */
class Block {
    static final float SIZE = 1f

    def position = new Vector2()
    def bounds = new Rectangle()

    public Block(Vector2 pos){
        position = pos
        bounds.width = SIZE
        bounds.height = SIZE
    }
}
