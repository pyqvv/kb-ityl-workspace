<template>
  <!-- 현재 counter 값 출력 -->
  <p>{{ counter }}</p>

  <!-- 조건부 렌더링 -->
  <!-- counter가 5보다 작을 때만 렌더링 -->
  <p v-if="counter < 5">5보다 작습니다.</p>

  <!-- 위 조건이 거짓일 때 렌더링 -->
  <p v-else>5와 같거나 큽니다.</p>

  <!-- 클릭 시 counter 값 증가 -->
  <button @click="counter++">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue';

export default {
  // Composition API
  setup() {
    // ref로 생성된 값은 프록시 객체로 관리됨
    // 값을 감싸고 있다가 변경을 감지하면 자동으로 화면을 업데이트해줌
    let counter = ref(0);
    return {
      counter,
    };
  },
};
</script>
