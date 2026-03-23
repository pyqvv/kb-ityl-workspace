<template>
  <!-- 화면에 실제로 보여지는 영역 -->

  <!-- setup()에서 선언한 date 사용 -->
  <div id="date">
    {{ date }}
  </div>

  <!-- data()에서 선언한 date2 사용 -->
  <div id="date2">
    {{ date2 }}
  </div>
</template>

<script>
export default {
  // Composition API
  setup() {
    // 현재 날짜를 문자열로 저장
    const date = Date().toString();

    // template에서 사용하려면 return 해야 함
    return {
      date,
    };
  },

  // Option API
  data() {
    return {
      // data에 선언하면 template에서 바로 사용 가능
      date2: Date().toString(),
    };
  },
};

/*
[ setup vs data return 차이 ]
- setup return: template에서 사용할 값 "노출"하기 위해 사용
- data return: Vue가 관리할 "상태 데이터(시간이나 이벤트에 따라 값이 변할 수 있는 데이터)"를 정의

[ Composition API vs Option API 차이 ]
- Composition: setup() 안에서 기능별로 작성 (함수 중심, this 사용 X)
- Option: data, methods 등 옵션별로 분리 (this 사용 O)
*/
</script>
