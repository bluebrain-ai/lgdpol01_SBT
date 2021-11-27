package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class EmVariable {
    private static final String emVariable = " CNUM=";
    private String emCusnum;
    private static final String emCusnumExt = " PNUM=";
    private String emPolnum;
    private String emSqlreq;
    private static final String emSqlreqExt = " SQLCODE=";
    private int emSqlrc;

    public String toFixedWidthString() {
        return emVariable + emCusnum + emCusnumExt + emPolnum + emSqlreq + emSqlreqExt + emSqlrc;
    }

}