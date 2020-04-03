package New;

public class Vowels {

	public static void main(String[] args) {
		int result = vowelsCount("Morning");
     System.out.println(result);
	}
  public static int vowelsCount(String word) 
  {
	  int result =0;
	  word = word.toLowerCase();
	  for ( int i = 0; i < word.length(); i ++) 
	  {
		  char letter = word.charAt(i);
		  if(letter =='a'||letter =='e'||letter =='i'||letter =='o'||letter =='u') 
		  {
		result++;
		
			  
			  
		  }
		  
		  
		  
	  }
	  
	  
	  
	  return result;
	  
	  
  }
}
