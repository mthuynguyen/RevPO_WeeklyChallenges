function vendingMachine(products, iMoney, iProduct) {
    const iChange = [500, 200, 100, 50, 20, 10];
    if (!products[iProduct]) {
        console.log("Enter a valid product number!");
        return null;
    }
    if (products[iProduct].iPrice > iMoney) {
        console.log("Not enough money for this product.");
        return null;
    }
    let result = {
        product: products[iProduct].strName,
        change: []
    }
    iMoney -= products[iProduct].iPrice;
    for (let i of iChange) {
        while (iMoney >= i) {
            result.change.push(i);
            iMoney -= i;
        }
    }
    result.change = result.change.toString();
    return result;
}

const products = [
    {strName: "What's coming for ya", iPrice: 0},
    {strName: "Electoral vote", iPrice: 7000000000},
    {strName: "A loan for $20", iPrice: -2000},
    {strName: "AA battery", iPrice: 129},
    {strName: "$10's worth of tax credit", iPrice: 800},
    {strName: "Some time", iPrice: 1500},
    {strName: "List of first 8 products offered by this vending machine", iPrice: 100},
    {strName: "Crackers (indeterminate amount)", iPrice: 120},
    {strName: "Price list for all products offered by this vending machine", iPrice: 18000},
    {strName: "End User License Agreement (by selecting this option, you agree to it)", iPrice: 300}
];

const testArgs = [[200,7], [500,0], [90,1], [700,17]];
for (let arg of testArgs) {
    let output = vendingMachine(products, arg[0], arg[1]);
    if (output) {
        console.log(`{product: '${output.product}', change: [${output.change}]}`);
    }
}