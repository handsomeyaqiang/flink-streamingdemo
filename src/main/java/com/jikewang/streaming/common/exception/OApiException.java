package com.jikewang.streaming.common.exception;

import java.io.IOException;

/**
 * @ProjectName: myfamily
 * @Package: com.jikewang.myfamily.common.exception
 * @ClassName: OApiException
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2020/8/8 10:51
 * @Version: 1.0
 */
public class OApiException extends Exception{
    private static final long serialVersionUID = 1L;

    public OApiException(int errCode, String errMsg) {
        super("error code: " + errCode + ", error message: " + errMsg);
    }

    public OApiException(IOException e) {
        super(e);
    }
}
