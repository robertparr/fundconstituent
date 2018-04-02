package com.jrp.model;

import lombok.Data;
import lombok.Value;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Value
public class InvestmentTrust {

   private final String name;
   private final List<TopTenHolding> topTenHoldings;

   public Collection<String> instrumentIds() {
      return topTenHoldings.stream().map(TopTenHolding::getSedol).collect(Collectors.toList());
   }
}
