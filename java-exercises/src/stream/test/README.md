# Stream API 연습

## 📌 개요

Java Stream API의 기본 흐름(생성 → 중간 연산 → 최종 연산)을 주문/상품 도메인 예제로 실습하는 문제 모음입니다.  
`Todo` 형식의 단계별 과제를 통해 필터링, 매핑, 정렬, 매칭, 집계 연산을 익히도록 구성되어 있습니다.

---

## 🎯 학습 목표

- 스트림 생성 방식(`stream`, `parallelStream`, 배열/파일 기반 생성) 이해
- 중간 연산(`filter`, `map`, `flatMap`, `sorted`, `peek`) 활용
- 최종 연산(`forEach`, `count`, `sum`, `average`, `max`, `min`, `findFirst`, `allMatch`, `anyMatch`, `noneMatch`) 적용
- 도메인 객체(`Order`, `Product`)를 이용한 실전형 파이프라인 구성
- 병렬 처리 시 실행 스레드/순서 특성 이해

---

## 📁 패키지 구조

- `stream.test`
  - Stream API 실습 문제 10개 (`Ex01` ~ `Ex10`)
- `stream.test.common`
  - 공통 도메인 클래스 (`Order`, `Product`)
- `stream.test.resources`
  - 파일 기반 스트림 실습용 데이터 (`products.csv`)

---

## 🧩 문제 목록

| 번호 | 파일명 | 주제 |
| --- | --- | --- |
| 01 | `Ex01_StreamBasicTodo.java` | 스트림 생성 및 `forEach` 기본 출력 |
| 02 | `Ex02_InternalIteratorTodo.java` | 내부 반복자와 병렬 스트림(`parallelStream`) |
| 03 | `Ex03_PipelineTodo.java` | 필터링 + 매핑 + 평균 집계 파이프라인 |
| 04 | `Ex04_StreamSourceTodo.java` | 컬렉션/배열/범위/파일 기반 스트림 소스 |
| 05 | `Ex05_FilteringTodo.java` | `filter`, `distinct`를 이용한 조건 추출 |
| 06 | `Ex06_MappingTodo.java` | `map`, `mapToInt`, `flatMap` 변환 |
| 07 | `Ex07_SortingTodo.java` | `sorted`, `Comparator`, 다중 정렬 조건 |
| 08 | `Ex08_LoopingTodo.java` | `peek` 처리 로그와 `forEach` 최종 순회 |
| 09 | `Ex09_MatchingTodo.java` | `allMatch`, `anyMatch`, `noneMatch` 조건 검사 |
| 10 | `Ex10_BasicAggregateTodo.java` | `count/sum/avg/max/min/findFirst` 집계 |
