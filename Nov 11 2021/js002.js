function shiftToRight(a, b) {
    return Math.floor(a / Math.floor(Math.pow(2,b)));
}

console.log(shiftToRight(80,3));
console.log(shiftToRight(-24,2));
console.log(shiftToRight(-5,1));
console.log(shiftToRight(4666,6));
console.log(shiftToRight(3777,6));
console.log(shiftToRight(-512,10));