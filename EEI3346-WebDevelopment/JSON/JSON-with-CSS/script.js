const jsonData = [
  {
    "name": "Isuru",
    "age": "22 years",
    "school": "Matara",
    "grade": "Grade 11",
    "teacher": "Sarath Sir"
  },
  {
    "name": "Isuru",
    "age": "22 years",
    "school": "Matara",
    "grade": "Grade 11",
    "teacher": "Sarath Sir"
  },
  {
    "name": "Isuru",
    "age": "22 years",
    "school": "Matara",
    "grade": "Grade 11",
    "teacher": "Sarath Sir"
  }
];

const tableBody = document.querySelector('#data-table tbody');

jsonData.forEach(item => {
  const row = document.createElement('tr');
  
  Object.values(item).forEach(text => {
    const cell = document.createElement('td');
    cell.textContent = text;
    row.appendChild(cell);
  });

  tableBody.appendChild(row);
});





