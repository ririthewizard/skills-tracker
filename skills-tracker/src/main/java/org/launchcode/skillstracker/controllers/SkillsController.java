package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping("")
    @ResponseBody
    public String startSkills(){

        return "<h1>Skills Tracker</h1>" +
                "<h2>Here are some skills to learn</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>C++</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String formSkills(){

        return "<form method='post' action='/form'>" +
                "<input type='text' name='userName'> Name</input><br />" +
                "<select name='moose'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br />" +
                "<select name='secondMoose'>" +
                "<option value='JavaScript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br />" +
                "<select name = 'kwct5'>" +
                "<option value='JavaScript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +

                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String namePage(@RequestParam String userName, String moose, String secondMoose, String kwct5){
        return "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + moose + "</li>" +
                "<li>" + secondMoose + "</li>" +
                "<li>" + kwct5 + "</li>" +
                "</ol>";
    }
}
