package com.bookstore.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.Book;
import com.bookstore.Repository.BookRepository;

@Service
public class BookServices {
	
	
@Autowired
private BookRepository bRepo;
public void save(Book b)
{
	
 bRepo.save(b);
}
public List<Book> getAllBook()
{
	return bRepo.findAll();
}
public Book getBookById(int id)
{
	return bRepo.findById(id).get();
}
public void deleteById(int id)
{
	bRepo.deleteById(id);
}
}