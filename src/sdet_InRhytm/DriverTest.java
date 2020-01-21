package sdet_InRhytm;

import org.testng.annotations.Test;
import org.testng.Assert;


public class DriverTest extends Find_LengthAndWord_Longest {
 @Test
 public void unitTest_2_singleword() {
     String InputString ="This is demo test for SDET Inrhythm Inrhythms";
	 int MaxLen_Expected = 9;
	 //AssertJUnit.assertTrue(super.length_word(InputString,MaxLen_Expected));
	 Assert.assertTrue(super.length_word(InputString,MaxLen_Expected));
  }

 @Test
 public void unitTest_1_multiplewords() {
	 String InputString ="This is demo test for SDET Inrhythm Inrhythm abcdefgh";
	 int MaxLen_Expected = 8;
	 Assert.assertTrue(super.length_word(InputString,MaxLen_Expected));
  }
    
  @Test
  public void unitTest_3_oneword() {
	  String InputString ="Inrhythms";
		 int MaxLen_Expected = 9;
		 Assert.assertTrue(super.length_word(InputString,MaxLen_Expected));		 
  }
  
  @Test
  public void unitTest_4_specialChars() {
	  String InputString ="This is demo test for SDET Inrhythm Inrhythms$@*";
		 int MaxLen_Expected = 12;
		 Assert.assertTrue(super.length_word(InputString,MaxLen_Expected));	 
  }
  
  @Test
  public void unitTest_4_alphanumeric() {
	  String InputString ="This is demo test for 12345678901234 SDET Inrhythm Inrhythms$@* ";
		 int MaxLen_Expected = 12;
		 Assert.assertTrue(super.length_word(InputString,MaxLen_Expected));	
  }
}
