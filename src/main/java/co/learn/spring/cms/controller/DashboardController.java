package co.learn.spring.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String viewDashboard(){
        return "dashboard/dashboard";
    }
}
