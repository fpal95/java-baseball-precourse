package baseball;
import nextstep.utils.Console;

public class Playagain {
    public boolean playagain(){
        System.out.println("경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
        Console console = new Console;
        char answer = console.readLine().charAt(0);
        if(answer=='1'){
            return true;
        }
        return false;
    }
}