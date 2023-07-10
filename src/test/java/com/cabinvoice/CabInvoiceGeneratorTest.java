package com.cabinvoice;


import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public  void TotalFare(){
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25,result,0);

    }

}