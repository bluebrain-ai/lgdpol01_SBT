package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaClaim {
    private long caCNum;
    private String caCDate;
    private int caCPaid;
    private int caCValue;
    private String caCCause;
    private String caCObservations;
    private String caCFiller;

    public String toFixedWidthString() {
        return caCNum + caCDate + caCPaid + caCValue + caCCause + caCObservations + caCFiller;
    }

}