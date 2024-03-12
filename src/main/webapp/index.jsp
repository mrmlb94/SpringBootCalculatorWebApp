<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
</head>
<body>
    <div class="calculator">
        <form action="add" method="POST"> <input type="number" name="num1" placeholder="Enter first number" required>
            <select name="operator"> <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="%">%</option>
            </select>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <button type="submit">Calculate</button> </form>
    </div>
</body>
</html>
