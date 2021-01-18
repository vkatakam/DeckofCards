# Deck of Cards APIs
===================
You can obtain a current copy of the Eclipse and TestNG from
	https://www.eclipse.org/downloads/
	https://testng.org/doc/download.html

About this Package
-------------------
The purpose of this package is to provide a to test the Deck of Cards APIs test cases.

Requirements
-------------
Implemented the automation to test the following APIs in Java using these classes
•	DeckCardsTest.java
•	DeckCards.java
•	DeckCardsUtils.java

Create a new deck of cards
•	GET https://deckofcardsapi.com/api/deck/new/
Draw one or more cards from a deck
•	GET https://deckofcardsapi.com/api/deck/<<deck_id>>/draw
Shuffle the Cards
•	GET or POST https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1
Reshuffle the Cards
•	Get https://deckofcardsapi.com/api/deck/<<deck_Id>>/shuffle/
A Partial Deck 
•	Get https://deckofcardsapi.com/api/deck/new/shuffle/?cards=AS,2S,KS,AD,2D,KD,AC,2C,KC,AH,2H,KH

To install this java project, you will need a Java SDK, Eclipse, and TestNG.
•	Download the java project (DeckofCards) from GitHub: 
	https://github.com/vkatakam/DeckofCards
•	Import the DeckofCards project into the Eclipse IDE and, 
•	Run the DeckCardsTest.java using the TestNg (Run -> Run As -> TestNg Test) or 
	Run the batch file from project the folder - deckofcards.bat
