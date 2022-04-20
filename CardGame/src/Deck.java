/* Copyright (c) 2022 Haven Allen
 * 
 */

import java.util.Random;

/**
 * Models a deck of cards and provides methods for manipulating the deck
 * 
 * @author S02849570
 *
 */

public class Deck {
	
	/**
	 * Array of cards
	 */
	public Card[] cards;
	/**
	 * Random object for shuffling deck
	 */
	private Random random = new Random();
	
	/**
	 * Initializes a deck of cards with the 52 cards of a standard playing card deck
	 */
	public Deck() {
		cards = new Card[52];
		for(int i = 0; i < Card.SUITS.length; i++) {
			for(int j = 1; j < Card.RANKS.length; j++) {
				cards[i*13+j-1] = new Card(j,i);
			}
		}
	}
	/**
	 * Initializes a deck of cards of specified size without assigning rank or size
	 * @param size Size of the deck
	 */
	public Deck(int size) {
		cards = new Card[size];	
	}
	
	public Card[] getCards() {
		return this.cards;
	}
	
	public String tostring() {
		StringBuilder sb = new StringBuilder();
		for(Card card : cards) {
			sb.append(card.toString());
			sb.append(", ");
		}
		return sb.toString();
	}
	
	private void swap(int first, int second) {
		Card temp = this.cards[first];
		this.cards[first] = this.cards[second];
		this.cards[second] = temp;
	}
	
	public void shuffle() {
		for(int i = 0; i < this.cards.length; i++) {
			int cardToSwap = random.nextInt(0, this.cards.length);
			swap(i,cardToSwap);
		}
	}
	
	/**
	 * Create a new deck containing all cards of this deck from start to end
	 * @param start Starting index
	 * @param end Ending index
	 * @return Deck containing this cards of this Deck from start to end
	 */
	public Deck subDeck(int start, int end) {
        Deck sub = new Deck(end - start + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[start + i];
        }
        return sub;
	}
	
	
	//Hey, I wrote a program that visualized sorts graphically for my 119 final. Fun!
	public void selectionSort() {
		int len = this.cards.length;
		
		//Loop over each element of array except the last (because the last will always end up being the biggest)
		for(int i = 0; i < len-1; i++) {
			//Assume the index at which the smallest value exists is i
			int least = i;
			//Loop over each element of the array starting at i+1
			for(int j = i+1; j < len; j++) {
				//If the card at idx j < card at idx least
				if(this.cards[j].compareTo(this.cards[least]) == -1) {
					//We found the index of our new smallest card. Update least
					least = j;
				}
			}
			//basic swap
			swap(least,i);
		}
	}
	
	private void helper(Card[] cards, int low, int high) {
		if(low < this.cards.length) {
			for(int i = low+1; i < this.cards.length; i++) {
				if(this.cards[i].compareTo(this.cards[low]) == -1) {
					swap(low,i);
				}
			}
			helper(this.cards, low+1, this.cards.length-1);
		}
	}
	
	private void merge(Card[] cards, int low1, int high1, int low2, int high2) {
		int np1 = high1 - low1 + 1;
		int np2 = high2 - low2 + 1;

		Card[] pile1 = new Card[np1];
		Card[] pile2 = new Card[np2];

		for(int i = 0; i < np1; i++) {
			pile1[i] = cards[low1+i];
		}
		for(int i = 0; i < np2; i++) {
			pile2[i] = cards[low2+i];
		}
		
		int i = 0; 
		int j = 0; 
		int k = low1;
		
		while(i < np1 && j < np2) {
			if(pile2[j].compareTo(pile2[j]) < 0) {
				j++;
			} else {
				cards[k] = pile1[i];
				i++;
			}
			k++;
		}
		
		while(i < np1) {
			cards[k] = pile1[i];
			i++; 
			k++;
		}
		while(j < np2) {
			cards[k] = pile1[j];
			j++; 
			k++;
		}
		
	}
	
	private void mergeSortHelper(Card[] cards, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		mergeSortHelper(cards, low, (low+high)/2);
		mergeSortHelper(cards, (low+high)/2, high);
		
		merge(cards, low, (low+high)/2, ((low+high)/2)+1, high);
		
	}
	
	public void mergeSort() {
		mergeSortHelper(cards, 0, cards.length-1);
	}
	
	public void recursiveSelectionSort() {
		helper(this.cards,0,this.cards.length-1);
	}
	
	public void insertionSort() {
		int len = this.cards.length;
		for(int i = 1; i < len; ++i) {
			Card iCard = this.cards[i];
			int j = i - 1;
			while(j > -1 && this.cards[j].compareTo(iCard) > 0) {
				this.cards[j+1] = this.cards[j];
				j--;
			}
			
			this.cards[j+1] = iCard;
		}
	}
}
