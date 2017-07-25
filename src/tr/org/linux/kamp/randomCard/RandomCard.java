package tr.org.linux.kamp.randomCard;

import java.util.Random;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class RandomCard {

	private static Random rgen = new Random();

	public static void main(String[] args) {

		System.out.println(chooseRandomCard());
	}

	private static String chooseRandomCard() {
		return chooseRandomRank() + "of" + chooseRandomSuit();

	}

	private static String chooseRandomRank() {
		int randomNumber = rgen.nextInt(13) + 1;
		switch (randomNumber) {

		case 1:
			return "1";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "Q";
		case 12:
			return "J";
		case 13:
			return "K";
		default:
			return "hata";

		}

	}

	private static String chooseRandomSuit() {

		int randomNumber = rgen.nextInt(4);

		switch (randomNumber) {
		case 0:
			return "Maça";
		case 1:
			return "Kupa";
		case 2:
			return "Karo";
		case 3:
			return "Sinek";
		default:
			return "hata";

		}
	}
}