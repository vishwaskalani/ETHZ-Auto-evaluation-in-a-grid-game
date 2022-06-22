# Auto-evaluation-in-a-grid-game

## README Contents -

1. Project description
2. Directory description
3. Instructions to get gif or mp4 file
4. Acknowledgements

---
## Project description :

- The project is part of a research on how to teach computer science to small kids
- It is based on a grid game. The grid game consists of a robot, obstacles, coins to be collected and a final goal. Kids would be writing a program in the language designed for this game to move the robot around the grid.
- The solutions written by them will then be scanned manually. 
- The aim of the project is to first identify the commands written by the kids, evaluate their program and then provide them visual feedback of their program.

---

## Directory description:

The github repository is divided into various directories and files namely - 

1. **GridMap.java** - Java program for generating a mp4 or gif file	
2. **grid.txt** - Text file with grid written as per some conventions
3. **path.txt** - Text file with the path which has been identified as per some conventions
4. **supportingImages** - Directory with png files to support video generation

---

## Instructions to get gif or mp4 file:

1. The command line tool `ffmpeg` should be installed to run the program. It can be installed in windows as well as linux machines
2. Compile and run the java program with supportingImages folder in the same directory. The commands would be `javac GridMap.java` folowed by `java GridMap`.
3. Running the java program would generate a number of images and the gif or mp4 file in the same folder.


---
## Acknowledgements :
