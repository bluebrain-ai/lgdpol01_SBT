package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;
import com.bluescript.demo.model.CaPolicyCommon;
import com.bluescript.demo.model.CaEndowment;
import com.bluescript.demo.model.CaHouse;
import com.bluescript.demo.model.CaMotor;
import com.bluescript.demo.model.CaCommercial;
import com.bluescript.demo.model.CaClaim;

@Data
@Component

public class CaPolicyRequest {
    private long caPolicyNum;
    private CaPolicyCommon caPolicyCommon;
    private String caPolicySpecific;
    private CaEndowment caEndowment;
    private CaHouse caHouse;
    private CaMotor caMotor;
    private CaCommercial caCommercial;
    private CaClaim caClaim;

    public String toFixedWidthString() {
        return caPolicyNum + caPolicyCommon.toFixedWidthString() + caPolicySpecific + caEndowment.toFixedWidthString()
                + caHouse.toFixedWidthString() + caMotor.toFixedWidthString() + caCommercial.toFixedWidthString()
                + caClaim.toFixedWidthString();
    }

}