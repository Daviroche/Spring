package rocha.davi.exemplo2mysql.repository;

import rocha.davi.exemplo2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ClientRepository extends CrudRepository<ClientEntity, long> {

}
