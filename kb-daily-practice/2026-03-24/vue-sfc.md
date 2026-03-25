# SFC Vue 기반 애플리케이션 개발

## SFC (Single File Component)

### 개념

- 단일 파일 컴포넌트
- 하나의 컴포넌트를 하나의 `.vue` 파일로 작성
- 하나의 파일 안에 아래 3가지 포함
  - `template` → UI 구조
  - `script` → 로직
  - `style` → 스타일

### 특징

- **컴포넌트 단위로 관심사 분리**
- 가독성과 유지보수성 향상

## 프로젝트 설정 (Vite 기반)

### 번들링 (Bundling)

- 여러 파일을 하나로 묶는 과정
- 대표 도구: Vite, Webpack

### 프로젝트 생성

```
npm init vue
cd 프로젝트명
npm install
npm run dev
```

## 기본 프로젝트 구조

### 주요 파일

- `package.json` → 프로젝트 설정 및 의존성 관리
- `src/` → 실제 개발 영역
- `src/components/` → 컴포넌트 관리

### 핵심 진입 구조

```
<!-- index.html -->
<div id="app"></div>
<script type="module" src="/src/main.js"></script>
```

```
// main.js
import {createApp } from 'vue'
import App from './App.vue'
createApp(App).mount('#app')
```

```
<!-- App.vue -->
<script setup></script>
<template></template>
<style scope></style>
```

## 컴포넌트

## 개념

- UI를 구성하는 **독립적인 단위**

### 컴포넌트 분할 기준

1. **데이터 변경 단위**
2. **재사용성 높은 요소 (ex. 버튼)**
3. **복잡한 UI**

### 구조

- 컴포넌트는 **부모-자식 관계 (트리 구조)** 로 구성됨

## 컴포넌트 사용

### 등록 및 사용

```
<template>
  <div>
    <h2>App 컴포넌트</h2><hr />
    <ul>
        <CheckboxItem />
        <CheckboxItem />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from './components/CheckboxItem.vue';

export default {
    name: 'App',
    components: { CheckboxItem };
};
</script>
```

## 컴포넌트 간 데이터 전달

### 부모 → 자식 : 속성 (Props)

#### 속성을 이용한 정보 전달

- 자식 컴포넌트는 props 옵션으로 속성 정의
- 부모 컴포넌트는 v-bind를 이용해 자식 컴포넌트의 속성에 정보를 전달
- **속성으로 전달 받은 데이터는 수정 불가!! -> 읽기 전용(read only)**
- **부모 데이터 변경 시 자식은 자동으로 렌더링 됨**
- [CheckboxItem.vue](./test-vue-app/src/components/CheckboxItem.vue)
- [App.vue](./test-vue-app/src/App.vue)

#### 속성을 이용한 객체 전달

- 전달할 속성이 많은 경우 → 객체 하나로 통합해서 전달
- [CheckboxItem2.vue](./test-vue-app/src/components/CheckboxItem2.vue)
- [App2.vue](./test-vue-app/src/App2.vue)

#### 속성의 유효성 검증

- 배열이 아닌 객체 형태로 props 정의 → 타입/필수 여부 검증 가능
- [CheckboxItem.vue](./test-vue-app/src/components/CheckboxItem.vue)
- [App.vue](./test-vue-app/src/App.vue)

### 자식 -> 부모 : 이벤트 (emit)

- 이벤트: 자식 컴포넌트가 부모 컴포넌트에게 정보를 전달하는 방법
- 자식이 `$emit('이벤트명', [값])`으로 이벤트 전달
- 부모는 `v-on` 또는 `@`로 이벤트 수신

```
// 자식
this.$emit('event-name', eventArgs1, eventArgs2, ...)
```

```
<!-- 부모 -->
<child-component @event-name="handlerMethod" />

methods: {
  handlerMethod(eventArgs1, eventArgs2, ...) {
    // 전달받은 arguments로 처리할 코드 작성
  }
}
```

- emits 옵션을 등록하여 발신하는 이벤트에 대한 유효성 검사를 수행할 수 있다.
- [InputName.vue](./test-vue-app/src/components/InputName.vue)
- [App4.vue](./test-vue-app/src/App4.vue)

## 기타

### NVM (Node Version Manager)

- Node.js 버전 관리 도구

```
nvm install 20.19.0
nvm use 20.19.0
```

### 명령어 옵션 표기법 (- / --)

| 명령어         | dash 개수 | 설명                     |
| -------------- | --------- | ------------------------ |
| node --version | 2         | 풀네임으로 명령을 주겠다 |
| node -v        | 1         | 줄여서 명령 하겠다       |
