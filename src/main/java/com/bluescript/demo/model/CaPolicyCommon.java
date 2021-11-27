package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaPolicyCommon {
    private String caIssueDate;
    private String caExpiryDate;
    private String caLastchanged;
    private long caBrokerid;
    private String caBrokersref;
    private int caPayment;

    public String toFixedWidthString() {
        return caIssueDate + caExpiryDate + caLastchanged + caBrokerid + caBrokersref + caPayment;
    }

}