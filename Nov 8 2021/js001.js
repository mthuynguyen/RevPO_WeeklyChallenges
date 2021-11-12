function trackRobot(... iDistances) {
    let iCoords = [0, 0];
    let bPos = 1;
    let bVertical = 1;
    iDistances.forEach((i) => {
        iCoords[bVertical] += (-1+bPos*2)*i;
        bPos = (bVertical === 1?bPos:bPos+1)%2;
        bVertical = (bVertical + 1)%2;
    });
    return iCoords;
}

console.log(trackRobot(20,30,10,40));
console.log(trackRobot());
console.log(trackRobot(-10,20,10));