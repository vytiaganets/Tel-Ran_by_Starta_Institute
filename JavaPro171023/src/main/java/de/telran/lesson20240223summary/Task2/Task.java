package de.telran.lesson20240223summary.Task2;

import java.util.Iterator;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<List<String>> lists = List.of(
                List.of("a", "c", "d"),
                List.of(),
                List.of("E", "F", "J", "Q", "I"),
                List.of("K", "L", "M"),
                List.of("N", "O", "P", "H"),
                List.of("R", "S")
        );
        Iterator<String> iterator = getIterator(lists);
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
    }
    public static <T> Iterator<T> getIterator(List<List<T>> list) {
        return new Iterator<T>(){
            int listIndex = 0;
            int index = 0;
            @Override
            public boolean hasNext() {
                if (listIndex < list.size()){
                    if (index < list.get(listIndex).size()) {//size()-1 ??? || list.isEmpty()
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                T result = list.get(listIndex).get(index);
                if(list.get(listIndex).size() == index+1){
                    index = 0;
                    listIndex++;
                } else {
                    index++;
                }
                return result;
            }
        };
    }
}
