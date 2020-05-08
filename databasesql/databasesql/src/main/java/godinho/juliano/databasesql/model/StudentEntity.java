package godinho.juliano.databasesql.model;

import lombok.*;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Component
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java Persistence API
@Entity
@Table(name= "aluno")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private long id;

    @Column(name = "fist_name")
    private String fist_name;

    @Column(name = "nota")
    private float nota;

    @Column(name = "rg")
    private String rg;

}
