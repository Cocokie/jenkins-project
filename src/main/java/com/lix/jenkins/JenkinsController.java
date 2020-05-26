package com.lix.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jenkins
 * @description:
 * @author: lixin
 * @create: 2020-05-25 09:43
 **/
@RestController
public class JenkinsController {
    @GetMapping("jenkinsGet")
    public String jenkinsGet() {
        System.out.println("幽幽潜行1");
        return "Jenkins-success";
    }
}
