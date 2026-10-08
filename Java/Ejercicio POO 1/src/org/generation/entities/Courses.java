package org.generation.entities;

import java.util.ArrayList;

public class Courses {

    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    // ====== Constructor ======
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName.toUpperCase();
        this.professorName = professorName.toUpperCase();
        this.year = year;
        this.students = new ArrayList<>();
    }

    // ====== Inscribir un estudiante ======
    public void enroll(Student student) {
        this.students.add(student);
    }

    // ====== Inscribir un arreglo de estudiantes (sobrecarga) ======
    public void enroll(Student[] students) {
        for (Student student : students) {
            this.enroll(student);
        }
    }

    // ====== Dar de baja a un estudiante ======
    public void unEnroll(Student student) {
        if (this.students.remove(student)) {
            System.out.println("Estudiante eliminado: " + student.firstName + " " + student.lastName);
        } else {
            System.out.println("El estudiante no está inscrito en este curso.");
        }
    }

    // ====== Contar estudiantes ======
    public int countStudents() {
        return this.students.size();
    }

    // ====== Mejor calificación ======
    public int bestGrade() {
        int max = 0;
        for (Student student : this.students) {
            if (student.grade > max) {
                max = student.grade;
            }
        }
        return max;
    }

    // ====== Reto 1: promedio del curso ======
    public double average() {
        if (students.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Student student : students) {
            sum += student.grade;
        }

        return (double) sum / students.size();
    }

    // ====== Reto 2: ranking de estudiantes por calificación ======
    public void ranking() {
        ArrayList<Student> sortedStudents = new ArrayList<>(students);

        // Orden descendente por calificación
        sortedStudents.sort((a, b) -> Integer.compare(b.grade, a.grade));

        System.out.println("\nRanking del curso: " + courseName);

        int position = 1;
        for (Student student : sortedStudents) {
            System.out.printf(
                    "%d. %s %s - Calificación: %d%n",
                    position++,
                    student.firstName,
                    student.lastName,
                    student.grade
            );
        }
    }

    // ====== Reto 3: ¿cada estudiante está sobre el promedio? ======
    public void isAboveAverage() {
        double avg = average();

        System.out.println("\nPromedio del curso: " + avg);

        for (Student student : students) {
            String status = student.grade > avg ? "POR ENCIMA" : "NO ESTÁ POR ENCIMA";

            System.out.printf(
                    "%s %s - Calificación: %d - %s del promedio%n",
                    student.firstName,
                    student.lastName,
                    student.grade,
                    status
            );
        }
    }

    // ====== toString ======
    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }
}
