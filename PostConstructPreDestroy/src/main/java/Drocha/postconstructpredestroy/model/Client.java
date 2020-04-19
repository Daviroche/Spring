package Drocha.postconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Davirocha
 * @since 15/04/2020
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public  Client() {
        System.out.println("Client class!");
    }
}
