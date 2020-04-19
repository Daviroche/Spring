package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Davirocha
 * @since 15/04/2020
 * @version 1.0
 */

@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Connection JDBC!");
    }
}
