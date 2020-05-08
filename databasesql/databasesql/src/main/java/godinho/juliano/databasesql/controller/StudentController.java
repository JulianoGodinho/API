package godinho.juliano.databasesql.controller;

import godinho.juliano.databasesql.model.StudentEntity;
import godinho.juliano.databasesql.repository.StudentRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;  //cria uma variavel local

    //buscar no banco todos os alunos e retorna a lista
    @GetMapping
    public ResponseEntity<List<StudentEntity>>findAll() { //get
        return new ResponseEntity<List<StudentEntity>>((List<StudentEntity>)
        this.studentRepository.findAll(),new HttpHeaders(), HttpStatus.OK);
        // erro 404
    }//fecha metodo buscar todos

    //busca por id
    @GetMapping(path = "/{id}")
    public ResponseEntity<StudentEntity>findById(@PathVariable ("id") long id) {
        if(this.studentRepository.findById(id).isPresent()){
            return new ResponseEntity<StudentEntity>(
                    this.studentRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);

        }//fecha if
            return new ResponseEntity<StudentEntity>(HttpStatus.NOT_FOUND);

    }//fecha metodo buscar por id

    //criando metodo para cadastrar um objeto
    @PostMapping

    public ResponseEntity<StudentEntity> register (@RequestBody StudentEntity studentEntity) {
        return new ResponseEntity<StudentEntity> (
                this.studentRepository.save(studentEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);

    }//fecha metodo cadastro

    //metodo para atualizar alterar analisa se existe e depois salva
    @PutMapping(value = "/{id}")
    public ResponseEntity<StudentEntity> update (@PathVariable("id") long id,
                                                 @RequestBody StudentEntity studentEntity) throws Exception {

        if(id == 0 || !this.studentRepository.existsById(id)) {

        }//fecha o if
        return new ResponseEntity<StudentEntity>(
                this.studentRepository.save(studentEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }//fecha metodo alterar

    //criando o metodo para deletar
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<StudentEntity> delete (@PathVariable("id") long id) {
        this.studentRepository.deleteById(id);
        return new ResponseEntity<StudentEntity>(new HttpHeaders(),HttpStatus.OK);

    }//fecha metodo deletar
}//fecha classe
