package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBracketsInDifferentOrders () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void emptyStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nestedBracketsReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Nested]]"));
    }

    @Test
    public void nestedOnNestedBracketsReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]]]"));
    }
    @Test
    public void onlyUnbalancedBracketsReturnFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsBalancedWithEveryOtherCharReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("L[A]U[N]C[H]"));
    }
    @Test
    public void bracketsWithSpacesReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ LaunchCode ]"));
    }
    @Test
    public void bracketsWithUnbalancedNestedReturnFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Nes][ted]"));

    }
    @Test
    public void bracketsWithSpecialCharactersReturnTrue () {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Special[{Character}]"));
    }

    @Test
    public void nestedEmptyBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void nestedEmptyUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }

}