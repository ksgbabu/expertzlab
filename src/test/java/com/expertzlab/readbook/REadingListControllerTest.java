package com.expertzlab.readbook;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.util.Assert;

/**
 * Created by gireeshbabu on 13/12/16.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadingListControllerTest {


    private ReadingListController controller;
    private Book book = new Book();

    @Mock
    private Model model;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        Assert.notNull(controller);
        book.setAuthor("Gireesh");
        book.setIsbn("1234");
        book.setTitle("ABC");
        book.setReader("Jack");
    }

    @Test
    public void saveBook(){
        controller.addToReadingList("Raj",book);
    }

    @Test
    public void getBook(){

        controller.readersBook("Raj",model);
        Mockito.verify(model).addAttribute(Mockito.anyString(),Mockito.anyList());
    }

    @Autowired
    public void setController(ReadingListController controller) {
        this.controller = controller;
    }
}
