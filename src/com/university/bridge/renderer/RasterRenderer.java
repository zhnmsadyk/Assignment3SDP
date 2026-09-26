package com.university.bridge.renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " as pixels (raster).");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square of side " + side + " as pixels (raster).");
    }
}