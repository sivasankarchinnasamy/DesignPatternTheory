package com.dp.jtp.DPTheory.abstractfactory;

class ICICI implements Bank{  
    private final String BNAME;  
    ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
    }  
}
