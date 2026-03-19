function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 0 ~ n-1 중 홀수만 출력하는 콜백 함수
var logOdd = function (i) {
  if (i % 2 == 1) console.log(i);
};

repeat(10, logOdd);
