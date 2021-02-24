package com.jikewang.streaming.flink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ProjectName: myfamily
 * @Package: com.jikewang.myfamily.component
 * @ClassName: InitProject
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/2/24 18:09
 * @Version: 1.0
 */
@Component
public class InitProject implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(InitProject.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("==========init project===========");
        ClassLoader classLoader = GroupedProcessingTimeWindowSample.class.getClassLoader();
        Class<?> loadClass = classLoader.loadClass("com.jikewang.streaming.flink.GroupedProcessingTimeWindowSample");
        Method method = loadClass.getMethod("main", String[].class);
        method.invoke(null, new Object[]{new String[]{}});
    }
}
