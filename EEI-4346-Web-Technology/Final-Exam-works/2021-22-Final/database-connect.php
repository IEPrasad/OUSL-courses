<?php
  $con = mysqli_connect("localhost", "root", "", "final_practice");

  if (!$con) {
    die("Could not connect".mysql_error());
  } else {
    echo "Connection established successfully ...";
    echo n12br("\n");

    $sql = "INSERT INTO emp_details(emp_id, nic,	title,	fname,	lname,	gender,	dob, age) values(
      '$_POST[emp_id]',
      '$_POST[nic]',
      '$_POST[title]',
      '$_POST[fname]',
      '$_POST[lname],
      '$_POST[gender]',
      '$_POST[dob]',
      '$_POST[age]'
    )";
  }

  if (!mysqli_query($con, $sql)) {
    die ("Error".mysql_error());
  } else {
    echo "Your record added successfully ....";
  }

  mysqli_close($con);
?>