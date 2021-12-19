package com.cuatroa.retocuatro.repository.crud;

import com.cuatroa.retocuatro.model.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author shania vargas
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    List<User> findBybirthtDay(Date date);
    Optional <User> findByEmailAndPassword(String email,String password);
    
    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
