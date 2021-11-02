function zeroesToEnd(iArray) {
    if (iArray.indexOf(0) !== -1) {
        iArray.splice(iArray.indexOf(0),1);
        zeroesToEnd(iArray);
        iArray.push(0);
    }
    return iArray;
}

console.log(zeroesToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));