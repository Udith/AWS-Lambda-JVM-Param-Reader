package com.udith.sample.lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JVMParamReaderTest {
  @Test
  public void successfulResponse() {
    JVMParamReader JVMParamReader = new JVMParamReader();
    Object result = JVMParamReader.handleRequest(null, null);
    System.out.println(result);
  }
}
