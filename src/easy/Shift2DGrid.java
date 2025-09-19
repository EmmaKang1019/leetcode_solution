package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 나머지연산 modulus 연산을 하면 항상 0< <n 의 결과가 나옴
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int rows = grid.length;
       int colums = grid[0].length;
       int totalNums = rows*colums;

       k = k%totalNums;// 배열을 배열의 사이즈만큼 회전하면, 다시 제자리로 돌아오니까 over해서 연산하지않도록 나머지연산자 처리.
       List<List<Integer>> list = new ArrayList<>();
       for(int i = 0; i< rows; i++){
           list.add(new ArrayList<>());
       }
       for(int i = 0; i<totalNums; i++){
           int idx = (totalNums - k +i) %totalNums;
           list.get(i/colums).add(grid[idx/colums][idx%colums]);
       }
       return list;
    }
}
