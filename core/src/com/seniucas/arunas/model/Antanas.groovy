package com.seniucas.arunas.model

import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

/**
 * Created by god on 15.4.27.
 */
class Antanas {
    public enum State {
        IDLE, WALKING, JUMPING, DYING
    }

    static final float SPEED = 2f
    static final float JUMP_VELOCITY = 1f
    static final float SIZE = 0.5

    def position = new Vector2()
    def acceleration = new Vector2()
    def velocity = new Vector2()
    def bounds = new Rectangle()
    def state = State.IDLE

    def facingLeft = true

    public Antanas(Vector2 position){
        this.position = position
        this.bounds.width = SIZE
        this.bounds.height = SIZE
    }
}
