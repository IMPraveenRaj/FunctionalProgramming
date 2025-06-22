package com.springheaven.functional.doubts;

import java.util.Arrays;
import java.util.UUID;

public class AgreementMain {

    private String name="agreeementTesting";

    private Integer id;

    private String contract;

    private boolean agreementStatus;

    private long accountNo;


    public static void main(String[] args) {

        AgreementId agreementId=new AgreementId(10000L,123456L,null, UUID.randomUUID());
       agreementId.display();
        String accountNumberString[] = {agreementId.getAccountNumberString()};
        Arrays.stream(accountNumberString).forEach(no-> System.out.println(no));
    }
}
