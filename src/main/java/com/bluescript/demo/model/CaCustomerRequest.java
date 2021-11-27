package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaCustomerRequest {
    private String caFirstName;
    private String caLastName;
    private String caDob;
    private String caHouseName;
    private String caHouseNum;
    private String caPostcode;
    private int caNumPolicies;
    private String caPhoneMobile;
    private String caPhoneHome;
    private String caEmailAddress;
    private String caPolicyData;

    public String toFixedWidthString() {
        return caFirstName + caLastName + caDob + caHouseName + caHouseNum + caPostcode + caNumPolicies + caPhoneMobile
                + caPhoneHome + caEmailAddress + caPolicyData;
    }

}