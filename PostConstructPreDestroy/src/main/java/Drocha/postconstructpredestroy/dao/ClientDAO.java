package Drocha.postconstructpredestroy.dao;

import Drocha.postconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Davirocha
 * @since 15/04/2020
 * @version 1.0000000000000000000000000000000000000000000
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() {
        System.out.println("Object created!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("finished object!");
    }
}
