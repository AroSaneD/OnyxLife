package com.seniucas.arunas.view

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.seniucas.arunas.model.Block
import com.seniucas.arunas.model.World

/**
 * Created by god on 15.4.27.
 */
class WorldRenderer {

    private final static float CAMERA_WIDTH = 10f
    private final static float CAMERA_HEIGHT = 7f

    private World world
    private OrthographicCamera camera

    def debugRenderer = new ShapeRenderer()


    public WorldRenderer(World world){
        this.world = world
        this.camera = new OrthographicCamera(10, 7)
        this.camera.position.set(5, 3.5f, 0)
        this.camera.update()
    }

    public void render(){
        debugRenderer.setProjectionMatrix(camera.combined)
        debugRenderer.setAutoShapeType(true)
        debugRenderer.begin()
        for (Block block : world.getBlocks()){
            Rectangle rect = block.getBounds()
            float x1 = block.getPosition().x + rect.x
            float y1 = block.getPosition().y + rect.y
            debugRenderer.setColor(new Color(0,1,0,1))
            debugRenderer.rect(x1, y1, rect.width, rect.height)
        }

        def player = world.getPlayer()
        Rectangle rect = player.getBounds()
        float x1 = player.getPosition().x + rect.x
        float y1 = player.getPosition().y + rect.y
        debugRenderer.setColor(new Color(0, 1, 0, 1))
        debugRenderer.rect(x1, y1, rect.width, rect.height)
        debugRenderer.end()

    }
}
