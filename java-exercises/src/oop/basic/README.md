# OOP Basic 연습

## 📌 개요
객체 지향 프로그래밍의 기본 개념을 바탕으로 **클래스 설계**, **캡슐화**, **메서드 구현**을 연습한다.

---

## 📁 패키지 구조

- `oop.basic.account`
- `oop.basic.book`
- `oop.basic.student`
- `oop.basic.tv`

---

## 🧩 문제 1. TV

### 📌 설명
Tv 클래스를 구현하여 전원, 채널 기능을 동작하도록 한다.

### ⚙️ 요구사항
- 필드: color, power, channel
- 생성자에서 기본값 설정
- 전원 on/off 기능
- 채널 증가/감소 기능
- 상태 출력 메서드 구현

### 🔗 코드
- [실행 클래스 (main)](tv/Prob.java)
- [Tv](tv/Tv.java)

---

## 🧩 문제 2. Book

### 📌 설명
Book과 BookMgr 클래스를 구현하여 책 목록과 총 가격을 관리한다.

### ⚙️ 요구사항
- Book: title, price (private)
- getter/setter 구현
- BookMgr:
    - 책 목록 배열 관리
    - 목록 출력
    - 총 가격 계산

### 🔗 코드
- [실행 클래스 (main)](book/Prob.java)
- [Book](book/Book.java)
- [BookMgr](book/BookMgr.java)

---

## 🧩 문제 3. Account

### 📌 설명
Account와 CheckingAccount 클래스를 구현하여 계좌 기능을 처리한다.

### ⚙️ 요구사항
- 캡슐화 적용 (private + getter/setter)
- 입금/출금 기능
- 카드 결제(pay) 기능 구현
- 조건 불만족 시 예외 메시지 출력

### 🔗 코드
- [실행 클래스 (main)](account/TestAccount.java)
- [Account](account/Account.java)
- [CheckingAccount](account/CheckingAccount.java)

---

## 🧩 문제 4. Student

### 📌 설명
Student 클래스를 구현하여 교육비와 환급금을 계산한다.

### ⚙️ 요구사항
- 필드: name, subject, fee, returnFee
- 환급금 계산 메서드
    - javaprogram → 25%
    - jspprogram → 20%
    - 그 외 → 메시지 출력
- 정보 출력 메서드

### 🔗 코드
- [실행 클래스 (main)](student/Prob.java)
- [Student](student/Student.java)

---

## 💡 핵심 개념

- 클래스 설계
- 캡슐화 (Encapsulation)
- 생성자
- 메서드 분리
- 조건문 활용