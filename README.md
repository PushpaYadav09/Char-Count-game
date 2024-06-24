# Char-Count-game
-Description

This Java program is a graphical user interface (GUI) application built using the Swing framework. It allows users to count the number of characters and words in a given text input. Additionally, users can change the background color and text color of the text area.

-Key Components

Window (JFrame)

The main window of the application, titled "CHARACTER WORD COUNT TOOL".
Contains all other components (labels, text area, buttons).
Labels (JLabel)

Two labels are used to display the count of characters and words in the text area.
Initially, they display "Character:" and "Word:".

-Text Area (JTextArea)


A large, multi-line area where users can input text.
Wrapped in a JScrollPane to allow scrolling if the text exceeds the visible area.

-Buttons (JButton)

   Count Button: When clicked, it calculates and displays the number of characters and words in the text area.

   Pad Color Button: Opens a color chooser dialog to change the background color of the text area.

   Text Color Button: Opens a color chooser dialog to change the text color of the text area.
   
Functionality

1) Character and Word Count

- When the "Count" button is pressed, the program retrieves the text from the text area.
  
- It counts the number of characters in the text.
  
- It also splits the text into words (using spaces as separators) and counts the number of words.

- These counts are then displayed on the labels.

2) Changing Colors

- The "Pad Color" button allows the user to choose a new background color for the text area via a color chooser dialog.
  
- The "Text Color" button allows the user to choose a new text color for the text area via a color chooser dialog.
  
3) Layout and Design
  
- The GUI is designed using absolute positioning, meaning each component is placed at a specific coordinate within the window.
  
- The main components (labels, text area, and buttons) are spaced and sized appropriately to ensure a clear and user-friendly interface.

- The window size is set to provide enough space for all components without clutter.

4) Usage

- Character and Word Count: Users can type or paste text into the text area and press the "Count" button to see the number of characters and words.
 
- Changing Background Color: Users can click the "Pad Color" button to open a color chooser, select a color, and apply it to the background of the text area.
  
- Changing Text Color: Users can click the "Text Color" button to open a color chooser, select a color, and apply it to the text within the text area. 

This application is a simple yet effective tool for text analysis and customization, demonstrating basic event handling and GUI manipulation in Java Swing.
