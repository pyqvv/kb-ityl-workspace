<!-- v-bind(단방향 데이터 바인딩) vs v-model(양방향 데이터 바인딩) -->
<template>
  <p>줄임말과 원래말을 입력하세요.</p>

  <!-- v-bind: 값 → 화면으로만 전달 (읽기 전용, 입력해도 변수 값은 안 바뀜) -->
  <input type="text" v-bind:value="abbr" />

  <!-- v-model: 입력값과 변수가 연결됨 (입력하면 값 변경 + 값 변경 시 화면 반영) -->
  <input type="text" v-model="normal" />

  <hr />
  <abbr v-bind:title="normal">{{ abbr }}</abbr>
</template>

<script>
import { ref } from 'vue';

export default {
  // Composition API
  setup() {
    // ref: 반응형 데이터 (값이 바뀌면 화면도 자동 업데이트됨)
    const abbr = ref('KB');
    const normal = ref('World Wide Web');
    return {
      abbr,
      normal,
    };
  },
};
</script>
