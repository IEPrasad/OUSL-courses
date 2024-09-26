using System;
using System.Web.UI;

namespace PS_01
{
    public partial class Web_form_01 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                // Output submitted data
                Response.Write("Name: " + txt_name.Text + "<br>");
                Response.Write("Center: " + ListBox1.SelectedItem.Text + "<br>");
                Response.Write("Gender: " + DropDownList1.SelectedItem.Text + "<br>");

                // Hide controls after submission
                lbl_name.Visible = false;
                txt_name.Visible = false;
                lbl_center.Visible = false;
                ListBox1.Visible = false;
                lbl_gender.Visible = false;
                DropDownList1.Visible = false;
                Button1.Visible = false;
            }
        }
    }
}
