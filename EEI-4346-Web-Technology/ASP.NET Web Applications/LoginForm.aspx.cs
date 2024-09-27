using System;
using System.Web.UI;

namespace PS_01
{
    public partial class LoginForm : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btn_login_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                // Simulate login validation
                string username = txt_username.Text;
                string password = txt_password.Text;
                int age = int.Parse(txt_age.Text);

                // You can add your login logic here (e.g., database verification)
                // For demonstration, let's just display a successful login message if the form is valid

                Response.Write($"Welcome {username}, your age is {age}. Login Successful!");
            }
        }
    }
}
