  document.getElementById("runLoopBtn").addEventListener("click", performLoop);

function performLoop() {
    const firstNum = document.getElementById("firstNum").value;
    const secondNum = document.getElementById("secondNum").value;

    if (!isValidNumber(firstNum) || !isValidNumber(secondNum)) {
        alert("You must enter valid numbers");
        return;
    }

    if (parseInt(firstNum) > parseInt(secondNum)) {
        alert("The first number should be smaller than the second number");
        document.body.style.backgroundColor = "red";
        return;
    } else {
        document.body.style.backgroundColor = ""; // Reset background color
    }

    let sum = 0;
    let output = "";
    for (let i = parseInt(firstNum); i <= parseInt(secondNum); i++) {
        output += i + "<br>";
        sum += i;
    }
    output += "Total: " + sum;
    document.getElementById("output").innerHTML = output;
}

function isValidNumber(num) {
    return !isNaN(parseFloat(num)) && isFinite(num);
}
