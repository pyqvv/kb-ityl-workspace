# 다형성(Polymorphism) 연습

## 📌 개요
부모 타입으로 다양한 객체를 참조하고,   
오버라이딩을 통해 실행 시점에 동작이 달라지는 다형성을 구현한다.

---

## 📁 패키지 구조

- `polymorphism.*`
    - 다형성 관련 문제 6개 구현

---

## 🧩 문제 목록

### 1. animal  
- 동물 이동 거리 계산 및 인터페이스 활용
- [🔗 코드](../src/polymorphism/animal)

### 2. coffeeshop  
- 음료 가격 계산 및 판매 관리
- [🔗 코드](../src/polymorphism/coffeeshop)

### 3. factory  
- 공장 생산량 계산 및 협력 로직 구현
- [🔗 코드](../src/polymorphism/factory)

### 4. shape  
- 도형 면적 계산 (추상 클래스 활용)
- [🔗 코드](../src/polymorphism/shape)

### 5. videoshop  
- 비디오 타입별 가격 계산
- [🔗 코드](../src/polymorphism/videoshop)

### 6. wheeler  
- 차량 속도 제어 및 오버라이딩 구현
- [🔗 코드](../src/polymorphism/wheeler)

---

## ⚙️ 주요 요구사항

- 부모 클래스 또는 인터페이스 정의
- 자식 클래스에서 기능 확장 및 오버라이딩
- 부모 타입으로 객체를 참조하여 사용
- 메서드 호출 시 실제 객체 타입에 따라 동작이 달라지도록 구현
- 필요 시 타입 확인(`instanceof`)을 활용하여 추가 기능 수행

---

## 💡 핵심 개념

- 다형성 (Polymorphism)
- 업캐스팅 (Upcasting)
- 오버라이딩 (Overriding)
- 동적 바인딩 (Dynamic Binding)
- 타입 확인 (`instanceof`)