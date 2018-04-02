package com.jrp;

import com.jrp.model.InvestmentTrust;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstituentService {

   private final Repository repository;

   public ConstituentService() {
      this.repository = new HardcodedDataRepository();
   }

   public void findFunds() {
      List<String> instrumentIds= Arrays.asList("1");
      List<InvestmentTrust> investmentTrusts = repository.get();
      List<InvestmentTrust> results = investmentTrusts.stream().filter(it ->it.instrumentIds().containsAll(instrumentIds)).collect(Collectors.toList());

      results.stream().forEach(it -> System.out.println(it));



   }
}
