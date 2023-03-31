# HashMaps

A Java program that hashes names using the MD5 algorithm and stores them in a HashMap.

## Description

This Java program reads a list of names from a `.txt` file, hashes each name using the MD5 algorithm, and stores the hashed values in a HashMap. The HashMap uses the names as keys and their respective hashed values as values. The program also demonstrates how to look up specific keys in the HashMap and display their associated values.

## Files

The program consists of two Java classes and a .txt file:

- `Main.java`: Contains the main method to read names from the `.txt` file, hash them, store them in a HashMap, and perform lookups.
- `Hashes.java`: Contains the methods for hashing a string and getting the hashed string.
- `names.txt`: A list of names to be hashed and stored in the HashMap.

## Usage

1. Compile the Java classes (e.g., `javac Hashes.java Main.java`).
2. Run the compiled Java program (e.g., `java Main`).
3. The program will output the list of names, the HashMap containing the hashed names, and the hashed values of the specified mainMan and leadingLady variables, if they exist in the HashMap.

## Example

Let's say the names.txt file contains the following names:

```plaintext
Luigi
Peach
Bruce Banner
Clinton Barton
Diana Prince
Darth Vader
Mario Mario
Link
Mega Man
Master Chief
Legolas
Starkiller
Lucina
Akari Hayami
Tiny Kong
Batman
Harleen Quinzel
Natasha Romanov
Steve Rogers
Bob Burnquist
Ryan Nyquist
Tony Stark
Leon S. Kennedy
Joseph Marquez
Thanos - Oh Snap
```

The program will output the following:

```plaintext
The list of names has been read.
Luigi
Peach
Bruce Banner
...
Joseph Marquez
Thanos - Oh Snap

{Luigi=0d2b74c7a98422f1ed4b4a3f3c87e4e4, Peach=6c1f3d3f6b03db6bdeee6b971e6b2c6d, ...}

Mega Man = f9d50b1c01a14db936f87a6c1575a5a5
Lucina = 602c6e9b6d1e6c33f5590a2d5e8e5a5f
```
This demonstrates that the program successfully reads the list of names, hashes them, and stores them in a HashMap. It then looks up the specified mainMan and leadingLady variables in the HashMap and outputs their hashed values.
