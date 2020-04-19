package Drocha.scope.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Davirocha
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Scope
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC!");
    }
}
