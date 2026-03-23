<template>
  <h2>Small Items</h2>

  <!-- Composition API: computed로 필터링된 배열 -->
  <p v-for="item in small_items_c" :key="item.id">{{ item.text }}</p>

  <!-- Option API: computed로 필터링된 배열 -->
  <p v-for="item in small_items_o" :key="item.id">{{ item.text }}</p>

  <h2>Big Items</h2>

  <!-- Composition API -->
  <p v-for="item in big_items_c" :key="item.id">{{ item.text }}</p>

  <!-- Option API -->
  <p v-for="item in big_items_o" :key="item.id">{{ item.text }}</p>
</template>

<script>
import { reactive, computed } from 'vue';

export default {
  // Options API
  data() {
    return {
      // 원본 데이터 배열
      arr: [
        { id: 1, text: '1번 옵션 아이템' },
        { id: 2, text: '2번 옵션 아이템' },
        { id: 3, text: '3번 옵션 아이템' },
        { id: 4, text: '4번 옵션 아이템' },
        { id: 5, text: '5번 옵션 아이템' },
      ],
    };
  },
  computed: {
    // id가 3보다 작은 데이터만 반환
    small_items_o() {
      return this.arr.filter((i) => i.id < 3);
    },
    // id가 3 이상인 데이터만 반환
    big_items_o() {
      return this.arr.filter((i) => i.id >= 3);
    },
  },

  // Composition API
  setup() {
    // reactive: 배열을 반응형으로 생성 (값 변경 시 화면 자동 업데이트)
    const arr = reactive([
      { id: 1, text: '1번 아이템' },
      { id: 2, text: '2번 아이템' },
      { id: 3, text: '3번 아이템' },
      { id: 4, text: '4번 아이템' },
      { id: 5, text: '5번 아이템' },
    ]);

    // computed: 기존 데이터를 기반으로 새로운 값을 계산해서 반환
    const small_items_c = computed(() => {
      return arr.filter((i) => i.id < 3);
    });
    const big_items_c = computed(() => {
      return arr.filter((i) => i.id >= 3);
    });

    // Composition API에서는 computed() 함수를 사용하고,
    // Option API에서는 computed 옵션에 함수 형태로 정의하며 this로 데이터에 접근한다

    return {
      small_items_c,
      big_items_c,
    };
  },
};
</script>
