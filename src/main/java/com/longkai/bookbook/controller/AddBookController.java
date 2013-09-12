package com.longkai.bookbook.controller;

import com.longkai.bookbook.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddBookController {

    @RequestMapping(value = "addBook", method = RequestMethod.GET)
    public ModelAndView showAddBookPage() {
        return new ModelAndView("add_book", "book", new Book());
    }

    @RequestMapping(value = "addBook", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book, ModelMap model) {
        model.addAttribute("bookName", book.getBookName());
        model.addAttribute("author", book.getAuthor());
        model.addAttribute("price", book.getPrice());
        return "book_added";
    }
}
