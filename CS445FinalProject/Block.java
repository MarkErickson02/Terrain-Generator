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

public class Block {

    private boolean IsActive;
    private BlockType Type;
    private float x, y, z;

    public enum BlockType {
        BlockType_Grass(0),
        BlockType_Sand(1),
        BlockType_Water(2),
        BlockType_Dirt(3),
        BlockType_Stone(4),
        BlockType_Bedrock(5);
        private int BlockID;

        BlockType(int i) {
            BlockID = i;
        }

        // Method: GetID
        // Purpose: This method returns an int to determine its texture.
        public int GetID() {
            return BlockID;
        }

        // Method: SetID
        // Purpose: This method sets the textures for the individual blocks.
        public void SetID(int i) {
            BlockID = i;
        }
    }
    
    // Method: Block
    // Purpose: This method is a constructor for the Block class and sets their textures.
    public Block(BlockType type) {
        Type = type;
    }

    // Method: setCoords
    // Purpose: This method sets the coordinates for where a block appears in a chunk.
    public void setCoords(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method: IsActive
    // Purpose: This method returns a boolean value to determine if a given block is visible or not.
    public boolean IsActive() {
        return IsActive;
    }

    // Method: SetActive
    // Purpose: This method is a mutator to set a block to active or not.
    public void SetActive(boolean active) {
        IsActive = active;
    }

    // Method; GetID
    // Purpose: This method returns a blocks id.
    public int GetID() {
        return Type.GetID();
    }
}
