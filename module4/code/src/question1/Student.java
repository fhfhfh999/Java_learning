package question1;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -4784382821484710330L;
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) throws StudentsAgeException, StudentsIdException {
        setId(id);
        setName(name);
        setAge(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getAge() != student.getAge()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws StudentsIdException{
        if (id > 0 && id < 10000) {
            this.id = id;
        }else {
            throw new StudentsIdException("学号不合理");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws StudentsAgeException {
        if(age > 0 && age < 150){
            this.age = age;
        }else {
            throw new StudentsAgeException("年龄不合理");
        }

    }

    @Override
    public String toString() {
        return  "\n学号 ：" + id +
                "  姓名 ：" + name +
                "  年龄：" + age;
    }
}
