
package wildCard;

import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private int i;

    public NaturalNumber(int i) {
        this.i = i;
    }
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) {
        super(i);
    }
}

public class Guideline {

    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
        //ln.add(new EvenNumber(3));
    }
}
