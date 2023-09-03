package org.example.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping("/regin")
public class ReginTestController {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("/data0")
    public void data0(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

    }

    @RequestMapping("/data1")
    public void data1(Model model) {
        model.addAttribute("name", "aa");
    }

    @RequestMapping("/data2")
    public void data2(ModelMap model) {
        model.addAttribute("name", "aa");
    }

    @RequestMapping("/data3")
    public void data3(Map<String, Object> model) {
        model.put("name", "aa");
    }

    @RequestMapping("/data4")
    public ModelAndView data4() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("key", "value");
        mv.setViewName("view01");
        return mv;
    }
}
