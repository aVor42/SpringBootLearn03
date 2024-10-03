package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public String showStatus() {
        return "SUCCESS_STATUS";
    }

}
