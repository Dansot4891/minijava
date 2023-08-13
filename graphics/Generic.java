package graphics;
import java.util.*;
//�ڵ� ���� ī�� ���� �����ͼ� �������ϰ� ���ļ� ���徿 ������.
//�� �ڵ�� �÷��̾� ���� ����Ʈ�� 5�徿 �����ְ� �װ� �����ְ� ������ �ϱ� ���ؼ�
//ī���� ���ڸ� �� �����ְ� �� ������ ���� �� ū����� �̱⵵�� �ڵ带 �ۼ����ּ���
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
	String[] suit = { "CLUB��", "DIAMOND��", "HEART��", "SPADE��" };
	String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public Deck() {
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < number.length; j++)
				deck.add(new Card(suit[i], number[j])); }

	public void shuffle() {
		Collections.shuffle(deck); }

	public Card deal() { //ī�带 ���徿 ������
		return deck.remove(0); } // ���� �����༭ 52 -> 51������ �پ��
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
			System.out.printf("p1 : %d, p2 : %d �¸�\n",sum1,sum2);
		}else if(sum1<sum2) {
			System.out.printf("p1 : %d, p2 : %d �й�\n",sum1,sum2);
		}else if(sum1 == sum2) {
			System.out.printf("p1 : %d, p2 : %d ���º�\n",sum1,sum2);
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
