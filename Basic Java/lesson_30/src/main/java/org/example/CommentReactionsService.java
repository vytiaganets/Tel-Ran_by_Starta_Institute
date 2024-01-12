// commentReactionsService.java

package org.example;

import java.util.Locale;

public class CommentReactionsService {
    public int getReactions(String str) {
        int result = 0;
        String[] subStr = str.split(" ");
        for (String part: subStr){
            String s = part.toLowerCase(Locale.ROOT);
            if (s.equals("excellent") || s.equals("well") || s.equals("good")){
                result++;
            }
            else if (s.equals("terrible") || s.equals("awfully") || s.equals("badly")){
                result--;
            }
        }
        return result;
    }
}
//excellent well good
//terrible awfully badly



