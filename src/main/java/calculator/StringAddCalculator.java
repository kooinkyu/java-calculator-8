package calculator;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        // 빈 문자열, null -> 0
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // 아직 나머지 기능은 구현하지 않음 (다음 커밋에서 추가)
        // 임시로 단일 숫자만 처리
        return Integer.parseInt(input);
    }

    // 다음 커밋에서 사용 예정
    private static int toPositiveNumber(String text) {
        return Integer.parseInt(text);
    }
}
