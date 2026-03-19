function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 0 ~ n-1까지 모든 숫자를 출력하는 콜백 함수
var logAll = function (i) {
  console.log(i);
};

repeat(5, logAll);
