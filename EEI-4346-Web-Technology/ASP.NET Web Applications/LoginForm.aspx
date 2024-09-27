<%@ Page Language="C#" AutoEventWireup="true" CodeFile="LoginForm.aspx.cs" Inherits="PS_01.LoginForm" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Login Form with Age Validation</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Login Form</h2>
            
            <asp:Label ID="lbl_username" runat="server" Text="Username: "></asp:Label>
            <asp:TextBox ID="txt_username" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="rfv_username" runat="server" 
                ControlToValidate="txt_username" 
                ErrorMessage="Username is required." 
                ForeColor="Red"></asp:RequiredFieldValidator>
            <br /><br />

            <asp:Label ID="lbl_password" runat="server" Text="Password: "></asp:Label>
            <asp:TextBox ID="txt_password" runat="server" TextMode="Password"></asp:TextBox>
            <asp:RequiredFieldValidator ID="rfv_password" runat="server" 
                ControlToValidate="txt_password" 
                ErrorMessage="Password is required." 
                ForeColor="Red"></asp:RequiredFieldValidator>
            <br /><br />

            <asp:Label ID="lbl_age" runat="server" Text="Age: "></asp:Label>
            <asp:TextBox ID="txt_age" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="rfv_age" runat="server" 
                ControlToValidate="txt_age" 
                ErrorMessage="Age is required." 
                ForeColor="Red"></asp:RequiredFieldValidator>
            <asp:RangeValidator ID="rv_age" runat="server" 
                ControlToValidate="txt_age"
                MinimumValue="0"
                MaximumValue="130"
                Type="Integer"
                ErrorMessage="Age must be between 0 and 130." 
                ForeColor="Red"></asp:RangeValidator>
            <br /><br />

            <asp:Button ID="btn_login" runat="server" Text="Login" OnClick="btn_login_Click" />
        </div>

        <asp:ValidationSummary ID="ValidationSummary1" runat="server" 
            ForeColor="Red" HeaderText="Please correct the following errors:" />
    </form>
</body>
</html>
