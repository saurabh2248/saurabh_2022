package com.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class TestCalculator {
   Calculator c= null;
   CalculatorService service = Mockito.mock(CalculatorService.class);
   
   
   @Before
   public void setUp() {
	   c =  new Calculator(service);
   }
   
   @Test
   public void testPerformAdd() {
	   when(service.add(6, 4)).thenReturn(10);
	   assertEquals(10, c.testPerformAdd(6, 4));
   }
   
   @Test
   public void testPerformSub() {
	   when(service.sub(6, 4)).thenReturn(2);
	   assertEquals(2, c.testPerformSub(6, 4));
   }
   
   @Test
   public void testPerformMul() {
	   when(service.add(6, 4)).thenReturn(24);
	   assertEquals(24, c.testPerformMul(6, 4));
   }
   
   
   @Test
   public void testAdd() {
	   assertEquals(10, c.add(6, 4));
   }
   
   @Test
   public void testSub() {
	   assertEquals(2, c.sub(6, 4));
   }
   
   @Test
   public void testMul() {
	   assertEquals(24, c.mul(6, 4));
   }
   
}
