using System;
using System.Web.UI;

namespace WebApplication1
{
    public partial class WebForm : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            // This is executed when the page loads. No specific logic for now.
        }

        // Method to handle form submission
        protected void Submit1_Click(object sender, EventArgs e)
        {
            if (Page.IsValid) // Ensure that the page validation passes
            {
                // Add your logic for form submission here, such as saving to the database
                string customerName = txt_name.Text;
                string address = txt_address.Text;
                string productCode = txt_pcode.Text;
                string quantity = txt_quentity.Text;
                string cardType = DropDownList1.SelectedValue;
                string cardNumber = txt_card_num.Text;
                string expireDate = txt_exdate.Text;
                string cvc = txt_cvc.Text;
                string firstName = fname.Text;
                string lastName = lname.Text;

                // For example, you can display the user inputs in a label or save them to a database
                // You could add more logic here as needed
                Response.Write("<script>alert('Form submitted successfully!');</script>");
            }
        }
    }
}
