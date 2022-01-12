package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        GenerateNum random = new GenerateNum();
        Player player = new Player();
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
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            again = playagain.playagain();
        }
        System.out.println("게임이 종료되었습니다");
    }
}
