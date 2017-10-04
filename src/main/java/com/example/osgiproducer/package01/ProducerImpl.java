package com.example.osgiproducer.package01;

import java.util.logging.Logger;

/**
 * Created by dewni on 10/4/17.
 */
public class ProducerImpl implements Producer{

    private static final Logger LOGGER = Logger.getLogger(ProducerImpl.class.getName());

    @Override
    public void produce(String name) {
        
        LOGGER.info("Successfully produced: "+ name);
        
    }

}
