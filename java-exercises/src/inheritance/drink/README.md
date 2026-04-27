# 상속(Inheritance) 연습

## 📌 문제

상속을 이용하여 `Drink`, `Alcohol` 클래스를 구현한다.

## ⚙️ 요구사항

- Drink: 상품 정보, 생성자, 금액 계산 및 출력 메서드
- Alcohol: Drink 상속, 도수 필드 추가, 메서드 오버라이딩

## 📁 패키지 구조

- `inheritance.drink`
    - 상속을 이용한 기본 문제 구현

- `inheritance.drink.refactored`
    - 예외 처리를 적용하여 개선한 코드

## 🔧 리팩토링 (예외 처리)

객체 생성 시 잘못된 데이터가 전달되는 것을 방지하기 위해 예외 처리를 추가

- 생성자에서 `IllegalArgumentException`을 발생시키도록 구현
- 유효하지 않은 값이 전달될 경우 객체 생성이 중단됨
- 발생한 예외는 호출한 `main` 메서드로 전달됨
- `main` 메서드에서 `try-catch`를 사용하여 예외를 처리하고 에러 메시지를 출력

이를 통해 프로그램의 안정성을 높이고, 잘못된 입력에 대한 방어 로직을 구현한다.

## 🔗 코드

### 기본 구현
- [실행 클래스 (main)](Prob.java)
- [Drink](Drink.java)
- [Alcohol](Alcohol.java)

### 예외 처리 적용
- [실행 클래스 (main)](refactored/Prob.java)
- [Drink](refactored/Drink.java)
- [Alcohol](refactored/Alcohol.java)
