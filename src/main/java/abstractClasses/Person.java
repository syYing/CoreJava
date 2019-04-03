
package abstractClasses;

public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
}
