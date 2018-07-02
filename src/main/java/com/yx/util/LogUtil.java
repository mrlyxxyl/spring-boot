package com.yx.util;

import org.apache.log4j.Logger;

/**
 * Date: 18-4-26
 *
 * @author NMY
 */
public class LogUtil {

    private static Logger log = Logger.getLogger(LogUtil.class);

    public static void error(Exception e) {
        log.error(e, e);
    }

    public static void info(Object msg) {
        log.info(msg);
    }

    public static void debug(Object msg) {
        log.debug(msg);
    }

    public static void fatal(Exception e) {
        log.fatal(e, e);
    }
}
