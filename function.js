
var vowelCount = (name) => {
    let vowels = 'a,e,i,o,u';
    let name1 = name.split(" ");
    if (name1 === vowels) {
        console.log(name1);
    }

}
vowelCount("Hello")

const flattenedArray = [[3, 2, 1], [4, 5, 2], [1, 6]]
let flatten = flattenedArray.flat();
console.log("array after flatten", flatten);
let sortAscend = flatten.sort();
console.log("sorted in asecending", sortAscend);

const expenses = [
    {
        category: "Food",
        amount: 120
    },
    {
        category: "Travel",
        amount: 300
    },
    {
        category: "Food",
        amount: 80
    },
    {
        category: "Bills",
        amount: 200
    },
    {
        category: "Travel",
        amount: 100
    },
];

if (expenses.category == "Food") {
    console.log(expenses.amount);
    let expense = expenses.amount + expenses.amount;
    console.log(expenses);

}





