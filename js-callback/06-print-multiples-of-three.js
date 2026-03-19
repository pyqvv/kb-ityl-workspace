function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 0 ~ n-1 중 3의 배수만 출력하는 콜백 함수
var logMultipleOf3 = function (i) {
  if (i % 3 == 0) console.log(i);
};

repeat(10, logMultipleOf3);
