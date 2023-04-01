# Data Visualization

A Java program for creating simple data visualizations using text-based input and output.

## Description

The Data Visualization program allows users to input custom data points with a string (e.g., author name) and an integer (e.g., number of novels) and visualize the data in a tabular format as well as a simple bar chart. The program can be used to visualize data from various fields, such as author names with their respective novel counts or other relevant data.

## Usage

1. Compile the Java program (e.g., `javac DataVisualizer.java`).
2. Run the compiled Jave program (e.g., `java DataVisualizer`).
3. Follow the prompts to input the title, column headers, and data points.
4. The program will display the data in tabular format and as a simple bar chart.

## Example

In this example, the user inputs a custom title and column headers and then enters data points consisting of author names and their respective novel counts. The program then displays the data in a table and as a simple bar chart.

```plaintext
Enter a title for the data:
Famous Authors and Their Novel Counts
You entered: Famous Authors and Their Novel Counts

Enter the column 1 header:
Author Name
You entered: Author Name

Enter the column 2 header:
Number of Novels
You entered: Number of Novels

Data is entered by inputting: '<String>, <Integer>'
Enter a data point (-1 to stop input):
Charles Dickens, 15
Data string: Charles Dickens
Data integer: 15

Enter a data point (-1 to stop input):
Jane Austen, 6
Data string: Jane Austen
Data integer: 6

Enter a data point (-1 to stop input):
Ernest Hemingway, 9
Data string: Ernest Hemingway
Data integer: 9

Enter a data point (-1 to stop input):
-1

Famous Authors and Their Novel Counts
Author Name         |       Number of Novels
--------------------------------------------
Charles Dickens     |                     15
Jane Austen         |                      6
Ernest Hemingway    |                      9

     Charles Dickens ***************
         Jane Austen ******
    Ernest Hemingway *********
```
