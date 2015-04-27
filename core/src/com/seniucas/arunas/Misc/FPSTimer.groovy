package com.seniucas.arunas.Misc

/**
 * Created by god on 15.4.27.
 */
class FPSTimer {
    private int counter = 0
    private float sum = 0

    public void step(float delta){
        counter++
        sum += delta
        if(sum >= 1){
            println(counter)
            counter = 0
            sum = 0
        }
    }
}
