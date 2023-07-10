package com.cabinvoice;

import org.junit.Assert;
import org.junit.Test;

class CabInvoiceGeneratorTest {
CabInvoiceGenerator obj=new CabInvoiceGenerator();

@Test
    public void totalFare(){
    double distance=2.0;
    int time=5;
    double totalFare= obj.calculateFare(distance,time);
    Assert.assertEquals(25,totalFare);

   }
}