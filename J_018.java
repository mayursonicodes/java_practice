/*
Bank Account and KYC:

Create a class BankAccount with:
accId - String
accHolderName - String
accType - String in saving or current
occupation - String

Create a class KYC with:
panCardNumber - String
accountIdentificationType - String
accountIdentification - String
status - String

Provide appropriate constructors, getters and setters for all the attributes.

A BankAccount has exactly one KYC object and KYC does not exists uniquely and always account should have a bank.

Create a static method findbankByKYC:
This method will take an array of BankAccount objects and a String parameter as input parameters.
This method will return BankAccount objects whose account type matches the given account type (String parameter passed) and whose associated KYC status is "Lapsed".
The comparison should be case-insensitive.
If no BankAccount object satisfies the given criteria, then the method should return null.
*/

import java.util.*;

class BankAccount{
    private String accId;
    private String accHolderName;
    private String accType;
    private String occupation;
    private KYC kyc;

    BankAccount(String a, String b, String c, String d, KYC kyc){
        accId = a;
        accHolderName = b;
        accType = c;
        occupation = d;
        this.kyc = kyc;
    }

    public String getAccType() {
        return accType;
    }

    public String getKycStatus(){
        return kyc.getStatus();
    }
}

class KYC{
    private String panCardNumber;
    private String accountIdentificationType;
    private String accountIdentification;
    private String status;

    KYC(String a, String b, String c, String d){
        panCardNumber = a;
        accountIdentificationType = b;
        accountIdentification = c;
        status = d;
    }

    public String getStatus() {
        return status;
    }
}

public class J_018 {
    static BankAccount[] findBankByKYC(BankAccount banks[], String accType){
        int size = 0;
        for(BankAccount x: banks){
            if(x.getAccType().equalsIgnoreCase(accType) && x.getKycStatus().equalsIgnoreCase("Lapsed"))
                size++;
        }
        
        if(size == 0) return null;
        
        BankAccount ans[] = new BankAccount[size--];
        
        for(BankAccount x: banks){
            if(x.getAccType().equalsIgnoreCase(accType) && x.getKycStatus().equalsIgnoreCase("Lapsed")){
                ans[size--] = x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}