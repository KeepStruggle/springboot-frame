package com.james.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.8
 * @ClassName LogController
 * @Description TODO
 * @Author James
 * @date 2020/10/28 0:25
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class LogController {

    @RequestMapping("/log")
    public String testLog(){
        log.info("====测试日志info级别打印===");
        return "success";
    }
}
