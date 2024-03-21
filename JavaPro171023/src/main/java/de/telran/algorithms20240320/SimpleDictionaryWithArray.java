package de.telran.algorithms20240320;

public class SimpleDictionaryWithArray {
    public static void main(String[] args) {
        buildDictionaryWithArray("Build a frequency dictionary of letters of the Russian (or English) alphabet.");
        //a = 5
        //b = 2
        //c = 2
        //d = 2
        //e = 7
        //f = 3
        //g = 1
        //h = 3
        //i = 5
        //j = 0
        //k = 0
        //l = 4
        //m = 0
        //n = 4
        //o = 4
        //p = 1
        //q = 1
        //r = 5
        //s = 4
        //t = 5
        //u = 3
        //v = 0
        //w = 0
        //x = 0
        //y = 2
        //z = 0
    }
    static void buildDictionaryWithArray(String text){
        text = text.toLowerCase();

        int[] result = new int['z' - 'a' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                result[ch - 'a']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }
}
