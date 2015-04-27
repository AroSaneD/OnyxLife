package com.seniucas.arunas

import com.badlogic.gdx.Game
import com.seniucas.arunas.screens.GameScreen

/**
 * Created by god on 15.4.27.
 */
class BlackLife extends Game{
    @Override
    void create() {
        setScreen(new GameScreen())
    }
}
