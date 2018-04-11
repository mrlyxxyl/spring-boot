package com.light.springboot.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 读取application.properties文件中的配置
 * User: LiWenC
 * Date: 18-4-11
 */
@Component
public class SysProperties {

    @Value("${server.id}")
    private String serverId;

    public String getServerId() {
        return serverId;
    }
}
