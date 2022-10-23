
public class StringManip {
	
	//Takes a string str and returns a new string with all spaces removed
	public static String removeSpaces(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				newStr += str.substring(i, i+1);
			}
		}
		return newStr;	
	}
	
	//Takes a string str and returns a new string with the characters reversed, as described in part(a)
	public static String reverseString(String str) {
		//implemented in part(a)
		
	}
	
	//Determines where str is a palindrome and prints a message indicating the result, as described in part (b)
	//Precondition: str contains only lowercase letters and spaces
	public static void palindromeChecker(String str) {
		//implemented in part (b)
		
			
	}
	
	public static void main(String[] args) {
		//I included the main method so that you could test your code more easily.
    //This method is not required for the question.
	}
}
