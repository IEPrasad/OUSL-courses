using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace LAB_TEST_1
{
    public partial class Web_Form_6 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Response.Write(txtCusName.Text + "</br>");
            Response.Write(txtadrs.Text + "</br>");
            Response.Write(txtPrCode.Text + "</br>");
            Response.Write(txtQuant.Text + "</br>");
            Response.Write(DropDownList1.SelectedItem.Text + "</br>");
            Response.Write(txtCardNo.Text + "</br>");
            Response.Write(txtExp.Text + "</br>");
            Response.Write(txtCVC.Text + "</br>");
            Response.Write(txtFname.Text + "</br>");
            Response.Write(txtLname.Text + "</br>");

            cusName.Visible = false;
            txtCusName.Visible = false;
            adrs.Visible = false;
            txtadrs.Visible = false;
            pCode.Visible = false;
            txtPrCode.Visible = false;
            quant.Visible = false;
            txtQuant.Visible = false;
            cardType.Visible = false;
            DropDownList1.Visible = false;
            cardNum.Visible = false;
            txtCardNo.Visible = false;
            expDate.Visible = false;
            txtExp.Visible = false;
            cvc.Visible = false;
            txtCVC.Visible = false;
            nameCard.Visible = false;
            txtFname.Visible = false;
            txtLname.Visible = false;

            
           




        }
    }
}
