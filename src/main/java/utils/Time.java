package utils;

import org.lwjgl.glfw.GLFW;

import static org.lwjgl.glfw.GLFW.glfwGetTime;

public class Time {
    public static double timeStarted = glfwGetTime(); // time elapsed since app started

    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) * 1E-9); // conversion to seconds
    }
}
