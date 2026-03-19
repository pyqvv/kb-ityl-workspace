function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

var sum = 0;

// 반복되는 숫자의 누적합을 계산하는 콜백 함수
var add = function (i) {
  sum += i;
};

repeat(5, add);

console.log(sum);
