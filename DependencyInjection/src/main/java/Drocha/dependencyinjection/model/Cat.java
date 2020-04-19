package Drocha.dependencyinjection.model;

import Drocha.dependencyinjection.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Davirocha
 * @since 16/04/2020
 * @version 1.0
 */
@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("MEAAAAAAAAAAAAUUUUUUUUUUUUUU");
    }
}
