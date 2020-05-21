package com.udith.sample.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

/**
 * Handler for requests to Lambda function.
 */
public class JVMParamReader implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {

        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        runtimeMxBean.getInputArguments().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        System.out.println();

        return "Successful";
    }
}
