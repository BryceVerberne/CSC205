# Mileage Tracker

A simple Java program that tracks mileage and associated dates using a linked list.

## Description

This program consists of two classes, `MileageTrackerNode` and `MileageTrackerLinkedList`. It allows users to create a linked list of mileage data with associated dates. It takes the number of nodes, mileage, and date for each node as inputs and stores them in a linked list. The program then prints the entire linked list with the mileage and date information.

## Classes

- **MileageTrackerNode**: The `MileageTrackerNode.java` class represents a node in the linked list that contains mileage, date, and reference to the next node.
- **MileageTrackerLinkedList**: The `MileageTrackerLinkedList.java` class contains the main method that creates the linked list, collects user input, and prints the list.

## Usage

1. Compile the Java Classes (e.g., `javac MileageTrackerNode.java MileageTrackerLinkedList.java`).
2. Run the compiled Java program (e.g., `java MileageTrackerLinkedList`).
3. Follow the prompts to enter the number of nodes, mileage, and date for each node.

## Example

In this example, the user creates a linked list with 3 nodes, each containing mileage and date data. The program then prints the entire list, showing the mileage and date information for each node.

```plaintext
Nodes: 3
Miles for node 1: 120.5
Date for node 1: 2023-01-01
Miles for node 2: 200.3
Date for node 2: 2023-01-15
Miles for node 3: 50.4
Date for node 3: 2023-01-20

Output:
120.5, 2023-01-01
200.3, 2023-01-15
50.4, 2023-01-20
```
