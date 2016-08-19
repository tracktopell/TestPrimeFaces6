package com.pmarlen.testjsf.managedbean;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Alfredo Estrada
 */
@ManagedBean(name = "bean")
public class Bean {
    String value;
    private final static Logger LOGGER = Logger.getLogger(Bean.class.getName()); 
    
    public Bean(String value) {
        this.value = value;
        LOGGER.info("->Bean(String value="+value+")");
    }

    public Bean() {
        LOGGER.info("->Bean()");
    }

    public String getValue() {
        LOGGER.info("->getValue(): return "+value+";");
        return value;
    }

    public void setValue(String value) {
        LOGGER.info("->setValue(String value="+value+")");
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bean{value='"+value+"'}";
    }    
}
