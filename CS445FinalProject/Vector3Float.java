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

public class Vector3Float {
    
    public float x,y,z;
    
    // Method: Vector3Float
    // Purpose: This method is a constructor that holds the x,y,z coordinates of the camera.
    public Vector3Float(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
