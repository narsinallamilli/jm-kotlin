package com.ex.jm;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.camel.CamelContext;

public abstract class CommonService implements Service {
    @Autowired
    CamelContext camelContext;
}