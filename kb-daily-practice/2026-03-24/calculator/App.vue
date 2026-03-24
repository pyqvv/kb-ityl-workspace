<script>
export default {
  data() {
    return {
      pre: '',
      cur: '',
      output: '',
      operator: '',
      errorMessage: '',
      operatorActions: {
        '+': (a, b) => a + b,
        '-': (a, b) => a - b,
        '*': (a, b) => a * b,
        '/': (a, b) => a / b,
      },
    };
  },

  methods: {
    isOperator(value) {
      return value === '+' || value === '-' || value === '*' || value === '/';
    },

    handleClear() {
      this.pre = '';
      this.cur = '';
      this.operator = '';
      this.output = '';
      return;
    },

    setError(message) {
      this.errorMessage = message;
    },

    clearError() {
      this.errorMessage = '';
    },

    handleOperator(op) {
      this.clearError();
      this.operator = op;
      return;
    },

    handleNumberInput(n) {
      // 연산자인지 체크
      if (this.isOperator(n)) {
        // 이미 연산자가 있다면, 새 연산자로 교체
        if (this.operator !== '') {
          this.handleOperator(n);
          this.output = this.pre + this.operator;
          return;
        }

        // 아무것도 입력되지 않은 상태에서 연산자 입력 막기
        if (this.cur === '') {
          this.errorMessage = '숫자를 먼저 입력하세요.';
          this.setError(this.errorMessage);
          return;
        }

        this.pre += this.cur;
        this.handleOperator(n);
        this.cur = '';
        return;
      }
      this.cur += n;
    },

    handleEqual() {
      if (this.canCalculate()) {
        this.calculate();
        this.pre = '';
        this.operator = '';
        this.cur = this.output;
      }
      return;
    },

    operation(event) {
      const n = event.currentTarget.value;

      // C 버튼
      if (n === 'C') {
        this.handleClear();
        return;
      }

      // = 버튼
      if (n === '=') {
        this.handleEqual();
        return;
      }

      this.handleNumberInput(n);

      this.output = this.pre + this.operator + this.cur;
    },

    canCalculate() {
      return this.pre !== '' && this.cur !== '' && this.operator !== '';
    },

    computeResult() {
      const left = Number(this.pre);
      const right = Number(this.cur);

      if (this.operator === '/' && right === 0) {
        this.errorMessage = '0으로 나눌 수 없습니다.';
        this.setError(this.errorMessage);
        return null;
      }

      return this.operatorActions[this.operator](left, right);
    },

    calculate() {
      const result = this.computeResult();

      if (result === null) {
        return;
      }

      this.cur = String(result);
      this.output = String(result);
      this.clearError();
    },
  },
};
</script>

<template>
  <div class="calculator">
    <input type="text" v-model="errorMessage" name="errorMessage" readonly />
    <form name="forms">
      <input type="text" v-model="output" name="output" readonly />

      <input type="button" class="clear" value="C" @click="operation" />
      <input type="button" class="operator" value="/" @click="operation" />
      <input type="button" value="1" @click="operation" />
      <input type="button" value="2" @click="operation" />
      <input type="button" value="3" @click="operation" />
      <input type="button" class="operator" value="*" @click="operation" />
      <input type="button" value="4" @click="operation" />
      <input type="button" value="5" @click="operation" />
      <input type="button" value="6" @click="operation" />
      <input type="button" class="operator" value="+" @click="operation" />
      <input type="button" value="7" @click="operation" />
      <input type="button" value="8" @click="operation" />
      <input type="button" value="9" @click="operation" />
      <input type="button" class="operator" value="-" @click="operation" />
      <input type="button" class="dot" value="." @click="operation" />
      <input type="button" value="0" @click="operation" />
      <input
        type="button"
        class="operator result"
        value="="
        @click="operation"
      />
    </form>
  </div>
</template>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background-color: #ffffff;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.calculator {
  width: 287px;
  border: 1px solid #333;
  background-color: #ccc;
  padding: 5px;
}

.calculator form {
  display: grid;
  grid-template-columns: repeat(4, 65px);
  grid-auto-rows: 65px;
  grid-gap: 5px;
}

.calculator form input {
  border: 2px solid #333;
  cursor: pointer;
  font-size: 19px;
}

.calculator form input:hover {
  box-shadow: 1px 1px 2px #333;
}

.calculator form .clear {
  background-color: #ed4848;
}

.calculator form .operator {
  background-color: orange;
}

.calculator form .dot {
  background-color: green;
}

.calculator form input[type='text'] {
  grid-column: span 4;
  text-align: right;
  padding: 0 10px;
}

.calculator form .clear {
  grid-column: span 3;
}

.calculator form .result {
  grid-column: span 2;
}
</style>
