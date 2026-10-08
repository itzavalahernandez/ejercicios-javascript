package org.generation.entities;

import java.util.Objects;

public class Student {

    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // ====== Constructores ======
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration, int grade) {
        this(firstName, lastName, registration, grade, 1);
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 2026, 0, 1);
    }

    // ====== Métodos ======
    public void printFullName() {
        System.out.println("First name: " + this.firstName + ", Last name: " + this.lastName);
    }

    public boolean isApproved() {
        if (this.grade < 60) {
            return false;
        }
        return true;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            this.year += 1;
            System.out.println("Congratulations. Promoted to year: " + this.year);
        } else {
            System.out.println("Better luck next time.");
        }
        return this.year;
    }

    // ====== equals y hashCode (necesarios para unEnroll) ======
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;

        return registration == other.registration
                && grade == other.grade
                && year == other.year
                && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, registration, grade, year);
    }

    // ====== toString ======
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }
}
