package com.example.osgiproducer.package01.internal;

import com.example.osgiproducer.package01.Producer;
import com.example.osgiproducer.package01.ProducerImpl;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * Created by dewni on 10/4/17.
 */
@Component(name = "com.example.osgiproducer.package01.internal.ProducerComponent",
        immediate = true)
public class ProducerComponent {

    @Activate
    protected void activate(BundleContext bundleContext) {

        bundleContext.registerService(Producer.class, new ProducerImpl(), null);
    }
}
