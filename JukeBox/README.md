# JukeBox

A Java program that manages a virtual jukebox to store, manipulate, and display songs (records) using ArrayLists.

## Description

JukeBox is a Java program that simulates a classic jukebox, allowing users to manage and interact with a collection of songs, represented as records. Users can add, remove, and search for records within the collection, as well as retrieve a random record for an element of surprise. The program is designed with an intuitive interface and provides a fun way to explore and manipulate a custom playlist.

## Features
- Add a record to the jukebox
- Add a record to a specific slot in the jukebox
- Remove a record from the jukebox
- Check if the jukebox contains a specific record
- Find the slot containing a specific record
- Generate a random record from the jukebox
- Display the jukebox content as a string

## Classes

- **JukeBox**: The `Jukebox.java` class implements the `JukeInterface` and contains the main logic for manipulating and displaying the list of songs.
- **JukeInterface**: The `JukeInterface.java` is an interface that defines the methods a jukebox must implement to manage records.
- **Record**: The `Record.java` class represents a song, containing information about the song's title and artist.
- **JukeTester**: The `JukeTester.java` class is a tester class that demonstrates the usage of the `Jukebox`, `JukeInterface`, and `Record` classes.

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
