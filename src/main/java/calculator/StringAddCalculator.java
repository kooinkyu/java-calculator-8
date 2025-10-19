package calculator;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // 윈도우 개행 및 이스케이프된 \n 모두 처리
        input = input.replace("\\n", "\n").replace("\r\n", "\n");

        String delimiter = ",|:";

        // 커스텀 구분자 처리: 문자열이 // 로 시작
        if (input.startsWith("//")) {
            int index = input.indexOf("\n");
            if (index == -1) {
                throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
            }
            delimiter = input.substring(2, index); // 한 글자 구분자
            input = input.substring(index + 1);    // 숫자만 남김
        }

        String[] tokens = input.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            sum += toPositiveNumber(token);
        }
        return sum;
    }

    // 다음 커밋에서 사용 예정
    private static int toPositiveNumber(String text) {
        int number = Integer.parseInt(text);
        if (number < 0) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
        }
        return number;
    }
}
