package sdet_InRhytm;

public class Find_LengthAndWord_Longest {
public boolean length_word(String InputString, int MaxLen_Expected) {	  
	 // int MaxLen_Expected = 8;
	  boolean Result = true;	  
	  String[] word = InputString.split(" ");
      
      int MaxLen = 0;
      int Count =0;
      //Calculate length of longest word MaxLen
      for (int i=0;i<word.length;i++) 
      {
    	  if(word[i].length() > MaxLen)
    	  {
    		  MaxLen = word[i].length();
    	  }
      }
     //Count how many words have length which is MaxLen
      for (int i=0;i<word.length;i++)
      {
    	  if(MaxLen ==word[i].length())
    	  {
    		  Count++;
    	  }

      }
      
      String [] MaxStrings = new String[Count];
      //Find all words with MaxLen
      int j=0;
      for (int i=0;i<word.length;i++)
      {
    	  if(MaxLen ==word[i].length())
    	  {
    		  MaxStrings[j]=word[i];
    		  j++;
    	  }

      }
      
      System.out.println("----------------------------------------------------------");
      System.out.println("Longest word in string has length of " + InputString);
      System.out.println("Longest word in string has length of " + MaxLen);
      System.out.println("Below is list of longest word/words");
  
      for (int k=0;k<Count;k++)
      {
    	  System.out.println(MaxStrings[k]);
      }
      
      System.out.println("----------------------------------------------------------");
      if(MaxLen == MaxLen_Expected)
      {
    	  Result = true;
      }else {Result = false;}
	
      return Result;
      
      
  }


}
