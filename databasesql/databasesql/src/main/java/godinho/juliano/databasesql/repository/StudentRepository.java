package godinho.juliano.databasesql.repository;

import godinho.juliano.databasesql.model.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> { //retorno long

}
