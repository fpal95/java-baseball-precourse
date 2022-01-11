package baseball;

import java.util.ArrayList;
import java.util.List;
import nextstep.utils.Randoms;

public class GenerateNum {
    public List<Integer> create(){
        // 컴퓨터 숫자 생성
        List<Integer> computernum = new ArrayList<>();
        while (computernum.size() < 3){
            int randomnum = Randoms.pickNumberInRange(1,9);
            if (computernum.contains(randomnum)) {
                continue;
            }
            else {
                computernum.add(randomnum);
            }
        }
        return computernum;
    }

}