
package wildCard;

import java.util.List;

public class WildCardFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}
