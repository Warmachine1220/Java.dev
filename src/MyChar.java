
public class MyChar {
	private char c1;

	MyChar(char c1) {
		this.c1 = c1;
	}

	public char getC1() {
		return c1;
	}

	public void setC1(char c1) {
		this.c1 = c1;
	}

	boolean isVowel(){
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1 == 'I'
				|| c1 == 'O' || c1 == 'U') {
			return true;
		} else {
			return false;
		}
	}
		boolean isDigit(){
		if (c1 >= 48 && c1 <= 57) {
			return true;
		} else {
			return false;
		}
			
		}

		}
		
		


