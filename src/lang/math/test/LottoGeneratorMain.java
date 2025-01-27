package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lotto  = new LottoGenerator();
        int[] nums = lotto.generate();;

        System.out.print("로또 번호 : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
