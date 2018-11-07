package com.today.msg.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hz.lei
 */
public class MsgAgent {

    private static final Logger LOGGER = LoggerFactory.getLogger(MsgAgent.class);

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //graceful shutdown
        context.registerShutdownHook();
        context.start();
        LOGGER.info("\n" + MsgAgent.class.getName() + "::kafka msg agent started\n");
    }
}
