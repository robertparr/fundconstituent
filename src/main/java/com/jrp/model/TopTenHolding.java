package com.jrp.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class TopTenHolding {

   private final String sedol;
   private final BigDecimal percentage;
}
