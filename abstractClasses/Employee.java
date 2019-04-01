
package abstractClasses;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee> {
    private double salay;
    private LocalDate hireDay;

    public Employee(String name, double salay, int year, int month, int day) {
        super(name);
        this.salay = salay;
        hireDay = LocalDate.of(year, month, day);
    }

    

    /**
     * @return double return the salay
     */
    public double getSalay() {
        return salay;
    }

    /**
     * @return LocalDate return the hireDay
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salay of $%.2f", salay);
    }

    public void raiseSalay(double byPercent) {
        double raise = salay * byPercent / 100;
        salay += raise;
    }

    public boolean equals(Object otherObject) {
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(getName(), other.getName())
                && salay == other.salay
                && Objects.equals(hireDay, other.hireDay);
    }

    public int compareTo(Employee other) {
        return Double.compare(salay, other.salay);
    }
}
