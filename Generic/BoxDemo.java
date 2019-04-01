
package Generic;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {

    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.setT(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int count = 0;
        for (Box<U> box : boxes) {
            U boxContents = box.getT();
            System.out.println("Box #" + count + " contains [" +
                boxContents.toString() + ']');
            count++;
        }
    }

    public static void main(String[] args) {
        List<Box<Integer>> boxes = new ArrayList<>();
        addBox(Integer.valueOf(10), boxes);
        addBox(Integer.valueOf(20), boxes);
        outputBoxes(boxes);
    }
}
