package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        String clean = nospace(s).toLowerCase(); 
        return clean.equals(reverse(clean));
    }
    public String reverse(String s) {
          String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public String nospace(String s){
        String spaceless = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {         
                spaceless += c;
            }
        }
        return spaceless;
    }
}
