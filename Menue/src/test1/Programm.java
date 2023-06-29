package test1;

public class Programm {

	public static void main(String[] args) {
		
		Tier meinTier = new Hund();
		meinTier.machtGeraeusch();
		meinTier = new Katze();
		meinTier.machtGeraeusch();
	}

}
