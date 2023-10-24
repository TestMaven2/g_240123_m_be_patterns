package patterns.proxy;

import java.util.List;

public class CommonStudentService implements StudentService {

    @Override
    public List<Student> getAllStudents() {
        return RemoteService.getStudents();
    }

    @Override
    public Student getStudentById(int id) {
        List<Student> students = getAllStudents().stream()
                .filter(x -> x.getId() == id)
                .limit(1)
                .toList();
        return students.isEmpty() ? null : students.get(0);
    }
}