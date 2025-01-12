<?php
// Database connection
$host = 'localhost';
$user = 'root';
$password = '';
$dbname = 'employees_db';

// Connect to MySQL
$conn = new mysqli($host, $user, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Initialize variables
$searchKey = isset($_GET['searchKey']) ? $_GET['searchKey'] : '';
$searchType = isset($_GET['searchType']) ? $_GET['searchType'] : 'name';

// Prepare SQL query
$sql = "SELECT * FROM employees WHERE $searchType LIKE ?";
$stmt = $conn->prepare($sql);
$likeKey = '%' . $searchKey . '%';
$stmt->bind_param('s', $likeKey);
$stmt->execute();
$result = $stmt->get_result();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Search</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Search Employees</h1>
    <form method="get" action="index.php">
        <label for="searchKey">Search:</label>
        <input type="text" id="searchKey" name="searchKey" value="<?= htmlspecialchars($searchKey) ?>">
        
        <label for="searchType">Search By:</label>
        <select id="searchType" name="searchType">
            <option value="name" <?= $searchType == 'name' ? 'selected' : '' ?>>Name</option>
            <option value="id" <?= $searchType == 'id' ? 'selected' : '' ?>>ID</option>
            <option value="department" <?= $searchType == 'department' ? 'selected' : '' ?>>Department</option>
        </select>
        
        <button type="submit">Search</button>
    </form>

    <?php if ($result->num_rows > 0): ?>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <?php while ($row = $result->fetch_assoc()): ?>
                    <tr>
                        <td><?= htmlspecialchars($row['id']) ?></td>
                        <td><?= htmlspecialchars($row['name']) ?></td>
                        <td><?= htmlspecialchars($row['department']) ?></td>
                        <td><?= htmlspecialchars($row['email']) ?></td>
                    </tr>
                <?php endwhile; ?>
            </tbody>
        </table>
    <?php else: ?>
        <p>No r
