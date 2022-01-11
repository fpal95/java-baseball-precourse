package baseball;

import java.util.List;

public class Compare {
    public int countStrike(List<Integer> computer, List<Integer> player){
        //스트라이크 개수 세기
        int strike = 0;
        for(int i=0; i < player.size(); i++){
            if(computer.get(i).equals(player.get(i))){
                strike += 1;
            }
        }
        return strike;
    }

    public int howmany(List<Integer> computer, List<Integer> player){
        int result = 0;
        for(int i=0; i < player.size(); i++){
            if(computer.contains(player.get(i))){
                result += 1;
            }
        }
        return result;
    }

}