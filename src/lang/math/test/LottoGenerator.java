package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;
        while (count < 6) {
            // 1 ~ 45 사이의 숫자 생성
            int num = rand.nextInt(45) + 1;
            // 중복 되지 않은 경우에만 배열에 추가
            if(isUnique(num)) {
                lottoNumbers[count] = num;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if(number == lottoNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}
