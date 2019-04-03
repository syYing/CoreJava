
package Generic;

interface Comparable<T> {
    public int compareTo(T o);
}

public class Box<T> {

    private T t;

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if(e.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * @return T return the t
     */
    public T getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(T t) {
        this.t = t;
    }

}
