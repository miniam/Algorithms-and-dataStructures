function Queue(array) {
  this.array = [];
  if (array) this.array = array;
}

Queue.prototype.first = function() {
  return this.array[0];
};

Queue.prototype.last = function() {
  return this.array[this.array.length - 1];
};

Queue.prototype.enqueue = function(value) {
  return this.array.push(value);
};

Queue.prototype.dequeue = function() {
  return this.array.shift();
};

var myqueue = new Queue();

myqueue.enqueue(1);
myqueue.enqueue(3);
myqueue.enqueue(5);

console.log(myqueue); // {array: [1,3,5]}

queue1.dequeue();
console.log(myqueue); // {array: [3,5]}

myqueue.dequeue();
console.log(myqueue); // {array: [5]}
