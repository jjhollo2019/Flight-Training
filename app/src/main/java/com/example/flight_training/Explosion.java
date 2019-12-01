package com.example.flight_training;

public class Explosion {
    private int explosionFrame;
    private int explosionX, explosionY;

    public Explosion(int x, int y){
        explosionFrame = 0;
        explosionX = x;
        explosionY = y;
    }

    public int getExplosionFrame() {
        return explosionFrame;
    }

    public int getExplosionX() {
        return explosionX;
    }

    public int getExplosionY() {
        return explosionY;
    }
}
