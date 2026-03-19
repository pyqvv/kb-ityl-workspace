function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// index: n 형식으로 숫자와 문자열을 함께 출력하는 콜백 함수
var logIndex = function (i) {
  console.log(`index: ${i}`);
};

repeat(3, logIndex);
