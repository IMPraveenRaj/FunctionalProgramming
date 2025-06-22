package com.springheaven.functional.doubts;

import java.util.UUID;
import java.util.regex.Pattern;

public class AgreementId {

private final Long relationId;

private final Long sequenceNumber;

private final Long accountNumber;

private final UUID uuid;


private static final Pattern COMPOUND_ID_PATTERN=Pattern.compile("(\\d+)-(\\d+)-(\\d+)-(\\d+)");
private static final Pattern ITALIAN_PATTERN=Pattern.compile("^[0-9]{3}[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{12}$");
    AgreementId(final Long relationId, final Long sequenceNumber, final Long accountNumber, final UUID uuid){
        this.relationId=relationId;
        this.accountNumber=accountNumber;
        this.sequenceNumber=sequenceNumber;
        this.uuid=uuid;
    }


    @Override
    public String toString() {
        return "AgreementId{" +
                "relationId=" + relationId +
                ", sequenceNumber=" + sequenceNumber +
                ", accountNumber=" + accountNumber +
                ", uuid=" + uuid +
                '}';
    }

    public void display(){
    System.out.println(this);
        System.out.println(ITALIAN_PATTERN.toString());
        System.out.println(COMPOUND_ID_PATTERN.toString());


    }

    public String getAccountNumberString(){

        return this.accountNumber!=null ? String.valueOf(this.accountNumber) : this.uuid.toString();
    }



}
