package com.springheaven.functional.cost;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CostDetailMain {


    public static void main(String[] args) {

        CostDetail ingsub =  CostDetail.builder().
                costKey("Ing Cost").
                build();
        List<CostDetail> ingCost= new ArrayList<>();
        ingCost.add(ingsub);




        CostDetail.Builder costBuilder = CostDetail.builder();
        CostDetail costBuild = costBuilder.
                costKey("total cost").costBreakDown(ingCost).
                amount(BigDecimal.valueOf(900))
                .build();
        System.out.println(costBuild);
    }

}
