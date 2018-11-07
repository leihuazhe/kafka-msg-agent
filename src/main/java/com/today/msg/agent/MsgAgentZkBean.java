package com.today.msg.agent;

import com.github.dapeng.openapi.cache.ZkBootstrap;
import com.today.eventbus.agent.support.parse.ParserUtil;
import org.springframework.beans.factory.InitializingBean;

import java.util.Set;

/**
 * Desc: MsgAgentFactoryBean
 *
 * @author hz.lei
 * @date 2018年05月17日 下午12:28
 */
public class MsgAgentZkBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        ZkBootstrap bootstrap = new ZkBootstrap();
        Set<String> serviceSet = ParserUtil.getConsumerServiceSet();
        bootstrap.filterInit(serviceSet);
    }
}
