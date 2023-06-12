package chapter07;
import java.time.*;
import javax.swing.JOptionPane;
public class Eingabetest {

	public static void main(String[] args) {
		Instant start = Instant.now();
		
		long startTime = System.currentTimeMillis();
		String eingabe = JOptionPane.showInputDialog("Geben sie den Satz: "
				+ "\n\'Fischers Fritz fischt frische Fische\'\nmöglichst schnell korrekt ein");
		long endTime = System.currentTimeMillis();
		
		Instant end = Instant.now();
		
		boolean isCorrect = eingabe.equals("Fischers Fritz fischt frische Fische");
		
		Duration dauer = Duration.between(start, end);
		
		long elapsedTime = endTime - startTime;
		long minutes = (elapsedTime / 1000) / 60;
		long seconds = (elapsedTime / 1000) % 60;
		long millis = elapsedTime % 60;
		
		if(isCorrect) {
			JOptionPane.showMessageDialog(null,"Fehlerfrei! Zeit: " + dauer.toMinutesPart() + " Minuten " + dauer.toSecondsPart()
											+ " Sekunden und " + dauer.toMillisPart() + " Millisekunden");
		}
		else {
			JOptionPane.showMessageDialog(null,"Falsche eingabe");
		}
	}

}
