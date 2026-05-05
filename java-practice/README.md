# Java Practice

KB IT's Your Life 과정에서 제공된 Java 기본/심화 예제를 챕터별로 정리한 실습 공간입니다.  
객체지향 기초부터 제네릭, 컬렉션, 람다, 스트림까지 학습 흐름에 맞춰 패키지 단위로 구성되어 있습니다.

## 📌 개요

- 교재형 구조(`chXX.secYY.examZZ`)를 따라 예제를 단계적으로 학습
- 각 폴더에 `Example` 실행 클래스와 보조 클래스가 함께 포함
- 개념 확인용 소규모 코드가 중심이라 빠르게 실행/비교 학습 가능

## 🎯 학습 목표

- 클래스/상속/인터페이스 등 객체지향 핵심 개념 정리
- 예외 처리와 제네릭, 컬렉션 프레임워크 활용 능력 강화
- 람다식, 함수형 인터페이스, Stream API 파이프라인 실습
- 패키지 구조를 기준으로 코드를 탐색하고 실행하는 습관 형성

## 📁 챕터 구성

- `ch06`: 클래스, 필드/메서드, 생성자, 접근 제어자, 정적 멤버
- `ch07`: 상속, 메서드 재정의, 다형성, 추상 클래스
- `ch08`: 인터페이스, 구현/상속, 타입 변환, `instanceof`
- `ch11`: 예외 처리(`try-catch`, `throws`, `try-with-resources`)
- `ch13`: 제네릭 타입/메서드, 제한된 타입 파라미터
- `ch15`: 컬렉션(List/Set/Map), 비교(`Comparable`/`Comparator`), Stack/Queue
- `ch16`: 람다식과 함수형 인터페이스 활용
- `ch17`: Stream 생성/가공/정렬/집계/Optional

## ▶️ 실행 방법

빌드 도구(Maven/Gradle) 없이 소스 실행 중심으로 구성되어 있습니다.

1. IDE(IntelliJ/Eclipse)에서 `java-practice` 폴더를 프로젝트로 엽니다.
2. 실행하려는 패키지의 `*Example.java` 파일을 선택합니다.
3. `main` 메서드를 실행해 결과를 확인합니다.

예시 실행 파일:

- `src/ch06/sec08/exam04/CalculatorExample.java`
- `src/ch07/sec08/exam02/DriverExample.java`
- `src/ch08/sec04/RemoteControlExample.java`
- `src/ch15/sec06/exam01/StackExample.java`
- `src/ch16/sec03/LambdaExample.java`
- `src/ch17/sec03/StreamPipeLineExample.java`
