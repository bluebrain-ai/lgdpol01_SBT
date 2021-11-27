package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaEndowment {
    private String caEWithProfits;
    private String caEEquities;
    private String caEManagedFund;
    private String caEFundName;
    private int caETerm;
    private int caESumAssured;
    private String caELifeAssured;
    private String caEPaddingData;

    public String toFixedWidthString() {
        return caEWithProfits + caEEquities + caEManagedFund + caEFundName + caETerm + caESumAssured + caELifeAssured
                + caEPaddingData;
    }

}