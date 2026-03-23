<template>
  <div style="width: 200px">
    <ol>
      <!-- v-for: 객체를 순회하며 value 값을 하나씩 꺼내 렌더링 -->
      <li v-for="item in items">
        {{ item }}
      </li>
    </ol>
  </div>
</template>

<script>
import { reactive } from 'vue';

export default {
  // Composition API
  setup() {
    // reactive로 만든 객체는 값이 변경되면 그 변화가 화면에 자동으로 반영된다
    const items = reactive({ 1: '1번 객체', 2: '2번 객체', 3: '3번 객체' });
    return {
      items,
    };
  },
};
</script>
