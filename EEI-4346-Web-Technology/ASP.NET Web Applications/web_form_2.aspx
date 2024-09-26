<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Web_form_01.aspx.cs" Inherits="PS_01.Web_form_01" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Validation Form</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="lbl_name" runat="server" Text="Name: "></asp:Label>
            <asp:TextBox ID="txt_name" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="rfv_name" runat="server" 
                ControlToValidate="txt_name" 
                ErrorMessage="Name is required." 
                ForeColor="Red"></asp:RequiredFieldValidator>
            <br /><br />

            <asp:Label ID="lbl_center" runat="server" Text="Select Center: "></asp:Label>
            <asp:ListBox ID="ListBox1" runat="server">
                <asp:ListItem Text="Center A" Value="A"></asp:ListItem>
                <asp:ListItem Text="Center B" Value="B"></asp:ListItem>
                <asp:ListItem Text="Center C" Value="C"></asp:ListItem>
            </asp:ListBox>
            <asp:RequiredFieldValidator ID="rfv_center" runat="server"
                ControlToValidate="ListBox1"
                InitialValue=""
                ErrorMessage="Please select a center."
                ForeColor="Red"></asp:RequiredFieldValidator>
            <br /><br />

            <asp:Label ID="lbl_gender" runat="server" Text="Gender: "></asp:Label>
            <asp:DropDownList ID="DropDownList1" runat="server">
                <asp:ListItem Text="Select" Value=""></asp:ListItem>
                <asp:ListItem Text="Male" Value="Male"></asp:ListItem>
                <asp:ListItem Text="Female" Value="Female"></asp:ListItem>
            </asp:DropDownList>
            <asp:RequiredFieldValidator ID="rfv_gender" runat="server" 
                ControlToValidate="DropDownList1" 
                InitialValue="" 
                ErrorMessage="Gender is required." 
                ForeColor="Red"></asp:RequiredFieldValidator>
            <br /><br />

            <asp:Button ID="Button1" runat="server" Text="Submit" OnClick="Button1_Click" />
        </div>

        <asp:ValidationSummary ID="ValidationSummary1" runat="server" 
            ForeColor="Red" HeaderText="Please correct the following errors:" />
    </form>
</body>
</html>
