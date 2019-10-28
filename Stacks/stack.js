function Stack(array) {
  this.array = [];
  if (array) {
    this.array = array;
  }
}

Stack.prototype.push = function(value) {
  this.array.push(value);
};

Stack.prototype.pop = function() {
  return this.array.pop();
};

Stack.prototype.top = function() {
  return this.array[this.array.length - 1];
};

Stack.prototype.element = function(element) {
  return this.array[element - 1];
};

var mystack = new Stack();
mystack.push(1);
mystack.push(3);
mystack.push(5);
mystack.push(7);
mystack.push(9);
mystack.push(11);

console.log(mystack); // [1,3,5,7,9,11]

console.log(mystack.pop()); // 11

console.log(mystack); // [1,3,5,7,9]

console.log(mystack.element(1)); // 3
