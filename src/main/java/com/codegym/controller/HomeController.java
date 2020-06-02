package com.codegym.controller;

import com.codegym.model.ConfigEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @ModelAttribute("languages")
    public List<String> languages() {
        List<String> languages = new ArrayList<>();
        languages.add("english");
        languages.add("vietnamese");
        languages.add("spanish");
        languages.add("chines");
        languages.add("korean");
        return languages;
    }
    @ModelAttribute("sizes")
    public List<String> sizes() {
        List<String> sizes = new ArrayList<>();
        sizes.add("25");
        sizes.add("30");
        sizes.add("35");
        sizes.add("40");
        sizes.add("45");
        return sizes;
    }

    @GetMapping("/formEmail")
    public ModelAndView moveFormEmailPage() {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("languages", languages());
        modelAndView.addObject("sizes", sizes());
        modelAndView.addObject("configEmail", new ConfigEmail());
        return modelAndView;
    }
    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute ConfigEmail configEmail){
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("settingEmail", configEmail);
        return modelAndView;
    }
}