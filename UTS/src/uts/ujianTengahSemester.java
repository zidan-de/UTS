package uts;

public class ujianTengahSemester {
	public static void main(String[] args){
		
		//source from https://www.twoh.co/2011/02/18/java-array-karakter-dari-a-z/
		//from this
		char[] abjad = new char[26];
		for(char i='A'; i<='Z'; i++) {
			abjad[i-'A'] = i;
		}
		//to this
		
		//https://www.it-swarm.dev/id/java/bagaimana-cara-mengubah-array-char-menjadi-string/939804247/
		//from this
		String alfabet = String.valueOf(abjad);
		//to this

		int [] n = {25, 8, 3, 0, 13};
		String gabung = "";
		for(int i=0; i<n.length; i++) {
			System.out.print("" + alfabet.charAt(n[i]) + "-" );
			
			gabung += alfabet.charAt(n[i]);
				
		}
		
		System.out.println("\n");
		System.out.println(gabung);
		}
}
