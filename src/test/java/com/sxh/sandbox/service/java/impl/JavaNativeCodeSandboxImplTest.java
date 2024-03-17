package com.sxh.sandbox.service.java.impl;

import cn.hutool.core.io.resource.ResourceUtil;
import com.sxh.sandbox.model.ExecuteCodeRequest;
import com.sxh.sandbox.service.java.JavaNativeCodeSandbox;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JavaNativeCodeSandboxImplTest {


    @Test
    void testNormal(){
        JavaNativeCodeSandboxImpl javaNativeCodeSandbox = new JavaNativeCodeSandboxImpl();
        ExecuteCodeRequest executeCodeRequest = new ExecuteCodeRequest();
        executeCodeRequest.setInputList(Arrays.asList("1 2", "3 4", "5 6", "7 8"));
        String code = ResourceUtil.readStr("testCode/simpleCompute/Main.java", StandardCharsets.UTF_8);
        executeCodeRequest.setCode(code);
        executeCodeRequest.setLanguage("java");
        javaNativeCodeSandbox.executeCode(executeCodeRequest);

    }

}