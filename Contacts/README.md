# Contacts

A simple Java program to create and display a contact list with names and phone numbers.

## Description

This program offers an easy way to create a contact list by allowing users to input three contacts, each with a name and phone number, and then displaying the contact list with the entered information. It consists of two classes, `ContactList` and `ContactNode`.

## Classes

- **ContactList**: The `ContactList.java` is the main class responsible for handling user input and managing the contact list.
- **ContactNode**: The `ContactNode.java` class is a custom node class that stores contact information (name and phone number) and is used to build a linked list.

## Usage

1. Compile the Java classes (e.g., `javac ContactList.java ContactNode.java`).
2. Run the program (e.g., `java ContactList`).
3. Enter the name and phone number of a person when prompted.
4. Repeat step 3 for a total of three contacts.
5. The program will display the contact list with the entered information.

## Example

```plaintext
Person 1
Enter name:
John Doe
Enter phone number:
123-456-7890
You entered: John Doe, 123-456-7890

Person 2
Enter name:
Jane Smith
Enter phone number:
987-654-3210
You entered: Jane Smith, 987-654-3210

Person 3
Enter name:
Mike Johnson
Enter phone number:
555-666-7777
You entered: Mike Johnson, 555-666-7777

CONTACT LIST
Name: John Doe
Phone number: 123-456-7890

Name: Jane Smith
Phone number: 987-654-3210

Name: Mike Johnson
Phone number: 555-666-7777
```

In this example, the user inputs three contacts with their names and phone numbers. The program then displays the contact list, showing each contact's name and phone number.
