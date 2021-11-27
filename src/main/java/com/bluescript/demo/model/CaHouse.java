package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class CaHouse {
    private String caHPropertyType;
    private int caHBedrooms;
    private int caHValue;
    private String caHHouseName;
    private String caHHouseNumber;
    private String caHPostcode;
    private String caHFiller;

    public String toFixedWidthString() {
        return caHPropertyType + caHBedrooms + caHValue + caHHouseName + caHHouseNumber + caHPostcode + caHFiller;
    }

}