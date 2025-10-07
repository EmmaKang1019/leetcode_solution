package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        // declare List for answer;
        List<List<Integer>> res = new ArrayList<>();
        // the first row is always one;
        res.add(List.of(1));
        // iterate one less than numRows times since first row is one;
        for(int i = 0 ; i < numRows-1 ; i++){
            // declare dummy list for setting easily
            List<Integer> dummy = new ArrayList<>();
            // the size of dummy always 2 bigger than prev row
            // so add 0 at first and last elements, and duplicate res.
            dummy.add(0);
            // res size -1 means last index of res so that means prev row since index start with 0
            dummy.addAll(res.get(res.size()-1));
            dummy.add(0);

            // iterate dummy row to add adjacent numbers
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j< dummy.size()-1; j++){
                row.add(dummy.get(j) + dummy.get(j+1) );
            }
            res.add(row);
        }
        return res;

    }
}
