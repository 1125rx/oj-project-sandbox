package com.sxh.sandbox.service.java;

import com.sxh.sandbox.model.ExecuteCodeRequest;
import com.sxh.sandbox.model.ExecuteCodeResponse;

public interface JavaNativeCodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
