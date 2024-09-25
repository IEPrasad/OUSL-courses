using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace PS_01
{
    public partial class Web_form_01 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Write(txt_name.Text + "<br>");
            Response.Write(ListBox1.SelectedItem.Text + "<br>");

            lbl_name.Visible = false;
            txt_name.Visible = false;
            lbl_center.Visible = false;
            lbl_gender.Visible = false;

        }
    }
}
