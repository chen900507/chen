package tw.edu.nuu.csie.web.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.edu.nuu.csie.web.api.entities.employees;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<employees, Long> {
    //List<employees> findBookByTitle(String title);
    //List<employees> findByTitleContaining(String title);
    //List<employees> findById(String id);

}
