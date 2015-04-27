package com.seniucas.arunas.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.seniucas.arunas.Misc.FPSTimer
import com.seniucas.arunas.model.World
import com.seniucas.arunas.view.WorldRenderer

/**
 * Created by god on 15.4.27.
 */
class GameScreen implements Screen{
    private World world
    private WorldRenderer worldRenderer
    def fpsTimer = new FPSTimer()

    @Override
    void show() {
        world = new World()
        worldRenderer = new WorldRenderer(world)
    }

    @Override
    void render(float delta) {
        fpsTimer.step(delta)
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        worldRenderer.render()

    }

    @Override
    void resize(int width, int height) {

    }

    @Override
    void pause() {

    }

    @Override
    void resume() {

    }

    @Override
    void hide() {

    }

    @Override
    void dispose() {

    }
}
