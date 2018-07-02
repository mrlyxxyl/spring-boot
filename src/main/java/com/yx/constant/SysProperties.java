package com.yx.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 读取application.properties文件中的配置
 * Date: 18-4-11
 *
 * @author NMY
 */
@Component
public class SysProperties {

    @Value("${server.id}")
    private String serverId;

    public String getServerId() {
        return serverId;
    }
}
