package com.armandodev.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import javax.swing.JOptionPane;
import org.apache.commons.lang.StringUtils;

public class TableComparatorUtil {

    public static Comparator<String> returnComparatorBigDecimal() {
        return (num1, num2) -> {
            if (StringUtils.isNotBlank(num2) && StringUtils.isNotBlank(num1)) {
                return Utils.returnValorDeString(num1).compareTo(Utils.returnValorDeString(num2));
            }            
            return 0;            
        };
    }
    
    public static Comparator<String> returnComparatorLong() {
        
        Comparator<String> compLong = new Comparator<String>() {
            public int compare(String num1, String num2) {
                Long numero1 = new Long(num1.replaceAll("[.]", "").replace("/", "").replace("-", ""));
                Long numero2 = new Long(num2.replaceAll("[.]", "").replace("/", "").replace("-", ""));
                return numero1.compareTo(numero2);
            }
        };
        
        return compLong;
        
    }
    
    public static Comparator<Object> returnComparatorNumber() {
        return (num1, num2) -> {
            Long numero1 = Long.parseLong(String.valueOf(num1).replaceAll("[.]", "").replace("/", "").replace("-", ""));
            Long numero2 = Long.parseLong(String.valueOf(num2).replaceAll("[.]", "").replace("/", "").replace("-", ""));
            return numero1.compareTo(numero2);
        };
    }
    
    public static Comparator<String> returnComparatorDate(String formato) {
        
        DateFormat sdf = new SimpleDateFormat(formato);
        return (dt1, dt2) -> {
            
            if (StringUtils.isNotBlank(dt1) && StringUtils.isNotBlank(dt2)) {
                try {
                    return sdf.parse(dt1).compareTo(sdf.parse(dt2));
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            }
            
            return 0;
            
        };
        
    }
    
}
