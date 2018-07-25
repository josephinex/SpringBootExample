package service;

import com.app.Main;
import com.app.entity.Student;
import com.app.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes= {Main.class, StudentService.class})
@RunWith(SpringRunner.class)
@TestPropertySource(locations={"classpath:test.properties"})
@DataJpaTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    @Rollback(false)
    public void saveStudentTest(){
        Student student = new Student("Josephine", "Java", 1L);
        studentService.saveToDb(student);
    }
}
