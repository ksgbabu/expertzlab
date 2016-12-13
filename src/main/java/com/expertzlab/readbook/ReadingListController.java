package com.expertzlab.readbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by gireeshbabu on 13/12/16.
 */

@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepo repo;

    @Autowired
    public ReadingListController(ReadingListRepo repo){
        this.repo = repo;
    }

    @RequestMapping(value="/{reader}", method= RequestMethod.GET)
    public String readersBook(@PathVariable("reader") String reader, Model model){
        List<Book> bookList = repo.findByReader(reader);
        if(bookList != null){
            model.addAttribute("books",bookList);
        }
        return "readingList";
    }

    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
    public String addToReadingList(
            @PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        repo.save(book);
        return "redirect:/{reader}";
    }
}
