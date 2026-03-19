function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 각 숫자의 제곱값을 출력하는 콜백 함수
var logSquare = function (i) {
  console.log(i * i);
};

repeat(5, logSquare);
