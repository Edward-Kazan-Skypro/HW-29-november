package me.about.aboutmeweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String startPage(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String infoPage(){
        String name = "Мухаметзянов Эдуард";
        String project = "AboutMeWEB";
        String dateProject = "29 ноября 2022 года";
        String aboutProject = "Учебный проект AboutMeWEB создан для понимания" +
                " как создавать и как работает простое WEB приложение." +
                " Проект реализован с помощью  инструмента для автоматизации" +
                " сборки проектов Maven," +
                " веб-сервера TomCat и" +
                "фреймворка Spring (SpringBoot)." +
                " Проект написан на языке Java.";
        return "Имя ученика: " + name +
                ", название проекта:" + project +
                ", дата создания проекта: " + dateProject +
                "описание проекта:" + aboutProject;
    }
}
