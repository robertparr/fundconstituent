package com.jrp;

import com.jrp.model.InvestmentTrust;
import com.jrp.model.TopTenHolding;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class HardcodedDataRepository implements Repository {

   public List<InvestmentTrust> get() {

      List<TopTenHolding> holdings1 = asList(holding("1", 10),holding("2", 8),holding("3", 6),holding("4", 4),holding("5", 2));
      List<TopTenHolding> holdings2 = asList(holding("4", 10),holding("6", 8),holding("2", 6),holding("5", 4),holding("3", 2));

      return asList(investmentTrust("fund1", holdings1), investmentTrust("fund2", holdings2));
   }

   private InvestmentTrust investmentTrust(String name, List<TopTenHolding> holdings) {
      return new InvestmentTrust(name, holdings);
   }

   private TopTenHolding holding(String sedol, int pc) {
      return new TopTenHolding(sedol, new BigDecimal(pc));
   }

}
