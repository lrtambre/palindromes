package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.main.Palindrome;

public class PalindromeTest {

	public PalindromeTest() {
	}


  @Test
  public void testNumericPalindrome() {
	  //12321
	  char[] inputList = "12321".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
  }

  @Test
  public void testAlbhabeticPalindrome() {
	  //madam
	  char[] inputList = "madam".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
   }
  
  @Test
  public void testAlphaNumericPalindrome() {
	  //abc121cba
	  char[] inputList = "abc121cba".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
   }

  @Test
  public void testAlphaNumericString() {
	  //abcabc123
	  char[] inputList = "abcabc123".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(false, p.isPalindrome(p.createList(inputList)));
   }

  @Test
  public void testMixedCaseString() {
	  //Mom
	  char[] inputList = "Mom".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(false, p.isPalindrome(p.createList(inputList)));
   }
  
  @Test
  public void testPalindromeWithSpaces() {
	  //race car
	  char[] inputList = "race car".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(false, p.isPalindrome(p.createList(inputList)));
   }
  
  @Test
  public void testPalindromeWithoutSpaces() {
	  //racecar
	  char[] inputList = "racecar".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
   }
  
  @Test
  public void testPalindromeEqualTo128Chars() {
	  //racecar
	  char[] inputList = getLongInputEqualTo128Chars().toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
   }
  
  @Test
  public void testPalindromeGreaterThan128Chars() {
	  //racecar
	  char[] inputList = getLongInputGreaterThan128Chars().toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(true, p.isPalindrome(p.createList(inputList)));
   }
  
  public String getLongInputEqualTo128Chars() {
		StringBuffer str1 = new StringBuffer("hithisisateststringwhichislessthansixtyfourcharacters0123456789");
		StringBuffer str2 = new StringBuffer("hithisisateststringwhichislessthansixtyfourcharacters0123456789");
		str2.reverse();
		return str1.append(str2).toString();
	}

  public String getLongInputGreaterThan128Chars() {
		StringBuffer str1 = new StringBuffer("Extracharshithisisateststringwhichislessthansixtyfourcharacters0123456789");
		StringBuffer str2 = new StringBuffer("Extracharshithisisateststringwhichislessthansixtyfourcharacters0123456789");
		
		str2.reverse();
		return str1.append(str2).toString();
	}
  @Test
  public void testNullPalindrome() {
	  //
	  char[] inputList = "".toCharArray();
	  Palindrome p = new Palindrome();
	  assertEquals(false, p.isPalindrome(p.createList(inputList)));
  }
}
