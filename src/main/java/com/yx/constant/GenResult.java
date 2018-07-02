package com.yx.constant;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 结果代码
 *
 * @author NMY
 */

public enum GenResult {
    /**
     * 请求成功
     */
    SUCCESS(1000, "请求成功!"),

    /**
     * 请求失败
     */
    FAILED(1001, "请求失败!"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(9999, "未知异常!"),;

    public int msgCode;
    public String message;

    GenResult(int msgCode, String message) {
        this.msgCode = msgCode;
        this.message = message;
    }

    public Map<String, Object> genResult() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", msgCode);
        map.put("msg", message);
        return map;
    }

    public Map<String, Object> genResult(Object data) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", msgCode);
        map.put("msg", message);
        map.put("data", data);
        return map;
    }
}
