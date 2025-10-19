# java-calculator-구현


## ✏️ 구현할 기능 목록
- [ ] 빈 문자열 입력 시 0 반환
- [ ] 쉼표(,) 또는 콜론(:) 기준으로 숫자 분리 후 합계 계산
- [ ] 커스텀 구분자("//[구분자]\\n") 지원 
    - ex) //;\n1;2;3 → 결과: 6
- [ ] 잘못된 입력 시 IllegalArgumentException 발생
- [ ] 합산 결과를 "결과 : X" 형식으로 출력
- [ ] 입력 검증: 음수 입력, 잘못된 형식

## 🔧 구현 구조

| 클래스명 | 메서드명 | 기능 | 설명 |
|-----------|-----------|------|------|
| `StringAddCalculator` | `splitAndSum(String input)` | 문자열 파싱 및 합산 | 입력 문자열을 구분자 기준으로 분리하고 숫자 합계를 계산 |
| `StringAddCalculator` | `toPositiveNumber(String text)` | 입력값 검증 | 문자열을 정수로 변환하며, 음수 입력 시 예외 발생 |
| `Application` | `main(String[] args)` | 실행 진입점 | 사용자 입력을 받고 계산 결과를 출력 |