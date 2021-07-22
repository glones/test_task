# Test task to Ajax

## The result can be viewed in the [Main class](src/main/java/Main.java)

## Quizzes:

1
You are given a two-digit integer n. Return the sum of its digits.
Example
Example 1
For n = 29, the output should be addTwoDigits(n) = 11.
Example 2
For n = 48, the output should be addTwoDigits(n) = 12.
Input/Output
[execution time limit] 3 seconds (java)

[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 ≤ 	n ≤ 99.

[output] integer

The sum of the first and second digits of n.


int addTwoDigits(int n) {

}


2
Given an integer n, return the largest number that contains exactly n digits.
Example
For n = 2, the output should be
largestNumber(n) = 99.
Input/Output
[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ 	n ≤ 9.

[output] integer

The largest integer of length n.




int largestNumber(int n) {

}


3
Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
Example
For s = "abacabad", 	the output should be
firstNotRepeatingCharacter(s) 	= 'c'.

There are 2 non-repeating characters 	in the string: 'c' and 'd'. 	Return c since it appears in the string 	first.

For s = "abacabaabacaba", 	the output should be
firstNotRepeatingCharacter(s) 	= '_'.

There are no characters in this string that do not repeat.


Input/Output
[execution time limit] 3 seconds (java)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ 	s.length ≤ 105.

[output] char

The first non-repeating character in s, 	or '_' if there are no characters that 	do not repeat.


char firstNotRepeatingCharacter(String s) {

}
