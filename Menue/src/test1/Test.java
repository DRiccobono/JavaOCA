package test1;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder();
		
		a.append(" ");
		a.append(" ");
		a.append(" ");
		a.append(" ");
		a.setCharAt(2, 'r');
		a.setCharAt(0, 'a');
		System.out.println(a);
		
	}

}
