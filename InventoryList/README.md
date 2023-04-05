# Inventory List

A Java program for managing a simple inventory list with an interactive command-line interface.

## Description

The Inventory List program allows users to manage a simple inventory list with an interactive command-line interface. The user compiles the program, runs it, and follows the prompts to input the size of the inventory, items, and their quantities. The program then displays the inventory list in the order the items were entered. The program consists of two classes, `Inventory` and `InventoryNode`.

## Classes

- **Inventory**: The `Inventory.java` main class is responsible for handling user input, creating nodes for each item, and managing the inventory list.
- **InventoryNode**: The `InventoryNode.java` is a custom node class that holds item information (item name and quantity) and is used to build a linked list for the inventory.

## Usage

1. Compile the Java Classes (e.g., `javac Inventory.java InventoryNode.java`).
2. Run the compiled Java program (e.g., `java Inventory`).
3. Follow the prompts to input the size of the inventory, items, and their quantities.
4. The program will display the inventory list with the entered information.

## Example

In this example, the user inputs the size of the inventory and then enters three items with their respective quantities. The program then displays the inventory list in the order the items were entered.

```plaintext
Size of Inventory: 3

Item 1: Apples
Apples Quantity: 10

Item 2: Bananas
Bananas Quantity: 5

Item 3: Oranges
Oranges Quantity: 7

10 Apples
5 Bananas
7 Oranges
```
