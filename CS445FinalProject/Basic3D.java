/***************************************************************
* file: Basic3D.java
* author: Karen Cheung, Mark Erickson, Kevin Kuhlman
* class: CS 445 - Computer Graphics
*
* assignment: Final Program Checkpoint 2 
* date last modified: 5/17/2016
*
* purpose: This program displays a chunk of cubes with 6 different block types with randomly generated terrain.
*
****************************************************************/ 

package CS445FinalProject;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.glu.GLU;

public class Basic3D {

    private DisplayMode displayMode;
    private FPCamera fp;

    // Method: start
    // Purpose: This method calls the create window and initGL methods to draw the scene.
    public void start() {
        try {
            createWindow();
            initGL();
            fp = new FPCamera(0.0f,0.0f,0.0f);
            fp.gameLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method: createWindow
    // Purpose: This method sets the title and size of the window
    private void createWindow() throws Exception {
        Display.setFullscreen(false);
        DisplayMode d[] = Display.getAvailableDisplayModes();
        for (int i = 0; i < d.length; i++) {
            if (d[i].getWidth() == 640 && d[i].getHeight() == 480 && d[i].getBitsPerPixel() == 32) {
                displayMode = d[i];
                break;
            }
        }
        Display.setDisplayMode(displayMode);
        Display.setTitle("CS 445 Checkpoint 2");
        Display.create();

    }

    // Method: initGL
    // Purpose: This method sets various options for openGL
    private void initGL() {
        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        GLU.gluPerspective(100.0f, (float) displayMode.getWidth() / (float) displayMode.getHeight(), 0.1f, 300.0f);
        glMatrixMode(GL_MODELVIEW);
        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
        glEnableClientState(GL_VERTEX_ARRAY);
        glEnableClientState(GL_COLOR_ARRAY);
        glEnable(GL_DEPTH_TEST);
        glEnable(GL_TEXTURE_2D);
        glEnableClientState (GL_TEXTURE_COORD_ARRAY);
    }

    // Method: main
    // Purpose: The start point of the program. 
    public static void main(String[] args) {
        Basic3D basic = new Basic3D();
        basic.start();
    }
}