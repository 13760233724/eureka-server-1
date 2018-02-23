/*
 * @Project Name: eureka-server
 * @File Name: Config
 * @Package Name: com.htxk.server
 * @Date: 2017/7/11 19:39
 * @Creator: liuliyang-186
 * @line------------------------------
 * @修改人: 
 * @修改时间: 
 * @修改内容: 
 */
package com.htxk.server;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author liuliyang-186
 * @date 2017/7/11 19:39
 * @return
 * @since 1.0.0
 */
@ConfigurationProperties
public class Config {
    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }
}
