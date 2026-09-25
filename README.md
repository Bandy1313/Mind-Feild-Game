````markdown name=README.md
# Mind Field Game

A text-based maze navigation game written in Java where players navigate through a minefield without hitting bombs.

## Game Overview

Navigate through grids while avoiding randomly placed bombs. Reach the goal position to complete each level!

## How to Play

1. **Start the Game**: Run `MainHub.java`
2. **Input Commands**: Use directional commands to move
   - `up` - Move up
   - `down` - Move down
   - `left` - Move left
   - `right` - Move right
   - `exit` - Quit the game

3. **Objective**: 
   - Reach the goal marker **[G]** in the top-right corner
   - Avoid all bombs marked with **[B]**
   - Your position is marked with **[x]**

## Game Symbols

| Symbol | Meaning |
|--------|---------|
| `x` | Player position |
| `B` | Bomb (avoid!) |
| `G` | Goal (reach this!) |
| ` ` | Empty space |

## Project Structure

### Core Classes

- **MainHub.java** - Main entry point and game controller
  - Displays title screen
  - Manages game flow

- **TitleScreen.java** - Main menu interface
  - Handles start/exit buttons
  - Displays game title

- **Level1.java** - First game level
  - 3x3 grid with random bomb placement
  - Player movement and collision detection
  - Win/lose conditions

- **PlayerControler.java** - Player movement system
  - Tracks player position
  - Handles directional input
  - Validates movements

- **Bomb.java** - Bomb obstacle system
  - Manages bomb sprites
  - Random bomb placement calculation

- **User.java** - Player data model
  - Stores player sprite information

- **BugChecks.java** - Game validation utilities
  - Collision detection
  - Win condition checking
  - Position validation

- **Levels.java** - Interface for level implementations
  - Defines level contract

## Game Features

✅ **Random Bomb Placement** - Bombs are randomly placed each game  
✅ **Collision Detection** - Game ends if you touch a bomb  
✅ **Win Condition** - Reach the goal to complete the level  
✅ **Input Validation** - Only valid moves are accepted  
✅ **Game State Tracking** - Proper player position management  

## How to Compile and Run

```bash
# Compile all Java files
javac *.java

# Run the game
java MainHub
```

## Future Enhancements

- [ ] Level 2 and beyond
- [ ] Difficulty settings
- [ ] Score/timer system
- [ ] Multiple player support
- [ ] Graphical interface

## Credits

**Created by**: Tyler Harvey

---

**Enjoy navigating the mind field! 🎮**
````
