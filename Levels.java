/**
 * Levels - Interface for game level implementations
 * 
 * Defines the contract that all game levels must follow
 */
public interface Levels {
    /**
     * Sets the dimensions of the level
     * @param length Number of rows in the level
     * @param width Number of columns in the level
     */
    void size(int length, int width);

    /**
     * Spawns the player on the map
     * @param location The game map where player will be placed
     */
    void playerSpawn(String[][] location);
}
