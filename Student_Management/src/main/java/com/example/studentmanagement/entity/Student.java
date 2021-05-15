package com.example.studentmanagement.entity;

/*@Entity(name = "Student")
@Table(name = "student")*/
public class Student {

    /* @Id
     @Column(name = "student_id", unique = true)*/
    private int studentId;

    //@Column(name = "name", length = 30, nullable = false)
    private String name;

    //@Column(name = "class", length = 1, nullable = false)
    private char clas;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getClas() {
        return clas;
    }

    public void setClas(char clas) {
        this.clas = clas;
    }
}
