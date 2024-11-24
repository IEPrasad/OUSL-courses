<?php
$con = mysqli_connect("localhost", "root", "", "EMP_DB");

if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}

if ($_SERVER["REQUEST_METHOD"] == "POST" && $_POST['action'] == "Insert") {
    $emp_dept = mysqli_real_escape_string($con, $_POST['emp_dept']);
    $dept_type = mysqli_real_escape_string($con, $_POST['dept_type']);
    $emp_dept_no = (int)$_POST['emp_dept_no'];
    
    $sql = "INSERT INTO EMP_DEPT (EMP_DEPT, DEPT_TYPE, EMP_DEPT_NO) VALUES ('$emp_dept', '$dept_type', '$emp_dept_no')";
    
    if (mysqli_query($con, $sql)) {
        echo "Record inserted successfully. <a href='dept_form.html'>Go Back</a>";
    } else {
        echo "Error: " . mysqli_error($con) . "<br><a href='dept_form.html'>Go Back</a>";
    }
}

if ($_SERVER["REQUEST_METHOD"] == "GET" && $_GET['action'] == "Search") {
    $search_emp_dept = mysqli_real_escape_string($con, $_GET['search_emp_dept']);
    
    $sql = "SELECT * FROM EMP_DEPT WHERE EMP_DEPT = '$search_emp_dept'";
    $result = mysqli_query($con, $sql);
    
    if (mysqli_num_rows($result) > 0) {
        echo "<h3>Department Details</h3>";
        while ($row = mysqli_fetch_assoc($result)) {
            echo "Department Name: " . $row["EMP_DEPT"] . "<br>";
            echo "Department Type: " . $row["DEPT_TYPE"] . "<br>";
            echo "Department Number: " . $row["EMP_DEPT_NO"] . "<br><br>";
        }
    } else {
        echo "No records found for department: $search_emp_dept<br><a href='dept_form.html'>Go Back</a>";
    }
}

mysqli_close($con);
?>
