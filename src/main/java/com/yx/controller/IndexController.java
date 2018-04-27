package com.yx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "<div style='width:100%; text-align:center;font-size:60px;color:red;'>start success!</div>";
    }
}
