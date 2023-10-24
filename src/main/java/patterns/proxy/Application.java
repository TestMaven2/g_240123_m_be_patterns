package patterns.proxy;

public class Application {

    private StudentService service;

    public Application(StudentService service) {
        this.service = service;
    }

    public void start() {
        System.out.println(service.getAllStudents());
        System.out.println(service.getStudentById(1));
        System.out.println(service.getStudentById(2));
        System.out.println(service.getStudentById(3));
        System.out.println(service.getStudentById(4));
        System.out.println(service.getStudentById(5));
    }
}