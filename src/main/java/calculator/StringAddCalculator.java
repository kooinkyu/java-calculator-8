package calculator;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // 기본 구분자: 쉼표 또는 콜론
        String delimiter = ",|:";

        // 아직 커스텀 구분자 X (다음 단계)
        String[] tokens = input.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            sum += toPositiveNumber(token);
        }
        return sum;
    }


    // 다음 커밋에서 사용 예정
    private static int toPositiveNumber(String text) {
        return Integer.parseInt(text);
    }
}
