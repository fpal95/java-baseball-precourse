package baseball;

import java.util.ArrayList;
import java.util.List;
import nextstep.utils.Console;

public class Player {
    public List<Integer> playernum(){
        // 사용자 숫자 생성
        System.out.println("숫자를 입력해 주세요 : ");
        List<Integer> playernum = new ArrayList<>();
        String input = Console.readLine();
        IsWrong(input);

        for(String number: input.split("")){
            playernum.add(Integer.parseInt(number));
        }
        return playernum;
    }

    public void IsWrong(String input){
        if(input.length() != 3){
            throw new IllegalArgumentException("세 자리 수를 입력해주세요.");
        }
    }
}