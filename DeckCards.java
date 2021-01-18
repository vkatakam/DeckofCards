package com.api.deck.main;

import com.api.deck.utils.DeckCardsUtils;

public class DeckCards {

	private String newDeckUrl = "https://deckofcardsapi.com/api/deck/new/";
	private String deckId = "rhdwm9m1xsok";
	private String drawCardUrl = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=2";
	private String shuffleCardsUrl = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
	private String reshuffleCardsUrl = "https://deckofcardsapi.com/api/deck/" + deckId + "/shuffle/";
	private String partialDeckUrl = "https://deckofcardsapi.com/api/deck/new/shuffle/?cards=AS,2S,KS,AD,2D,KD,AC,2C,KC,AH,2H,KH";

	public String getNewDeck() {
		String newDeck = DeckCardsUtils.deckCardsAPIURL(newDeckUrl);
		return newDeck;
	}

	public String getDrawCard() {
		String drawCard = DeckCardsUtils.deckCardsAPIURL(drawCardUrl);
		return drawCard;
	}

	public String getShuffleCards() {
		String shuffleCards = DeckCardsUtils.deckCardsAPIURL(shuffleCardsUrl);
		return shuffleCards;
	}

	public String getReShuffleCards() {
		String reshuffleCards = DeckCardsUtils.deckCardsAPIURL(reshuffleCardsUrl);
		return reshuffleCards;
	}

	public String getPartialDeck() {
		String partialDeck = DeckCardsUtils.deckCardsAPIURL(partialDeckUrl);
		return partialDeck;
	}

}
