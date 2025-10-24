package com.armandodev.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class Utils {

    public static BigDecimal returnValorDeString(String valor) {
        
        if(StringUtils.isNotBlank(valor)){
            return new BigDecimal(valor.replaceAll("[.]", "").replace(",", "."));            
        } 
        
        return BigDecimal.ZERO;
        
    }
    
    public static boolean isNullOrEmpty( final Collection< ? > c ) {
        return c == null || c.isEmpty();
    }

    public static boolean isNullOrEmpty( final Map< ?, ? > m ) {
        return m == null || m.isEmpty();
    }
  
}
