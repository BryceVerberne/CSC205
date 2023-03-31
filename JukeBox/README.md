# JukeBox

A Java program that manages a virtual jukebox to store, manipulate, and display songs (records) using ArrayLists.

## Description

The JukeBox program is designed to simulate a virtual jukebox that stores songs (represented as `Record` objects) in an ArrayList. It provides various functionalities like adding songs to the jukebox, removing songs, searching for specific songs, and picking a random song. The program consists of four classes: `Jukebox`, `JukeInterface`, `Record`, and `JukeTester`.

## Classes

1. `Jukebox.java`: The `Jukebox` class is the core class that represents a virtual jukebox. It implements the `JukeInterface` and provides methods for managing songs (records) in an ArrayList, such as adding, removing, searching, and randomly selecting songs.
2. `JukeInterface.java`: The `JukeInterface` is an interface that defines the methods a jukebox must implement to manage records. This includes methods for inserting records, removing records, checking if a record exists, finding a record's slot, and randomly selecting a record.
3. `Record.java`: The `Record` class represents a song, containing information about the song's title and artist. It provides methods for comparing records and converting a record to a string representation for display purposes.
4. `JukeTester.java`: The `JukeTester` class is a tester class that demonstrates the usage of the `Jukebox`, `JukeInterface`, and `Record` classes. It creates a jukebox, inserts songs, searches for specific songs, and removes songs from the jukebox, showing the results of each operation.

## Usage 

1. Compile the Java classes (e.g., `javac Jukebox.java JukeInterface.java Record.java JukeTester.java`).
2. Rune the compiled Java program (e.g., `java JukeTester`).
3. This will execute the tester class and demonstrate the various functionalities provided by the JukeBox program.

## Example

Here's an example output after running the JukeTester class:

```plaintext
Jukebox now contains: [( I Feel Good, James Brown ), ( Great Balls of Fire, Jerry Lee Lewis), ( My favorite Song, My favorite artist ), ( Kokomo, The Beach Boys ), ( Wooly Bully, Sam the Sham & the Pharaohs ), ( Mustang Sally, Wilson Pickett )]

A random Record is: ( My favorite Song, My favorite artist )
A random Record is: ( Mustang Sally, Wilson Pickett )
A random Record is: ( I Feel Good, James Brown )
A random Record is: ( My favorite Song, My favorite artist )
A random Record is: ( Great Balls of Fire, Jerry Lee Lewis )

Does it contain ( Kokomo, The Beach Boys )?: true
Does it contain ( Mustang Sally, The Commitments )?: false
Does it contain ( Its Too Late, Wilson Pickett )?: false

What slot is ( Great Balls of Fire, Jerry Lee Lewis ) in?: 1
What slot is ( The Great Pretender, The Platters ) in?: -1

Did it successfully remove ( Wooly Bully, Sam the Sham & the Pharaohs )?: true
Did it successfully remove ( Heartbreak Hotel, Elvis Presley )?: false

Jukebox now contains: [( I Feel Good, James Brown ), ( Great Balls of Fire, Jerry Lee Lewis), ( My favorite Song, My favorite artist ), ( Kokomo, The Beach Boys ), ( Mustang Sally, Wilson Pickett )]
```
In this example, the JukeTester class demonstrates various functionalities like inserting songs, searching for specific songs, and removing songs from the jukebox.
