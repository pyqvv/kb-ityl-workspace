function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// 반복 횟수에 따라 별(*)을 누적하여 출력하는 콜백 함수
var logStar = function (i) {
  var stars = '';
  for (var j = 0; j < i + 1; j++) {
    stars += '*';
  }
  console.log(stars);
};

repeat(4, logStar);
