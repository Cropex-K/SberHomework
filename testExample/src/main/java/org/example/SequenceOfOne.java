package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class SequenceOfOne {

    public static int longestSequence (String sequence){
        if (sequence == null){
            throw new IllegalArgumentException("sequence can't be null");
        }

        if (sequence.isEmpty() || sequence.isBlank()){
            return 0;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,0);
        char[] seq = sequence.toCharArray();
        for (int i=0, y=0; i<seq.length;i++){
            if (Integer.parseInt(String.valueOf(seq[i]))==1){
                result.set(y,result.get(y)+1);
            }
            else {
                y++;
                result.add(y,0);
            }
        }
        return Collections.max(result);
    }


}
