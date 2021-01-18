package com.api.deck.tests;

import org.testng.annotations.Test;

import com.api.deck.main.DeckCards;

public class DeckCardsTest {

	@Test(description = "Create a brand new deck of cards", priority = 1)
	public void testNewDeck() {
		System.out.println("-----Start of testNewDeck-----");
		DeckCards deckCards = new DeckCards();
		String newDeck = deckCards.getNewDeck();
		System.out.println("New Deck Test Results:" + newDeck);
		System.out.println("-----End of testNewDeck-----");
	}

	@Test(description = "Draw two cards from a deck", priority = 2)
	public void testDrawCard() {
		System.out.println("-----Start of testDrawCard-----");
		DeckCards deckCards = new DeckCards();
		String drawCard = deckCards.getDrawCard();
		System.out.println("Draw Card Test Results:" + drawCard);
		System.out.println("-----End of testDrawCard-----");
	}

	@Test(description = "Shuffle the cards", priority = 3)
	public void testShuffleCards() {
		System.out.println("-----Start of testShuffleCards-----");
		DeckCards deckCards = new DeckCards();
		String shuffleCards = deckCards.getShuffleCards();
		System.out.println("Shuffle Cards Test Results:" + shuffleCards);
		System.out.println("-----End of testShuffleCards-----");
	}

	@Test(description = "ReShuffle the cards", priority = 4)
	public void testReShuffleCards() {
		System.out.println("-----Start of testReShuffleCards-----");
		DeckCards deckCards = new DeckCards();
		String reshuffleCards = deckCards.getReShuffleCards();
		System.out.println("Reshuffle Cards Test Results:" + reshuffleCards);
		System.out.println("-----End of testReShuffleCards-----");
	}

	@Test(description = "A Partial Deck the cards", priority = 5)
	public void testPartialDeck() {
		System.out.println("-----Start of testPartialDeck-----");
		DeckCards deckCards = new DeckCards();
		String partialDeck = deckCards.getPartialDeck();
		System.out.println("Partial Deck Test Results:" + partialDeck);
		System.out.println("-----End of testPartialDeck-----");
	}

}
