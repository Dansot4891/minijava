package graphics;
import java.util.*;
//코드 설명 카드 덱을 가져와서 셔플을하고 뭉쳐서 한장씩 나눠줌.
//이 코드로 플레이어 마다 리스트에 5장씩 나눠주고 그걸 보여주고 게임을 하기 위해서
//카드의 숫자를 다 더해주고 그 숫자의 합이 더 큰사람이 이기도록 코드를 작성해주세요
//J = 11, Q = 12, K = 13, A = 1
class Card {
	String suit;
	String number;
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;}
	public String toString() {
		return "(" + suit + " " + number + ")";}
}
class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = { "CLUB♣", "DIAMOND◆", "HEART♥", "SPADE♠" };
	String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public Deck() {
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < number.length; j++)
				deck.add(new Card(suit[i], number[j])); }

	public void shuffle() {
		Collections.shuffle(deck); }

	public Card deal() { //카드를 한장씩 나줘줌
		return deck.remove(0); } // 한장 나눠줘서 52 -> 51장으로 줄어듬
}

class Player {
	ArrayList<Card> list = new ArrayList<>();
	public void getCard(Card card) {
		list.add(card);
		}
	public void showCards() {
		System.out.println(list);
		}
	
	public void battle(Player p) {
		int sum1 = 0, sum2 = 0; 
		int b;
		for(int i = 0; i < this.list.size();i++) {
			Card c = this.list.get(i);
			String a = c.number;
			if(a.equals("J")) {
				b = 11;
			} else if(a.equals("Q")) {
				b = 12;
			} else if(a.equals("K")) {
				b = 13;
			}else if(a.equals("A")) {
				b = 1;
			}else {
				b = Integer.parseInt(a);
			}
			sum1 += b;
			
		}
		for(int i = 0; i < p.list.size();i++) {
			Card c = p.list.get(i);
			String a = c.number;
			if(a.equals("J")) {
				b = 11;
			} else if(a.equals("Q")) {
				b = 12;
			} else if(a.equals("K")) {
				b = 13;
			}else if(a.equals("A")) {
				b = 1;
			}else {
				b = Integer.parseInt(a);
			}
			sum2 += b;
			
		}
		//System.out.printf("p1 = %d, p2 = %d\n",sum1,sum2);
		if(sum1>sum2) {
			System.out.printf("p1 : %d, p2 : %d 승리\n",sum1,sum2);
		}else if(sum1<sum2) {
			System.out.printf("p1 : %d, p2 : %d 패배\n",sum1,sum2);
		}else if(sum1 == sum2) {
			System.out.printf("p1 : %d, p2 : %d 무승부\n",sum1,sum2);
		}
		
	}
}

public class Generic {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();
		for(int i = 0; i<5; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}
		p1.showCards();
		p2.showCards();
		p1.battle(p2);
		p2.battle(p1);
		}
}
