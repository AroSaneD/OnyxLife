package com.seniucas.arunas.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.seniucas.arunas.BlackLife

/**
 * Created by god on 15.4.24.
 */
class ImprovedDesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1000
        config.height = 640
        new LwjglApplication(new BlackLife(), config);
    }
}
