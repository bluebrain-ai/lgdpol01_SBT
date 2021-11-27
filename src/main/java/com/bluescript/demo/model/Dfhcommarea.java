package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;
import com.bluescript.demo.model.CaCustomerRequest;
import com.bluescript.demo.model.CaCustsecrRequest;
import com.bluescript.demo.model.CaPolicyRequest;

@Data
@Component

public class Dfhcommarea {
    private String caRequestId;
    private int caReturnCode;
    private long caCustomerNum;
    private String caRequestSpecific;
    private CaCustomerRequest caCustomerRequest;
    private CaCustsecrRequest caCustsecrRequest;
    private CaPolicyRequest caPolicyRequest;

    public String toFixedWidthString() {
        return caRequestId + caReturnCode + caCustomerNum + caRequestSpecific + caCustomerRequest.toFixedWidthString()
                + caCustsecrRequest.toFixedWidthString() + caPolicyRequest.toFixedWidthString();
    }

}