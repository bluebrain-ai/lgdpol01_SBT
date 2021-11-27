package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaCommercial {
    private String caBAddress;
    private String caBPostcode;
    private String caBLatitude;
    private String caBLongitude;
    private String caBCustomer;
    private String caBProptype;
    private int caBFireperil;
    private int caBFirepremium;
    private int caBCrimeperil;
    private int caBCrimepremium;
    private int caBFloodperil;
    private int caBFloodpremium;
    private int caBWeatherperil;
    private int caBWeatherpremium;
    private int caBStatus;
    private String caBRejectreason;
    private String caBFiller;

    public String toFixedWidthString() {
        return caBAddress + caBPostcode + caBLatitude + caBLongitude + caBCustomer + caBProptype + caBFireperil
                + caBFirepremium + caBCrimeperil + caBCrimepremium + caBFloodperil + caBFloodpremium + caBWeatherperil
                + caBWeatherpremium + caBStatus + caBRejectreason + caBFiller;
    }

}