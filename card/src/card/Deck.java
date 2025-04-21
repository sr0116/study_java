package card;

public class Deck {
	int count = 0;
	Card[] cards = new Card[52];
	{ 
		int c = 0;
		for(int i = 0 ; i<4; i++) {
			for(int j = 0; j<13;j++) {
				cards[c ++] = new Card(i,j);
			}
		}
	}
	Deck print() {
		for(Card c : cards) {
			System.out.println(c);
		}
		return this;
	}
	
	Deck shuffle() {
		for(int i = 0; i<cards.length ; i++) {//자리바꾸기는 임시변수 필요
			int r = (int)(Math.random()* 52);
			Card tmp = cards[i];
			cards[i]= cards[r];
			cards[r]= tmp;		
		}
		return this;
	}
	
	Card pick() {//단순화 시켜야 좋음
		return cards[count++];
	}
	
	public static void main(String[] args) {
		new Deck().shuffle().print();
	}	
}


