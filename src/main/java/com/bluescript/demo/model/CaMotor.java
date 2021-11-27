package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaMotor {
    private String caMMake;
    private String caMModel;
    private int caMValue;
    private String caMRegnumber;
    private String caMColour;
    private int caMCc;
    private String caMManufactured;
    private int caMPremium;
    private int caMAccidents;
    private String caMFiller;

    public String toFixedWidthString() {
        return caMMake + caMModel + caMValue + caMRegnumber + caMColour + caMCc + caMManufactured + caMPremium
                + caMAccidents + caMFiller;
    }

}