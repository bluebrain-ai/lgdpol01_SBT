package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;
import com.bluescript.demo.model.EmVariable;

@Data
@Component

public class ErrorMsg {
    private String emDate;
    private String emTime;
    private EmVariable emVariable;

    public String toFixedWidthString() {
        return emDate + emTime + emVariable.toFixedWidthString();
    }

}