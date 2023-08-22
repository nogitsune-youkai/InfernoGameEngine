package Inferno;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class KeyListener {
    private static KeyListener instance;
    private boolean KeyPressed[] = new boolean[350]; // not really sure about this solution

    private KeyListener() {

    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if(action == GLFW_PRESS) {
            getInstance().KeyPressed[key] = true;
            //System.out.println("Key pressed");
        } else if (action == GLFW_RELEASE) {
            getInstance().KeyPressed[key] = false;
        }

    }

    public static KeyListener getInstance() {
        if(KeyListener.instance == null) {
            KeyListener.instance = new KeyListener();
        }
        return KeyListener.instance;
    }

    public static boolean isKeyPressed(int keyCode) {
            return getInstance().KeyPressed[keyCode];
    }
}
