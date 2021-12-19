package com.cuatroa.retocuatro;

import com.cuatroa.retocuatro.repository.OrderRepository;
import com.cuatroa.retocuatro.repository.UserRepository;
import com.cuatroa.retocuatro.repository.crud.SupplementsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.cuatroa.retocuatro.repository.crud.OrderCrudRepository;
import com.cuatroa.retocuatro.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class RetodosApplication implements CommandLineRunner {

    @Autowired
    private SupplementsCrudRepository crudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RetodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();

//        crudRepository.saveAll(List.of(
//                new Fragance("AP-903", "DIOR", "CATEGORIA 1", "PRESENTACION 1", "FRUTOS, MADERA Y CANELA. ALTA CALIDAD, A PRECIO JUSTO", true, 300000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Fragance("AP-904", "VERSAGE", "CATEGORIA 2", "PRESENTACION 1", "CITRICOS, MADERA. PRECIO JUSTO", true, 600000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg")
//        ));
//
//        userCrudRepository.saveAll(List.of(
//                new User(1, "46669989", "BLODY MARRY", ft.parse("1996-11-15"), "11", "CR 34-45", "3174565625", "stellez@gmail.com", "Demo123.", "ZONA 2", "ASE"),
//                new User(2, "52369563", "JUANA DE ARCO", ft.parse("1987-05-15"), "05", "CR 34-45", "3265632", "jdarco@gmail.com", "Demo123.", "ZONA 2", "ASE")
//        ));

    }
}
