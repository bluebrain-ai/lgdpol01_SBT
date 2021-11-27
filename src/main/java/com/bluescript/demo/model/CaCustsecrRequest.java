package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaCustsecrRequest {
    private String caCustsecrPass;
    private String caCustsecrCount;
    private String caCustsecrState;
    private String caCustsecrData;

    public String toFixedWidthString() {
        return caCustsecrPass + caCustsecrCount + caCustsecrState + caCustsecrData;
    }

}