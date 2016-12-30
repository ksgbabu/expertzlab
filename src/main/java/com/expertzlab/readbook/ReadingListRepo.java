package com.expertzlab.readbook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * Created by gireeshbabu on 13/12/16.
 */
public interface ReadingListRepo extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
