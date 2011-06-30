package com.cloudsoftcorp.monterey.example.noapisimple.impl;

import java.io.Serializable;

import com.cloudsoftcorp.monterey.network.api.MediationSegmentService;
import com.cloudsoftcorp.monterey.network.api.MediationSegmentServiceFactory;
import com.cloudsoftcorp.monterey.network.api.SegmentStateBackup;
import com.cloudsoftcorp.monterey.servicebean.api.AbstractBeanSegmentService;

/**
 * Generated by Cloudsoft Monterey.
 */
public class HelloCloudSegmentService extends AbstractBeanSegmentService<com.cloudsoftcorp.monterey.example.noapisimple.Helloee> {
    public static class Factory implements MediationSegmentServiceFactory {
        public MediationSegmentService newSegmentService(String segment) {
            return new HelloCloudSegmentService();
        }
        public SegmentStateBackup newSegmentBackup(String segment) {
            return null; // Unsupported
        }
    }

    @Override
    protected com.cloudsoftcorp.monterey.example.noapisimple.Helloee newBean(String segment) {
        return new com.cloudsoftcorp.monterey.example.noapisimple.impl.HelloeeImpl();
    }
    
    @Override
    protected com.cloudsoftcorp.monterey.example.noapisimple.Helloee resumeBean(Object suspendedState) {
        // Note: please modify resume and suspend methods for custom serialization/lifecycle requirements
        return super.resumeBean(suspendedState);
    }

    @Override
    protected Serializable suspendBean(com.cloudsoftcorp.monterey.example.noapisimple.Helloee delegate) {
        // Note: please modify resume and suspend methods for custom serialization/lifecycle requirements
        return super.suspendBean(delegate);
    }
}
