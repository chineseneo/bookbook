package com.longkai.bookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookViewerController {

    @RequestMapping("/books")
    public ModelAndView showBooks() {
        return new ModelAndView("books", "books", "books");
    }
}
