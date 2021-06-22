package learn.linux.build.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujianrong
 * @date 2021/6/22
 */
@RestController
public class DefaultController {


    @RequestMapping("/test")
    public String testRequest(){

        return "v1.1";

    }

}
