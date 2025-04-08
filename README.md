01.05 Java Utils - Level 1
==========================

- Exercise 1
Create a class that alphabetically lists the contents of a directory passed as a parameter.

- Exercise 2
Add to the class from the previous exercise the functionality to list a directory tree with
the contents of all its levels (recursively) so that they are printed on the screen in alphabetical
order within each level, also indicating whether it is a directory (D) or a file (F), and its last modification date.

- Exercise 3
Modify the previous exercise. Now, instead of displaying the result on the screen, save the result in a TXT file.

- Exercise 4
Add the functionality to read any TXT file and display its contents on the console.

- Exercise 5
Now the program must serialize a Java Object to a .ser file and then deserialize it.

# Below are instructions for compiling and running each exercise from the command line.

- Exercise 1
-------------

- 1. First, navigate to the src/main/java directory:
     > cd src/main/java

- 2. For Exercise 1 (Directory Listing):
     Compile:
     > javac exercise1/*.java
     Execute:
     > java exercise1.main "C:/your/path"

- Exercise 2
-------------

- 1. First, navigate to the src/main/java directory:
     > cd src/main/java

- 2. For Exercise 2 (Directory Listing):
     Compile:
     > javac exercise2/*.java
     Execute:
     > java exercise2.main "C:/your/path"

- Exercise 3
-------------

- 1. First, navigate to the src/main/java directory:
     > cd src/main/java

- 2. For Exercise 3 (Directory Listing):
     Compile:
     > javac exercise3/*.java
     Execute:
     > java exercise3.main "C:/your/path" "output.txt"
     
     (Remember to enter the two absolute paths: the directory
     to be read and the path to the text file where the files will be printed.)

  - Exercise 4
---------------

- 1. First, navigate to the src/main/java directory:
     > cd src/main/java

- 2. For Exercise 4 (Directory Listing):
     Compile:
     > javac exercise4/*.java
     Execute:
     > java exercise4.main "C:/your/path"

- Exercise 5
-------------

- 1. First, navigate to the src/main/java directory:
     > cd src/main/java

- 2. For Exercise 5 (Directory Listing):
     Compile:
     > javac exercise5/*.java
     Execute:
     > java exercise5.main "C:/your/path"

## IMPORTANT NOTES:
- Always compile from src/main/java or use full paths.
- Package declarations must match the directory structure.
- Use forward slashes (/) for paths in commands.
- Include all dependent .java files when compiling.

## Troubleshooting
- "Class not found" error: Make sure you run from the project root directory.
- File not found: Verify that the paths are correct.
- Compilation errors: Make sure you have JDK 21 installed.
     
  
      
  
