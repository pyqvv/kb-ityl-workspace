function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 각 숫자의 2배 값을 출력하는 콜백 함수
var logDouble = function (i) {
  console.log(i * 2);
};

repeat(5, logDouble);
