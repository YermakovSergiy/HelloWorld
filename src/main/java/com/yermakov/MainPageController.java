package com.yermakov;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sergiy on 15.07.2015.
 */
@Controller
public class MainPageController {

    @RequestMapping(value = {"/", "/index"})
    public String indexPage() {
        return "index";
    }

}
