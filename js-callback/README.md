# JavaScript Callback Practice

## 📌 개요

콜백 함수는 함수의 인자로 전달되어 특정 시점에 실행되는 함수입니다.

## 🛠 공통 고차 함수

```js
function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}
```

- n: 반복 횟수
- f: 실행할 콜백 함수

## 📁 문제 목록

| 번호 | 파일명                   | 설명               |
| ---- | ------------------------ | ------------------ |
| 01   | print-all-numbers        | 모든 숫자 출력     |
| 02   | print-even-numbers       | 짝수만 출력        |
| 03   | print-odd-numbers        | 홀수만 출력        |
| 04   | print-square             | 제곱 출력          |
| 05   | print-number-and-string  | 숫자 + 문자열 출력 |
| 06   | print-multiples-of-three | 3의 배수 출력      |
| 07   | print-double             | 숫자 두 배 출력    |
| 08   | print-stars              | 별 출력            |
| 09   | save-to-array            | 배열 저장          |
| 10   | cumulative-sum           | 누적 합 계산       |
