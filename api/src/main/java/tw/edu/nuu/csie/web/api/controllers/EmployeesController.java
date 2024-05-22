package tw.edu.nuu.csie.web.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tw.edu.nuu.csie.web.api.entities.employees;
import tw.edu.nuu.csie.web.api.repositories.EmployeesRepository;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping()
    public List<employees> findAllBook(){ return employeesRepository.findAll();}
/*
    @GetMapping("title/{title}")
    public  List<BookLibrary> findBookByTitle(@PathVariable String title){
        return bookLibraryRepository.findByTitleContaining(title);
    }

    @GetMapping("Id/{Id}")
    public List<BookLibrary> findBookById(@PathVariable String Id){
        return bookLibraryRepository.findById(Id);
    }

    @PostMapping
    public Cargo create(@RequestBody BookLibrary bookLibrary){

        Cargo cargo =new Cargo();

        BookLibrary createBook = new BookLibrary();
        createBook.setTitle(bookLibrary.getTitle());
        createBook.setAuthor(bookLibrary.getAuthor());
        createBook.setPublicationYear(LocalDateTime.now().getYear());
        createBook.setAvailable("OK");
        bookLibraryRepository.save(createBook);
        cargo.setReturnCode("000000");
        cargo.setReturnMessage("Success");

        return cargo;
    }

    @DeleteMapping("/{id}")
    public Cargo delete(@PathVariable Long id){
        Cargo cargo =new Cargo();
        Optional<BookLibrary> optionalBookLibrary = bookLibraryRepository.findById(id);
        if (optionalBookLibrary.isPresent()) {
            BookLibrary bookLibrary = optionalBookLibrary.get();
            bookLibraryRepository.delete(bookLibrary);
            cargo.setReturnCode("000000");
            cargo.setReturnMessage("Success");
            return cargo;
        }
        cargo.setReturnCode("111111");
        cargo.setReturnMessage("NotFoundTheId");
        return cargo;
    }

    @PutMapping("/borrow/{id}")
    public BookLibrary boUpdate(@PathVariable Long id) {
        Optional<BookLibrary> optionalBookLibrary = bookLibraryRepository.findById(id);
        if (optionalBookLibrary.isPresent()){
            BookLibrary bookLibrary = optionalBookLibrary.get();
            bookLibrary.setAvailable("NO");
            return bookLibraryRepository.save(bookLibrary);
        }
        return null;
    }
    @PutMapping("/return/{id}")
    public BookLibrary Reupdate(@PathVariable Long id) {
        Optional<BookLibrary> optionalBookLibrary = bookLibraryRepository.findById(id);
        if (optionalBookLibrary.isPresent()){
            BookLibrary bookLibrary = optionalBookLibrary.get();
            bookLibrary.setAvailable("OK");
            return bookLibraryRepository.save(bookLibrary);
        }
        return null;
    }

 */
}
