package de.telran.algorithms20240415;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelectionHome {
    public void selectActivityHome(List<ActivityHome> list) {
        list.sort(Comparator.comparingInt(ActivityHome::getPrice).thenComparing(ActivityHome::getFinish).thenComparing(ActivityHome::getStart));
        List<ActivityHome> res = new ArrayList<>();
        print(list);

        System.out.println("--------------------");

        ActivityHome last = list.get(list.size() - 1);
        int first = last.getStart();
        res.add(last);


        for (int i = list.size() - 2; i > -1; i--) {
            if (list.get(i).getFinish() <= first) {
                first = list.get(i).getStart();
                res.add(list.get(i));
            }
        }
        res.sort(Comparator.comparingInt(ActivityHome::getFinish));
        print(res);
    }

    private void print(List<ActivityHome> list) {
        for (ActivityHome e : list) {
            System.out.println(e.getName() + "  " + e.getStart() + " -> " + e.getFinish() + " -> price is: " + e.getPrice());
        }
    }
}