package br.org.school.gateway.http;

import br.org.school.domain.student.CPF;
import br.org.school.domain.student.Student;
import br.org.school.domain.student.StudentFactory;
import br.org.school.usecase.StudentUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class SchoolController {

    private StudentUsecase studentUsecase;

    public SchoolController(StudentUsecase studentUsecase) {
        this.studentUsecase = studentUsecase;
    }

    @GetMapping(value = "students")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent(){
        return studentUsecase.getStudentList();
    }

    @GetMapping(value = "students/{documentNumber}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Student getSingleStudent(@PathVariable String documentNumber){
        CPF cpf = new CPF(documentNumber);
        return studentUsecase.getSingleStudent(cpf);
    }

    @PostMapping(value = "students")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Student createNewStudent(){
        Student student = new StudentFactory()
                .withNameCpfEmail("Caio", "315.789.758-63", "new@gmail.com")
                .withPhone("11", "123456789").build();
        return studentUsecase.createStudent(student);

    }


}
