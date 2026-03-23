<!-- 이벤트 리스너를 이용한 사용자 입력 처리 -->
<!-- HTML에서 발생한 이벤트(click 등)를 감지해서 코드 실행 -->

<!-- 이벤트 연결 방법 -->
<!-- 1) v-on:click = "코드 or 함수" -->
<!-- 2) @click = "코드 or 함수" (축약형) -->

<template>
  <p>{{ counter + counter2 }}</p>
  <!-- 템플릿에서 직접 값 증가 -->
  <button @click="counter++">클릭하면 숫자가 올라갑니다.</button>
  <!-- 함수 호출하여 값 증가 -->
  <button @click="onClick2">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue';

export default {
  // Option API
  data() {
    return {
      counter2: 0,
    };
  },

  // Composition API
  setup() {
    // ref로 선언된 값은 프록시 객체로 변환되어 관리된다.
    let counter = ref(0);

    // 프록시 객체란?
    // 실제 값을 감싸서, 값이 변경 될 때 Vue가 이를 감지하고 화면을 자동으로 업데이트해주는 객체

    // (현재 템플릿에서는 사용되지 않음)
    const onClick = (evt) => {
      if (evt) {
        evt.preventDefault();
        counter.value++;
      }
    };
    return {
      counter,
      onClick,
    };
  },

  methods: {
    // Option API 방식 이벤트 처리
    onClick2: function (evt) {
      if (evt) {
        evt.preventDefault();
      }
      this.counter2++;
    },
  },
};
</script>
