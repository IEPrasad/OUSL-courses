# Instructions for Setting Up and Running the Employee Search Web Application

## Prerequisites
1. Web Server and PHP: Install XAMPP, WAMP, or LAMP.
2. MySQL Database: Ensure MySQL is installed and phpMyAdmin is configured.
3. Browser: Use a modern browser to access the application.

---

## Step 1: Database Setup
1. Open phpMyAdmin (http://localhost/phpmyadmin).
2. Click the Import tab.
3. Select the `employees.sql` file.
4. Click Go to execute the script.

---

## Step 2: Configure PHP File
1. Place `index.php` in your web server's root directory:
   - XAMPP: `C:\xampp\htdocs\`
   - WAMP: `C:\wamp\www\`
   - LAMP: `/var/www/html/`
2. Update database credentials in `index.php` if needed:
   - Host: `localhost`
   - Username: `root`
   - Password: (empty string)
   - Database name: `employees_db`

---

## Step 3: Start the Web Server
1. Start Apache and MySQL services:
   - XAMPP: Use the XAMPP Control Panel.
   - WAMP: Start All Services.
   - LAMP: Run `sudo service apache2 start` and `sudo service mysql start`.

---

## Step 4: Access the Application
1. Open your browser.
2. Go to `http://localhost/index.php`.
3. Use the search form:
   - Search by Name, ID, or Department.
   - View results in the table below.

---

## Step 5: Test the Application
- Example searches:
  - Name: `John`
  - Department: `IT`
  - ID: `1`
- Verify results display correctly.

---

## Troubleshooting
- **Database Connection Error**: Check MySQL status and credentials in `index.php`.
- **Page Not Found**: Ensure `index.php` is in the correct directory.
- **No Results in Search**: Re-import `employees.sql` if necessary.

---

## Additional Notes
- Add employees via phpMyAdmin or SQL.
- Edit CSS in `index.php` for styling.
- Deploy online via a PHP-compatible hosting service.
