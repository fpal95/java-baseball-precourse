package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        GenerateNum random = new GenerateNum();
        Input player = new Player();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        while (again){
            List<Integer> computer = random.create();
            List<Integer> playernum = player.playernum();
            String result = "";
            while (!result.equals("3스트라이크")){
                result = judge.statement(computer, playernum);
                System.out.println(result);
            }
            again = playagain.playagain();
        }
    }
}
