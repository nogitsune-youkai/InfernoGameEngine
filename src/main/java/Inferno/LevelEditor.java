package Inferno;

import java.awt.event.KeyEvent;

public class LevelEditor extends Scene {

    private boolean changingScene = false;
    private float timeToChangeScene = 2.0f;

    public LevelEditor() {
        System.out.println("Inside level Editor scene");
    }

    @Override
    public void update(float deltaTime) {

        System.out.println("" + (1.0f / deltaTime) + "FPS");
        if(!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changingScene = true;
        }

        if(changingScene && timeToChangeScene > 0) {
            timeToChangeScene -= deltaTime;
            MainWindow.getWindow();
        } else if (changingScene) {
            MainWindow.changeScene(1);
            }
    }
}
