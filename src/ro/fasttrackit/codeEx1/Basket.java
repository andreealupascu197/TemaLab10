package ro.fasttrackit.codeEx1;

import java.util.*;

public class Basket {
    private List<String> fruitList = new ArrayList<>();

    public boolean find(String fruitToFind) {
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruitToFind.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String fruit) {
        if (find(fruit) == true  ) {
            fruitList.remove(fruit);
            return true;
        } else {
            return false;
        }
    }

    public int position(String fruit) {
        int position = 0;
        while (position < fruitList.size()) {
            if (fruit.equals(fruitList.get(position))) {
                return position;
            }
            position++;
        }
        return -1;
    }

    public Collection<String> distinct() {
        return new HashSet<>(fruitList);
    }

    public void add(String fruit) {
        fruitList.add(fruit);
    }

    public int count() {
        return fruitList.size();
    }

    public int customCount() {
        int customCount = 0;
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            customCount++;
        }
        return customCount;
    }

}
