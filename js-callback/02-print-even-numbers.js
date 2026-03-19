function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 0 ~ n-1 중 짝수만 출력하는 콜백 함수
var logEven = function (i) {
  if (i % 2 == 0) console.log(i);
};

repeat(10, logEven);
