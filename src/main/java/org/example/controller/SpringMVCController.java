package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/my-server")
public class SpringMVCController {

    @RequestMapping("/enterInfo")
    public String enterInfo() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(HttpServletRequest request, Model model) {
        String country = "Country " + request.getParameter("country");
        String capital = "Capital " + request.getParameter("capital");
        model.addAttribute("newCountry", country);
        model.addAttribute("newCapital", capital);
        return "showInfo";
    }


}
