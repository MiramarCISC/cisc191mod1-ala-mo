package edu.sdccd.cisc191;

/**
 * Module 1 - Part B
 * Student data model with validation.
 */
public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    /**
     * Validation rules:
     * - name must not be null or blank
     * - gpa must be in [0.0, 4.0]
     * - id must be > 0
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Student(String name, double gpa, int id) {
        // validate and assign fields
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        if (name == null || gpa < 0.0 || gpa > 4.0 || id < 0) {
            throw new IllegalArgumentException("Not a valid input!");
        }
    }

    public String getName() { // retrieve name
        return name;
    }

    public double getGpa() { // retrieve gpa
        return gpa;
    }

    public int getId() { // retrieve id
        return id;
    }

    @Override
    public String toString() {
        // return readable summary, e.g. "Student{id=..., name='...', gpa=...}"
        return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }
}
