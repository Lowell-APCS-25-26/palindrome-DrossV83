package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

// test
// rotator
// rewriter
// nurses run
// Madam, I'm Adam!
// A Man! A Plan! A Canal! Panama!

public class PalindromeTest {
    @Test
    public void testTest() {
        Palindrome p = new Palindrome();
        assert(!p.palindrome("test"));
    }
    @Test
    public void testRotator() {
        Palindrome p = new Palindrome();
        assert(p.palindrome("rotator"));
    }
    @Test
    public void testRewriter() {
        Palindrome p = new Palindrome();
        assert(!p.palindrome("rewriter"));
    }
    @Test
    public void testNusesRun() {
        Palindrome p = new Palindrome();
        assert(p.palindrome("nurses run"));
    }
    @Test
    public void testMadamImAdam() {
        Palindrome p = new Palindrome();
        assert(p.palindrome("Madam, I'm Adam"));
    }
    @Test
    public void testAManAPlanACanalPanama() {
        Palindrome p = new Palindrome();
        assert(p.palindrome("A Man! A Plan! A Canal! Panama!"));
    }
}
