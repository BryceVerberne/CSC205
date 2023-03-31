# Infinite Integer

A Java program that enables the creation and manipulation of infinitely long integers.

## Description

The Infinite Integer program provides a means to handle integers of any length, surpassing the limits imposed by built-in data types. By utilizing a doubly linked list, this program allows for the representation and manipulation of extremely large numbers. Key operations such as addition and comparison of these infinite integers are implemented in the code.

## Features
The Infinite Integer program provides a wide range of functionality for working with extremely large integers. Key features include:

- **Representation of Infinitely Large Integers**: The program allows users to create and manipulate integers of any length, surpassing the limitations of built-in data types.
- **Addition**: Users can perform addition of two infinite integers, resulting in a new infinite integer object that represents the sum.
- **Subtraction**: The program supports subtraction of two infinite integers, yielding a new infinite integer object representing the difference.
- **Multiplication**: Users can perform multiplication between two infinite integers, resulting in a new infinite integer object that represents the product.
- **Comparison**: The program allows users to compare two infinite integers, returning the result as an integer (-1, 0, or 1) to indicate whether the first number is less than, equal to, or greater than the second number.
- **Conversion**: Users can convert infinite integers to different data types, such as strings and primitive integers (when possible), for easy integration with other programs and libraries.
- **Flexible Input**: The program accepts input in the form of strings, making it simple for users to enter large numbers without worrying about formatting.
- **Extensibility**: The program's design enables developers to easily add more features and operations, such as division or modular arithmetic, if needed.

## Classes

- **InfiniteInt**: The `InfiniteInt.java` class is responsible for creating an infinitely long integer, by using the doubly linked list data structure. It provides methods for adding, comparing, and manipulating these infinite integers.
- **DLList**: The `DLList.java` class is a generic implementation of a doubly linked list. It provides basic operations for managing the list, such as adding elements, removing elements, and traversing the list.
- **PartialTesterInfiniteInt**: The `PartialTesterInfiniteInt.java` is a test class that demonstrates the functionality of the InfiniteInt class.

## Usage
1. Compile the Java classes (e.g., `javac InfiniteInt.java DLList.java PartialTesterInfiniteInt.java`).
2. Run the compiled Java program (e.g., `java InfiniteInt`).
3. The program will output the results of the integer tests, comparing the expected output to the actual output produced by the InfiniteInt class. Each test will display the expected result and the actual outcome.

## Example

Run the PartialTesterInfiniteInt class to execute the tests and check their results. The output should look like this:

```plaintext
Test1: building an InfiniteInt with default constructor (your toString must work)
Expected: 0
Got:      0

Test2: building an InfiniteInt with 6 numbers (your toString must work)
Input to constructor: "543534"...
Expected: 543,534
Got:      543,534

Test3: building an InfiniteInt with 12 numbers (your toString must work)
Input to constructor: "543534123456"...
Expected: 543,534,123,456
Got:      543,534,123,456

...

Test19: telling a new InfiniteInt("242999123") to compareTo(a different new InfiniteInt("242999876")
Expected: 1
Got:      1

Test21: telling a new InfiniteInt("456123") to reverse and remove commas (revAndRemoveToString())
Expected: 321654
Got:      321654

Test22: telling a new InfiniteInt("123456") to reverse and remove commas (revAndRemoveToString())
Expected: 654321
Got:      654321
```

In this example, the PartialTesterInfiniteInt class demonstrates how it ensures that the InfiniteInt class is functioning correctly and can handle various edge cases when working with extremely large integers.
