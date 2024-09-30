<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Web Form-6.aspx.cs" Inherits="LAB_TEST_1.Web_Form_6" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            color: #9933FF;
            font-size: xx-large;
            text-align: center;
            width: 364px;
        }
        .auto-style2 {
            width: 118px;
        }
        .auto-style3 {
            text-align: center;
            font-size: x-large;
            width: 364px;
            color: #9933FF;
            height: 41px;
        }
        .auto-style4 {
            width: 364px;
        }
        .auto-style5 {
            margin-left: 29px;
        }
        .auto-style6 {
            margin-left: 67px;
        }
        .auto-style7 {
            width: 364px;
            text-align: center;
            height: 4px;
        }
        .auto-style9 {
            color: #9933FF;
        }
        .auto-style14 {
            width: 118px;
            text-align: right;
            height: 41px;
        }
        .auto-style15 {
            width: 364px;
            height: 41px;
        }
        .auto-style17 {
            color: #FF0000;
        }
        .auto-style18 {
            width: 118px;
            text-align: right;
            height: 39px;
        }
        .auto-style19 {
            width: 364px;
            height: 39px;
        }
        .auto-style20 {
            height: 39px;
        }
        .auto-style21 {
            width: 118px;
            text-align: right;
            height: 27px;
        }
        .auto-style22 {
            width: 364px;
            height: 27px;
        }
        .auto-style23 {
            height: 27px;
        }
        .auto-style24 {
            width: 118px;
            text-align: right;
            height: 31px;
        }
        .auto-style25 {
            width: 364px;
            height: 31px;
        }
        .auto-style26 {
            height: 31px;
        }
        .auto-style27 {
            width: 118px;
            text-align: right;
            height: 32px;
        }
        .auto-style28 {
            width: 364px;
            height: 32px;
        }
        .auto-style29 {
            height: 32px;
        }
        .auto-style30 {
            width: 118px;
            height: 41px;
        }
        .auto-style31 {
            height: 41px;
        }
        .auto-style32 {
            width: 118px;
            text-align: right;
            height: 33px;
        }
        .auto-style33 {
            width: 364px;
            height: 33px;
        }
        .auto-style34 {
            height: 33px;
        }
        .auto-style35 {
            width: 118px;
            text-align: right;
            height: 36px;
        }
        .auto-style36 {
            width: 364px;
            height: 36px;
        }
        .auto-style37 {
            height: 36px;
        }
        .auto-style38 {
            width: 118px;
            height: 8px;
        }
        .auto-style39 {
            width: 364px;
            height: 8px;
        }
        .auto-style40 {
            height: 8px;
        }
        .auto-style41 {
            width: 118px;
            height: 4px;
        }
        .auto-style42 {
            height: 4px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <table style="width:100%;">
                <tr>
                    <td class="auto-style2">&nbsp;</td>
                    <td class="auto-style1">PlACE YOUR ORDER</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td class="auto-style18">
                        <asp:Label ID="cusName" runat="server" CssClass="auto-style9" Text="Customer Name"></asp:Label>
                    </td>
                    <td class="auto-style19">
                        <asp:TextBox ID="txtCusName" runat="server" Height="21px" Width="273px"></asp:TextBox>
                    </td>
                    <td class="auto-style20"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtCusName" CssClass="auto-style17" ErrorMessage="Customer Name is Required"></asp:RequiredFieldValidator>
                        <br />
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style21">
                        <asp:Label ID="adrs" runat="server" CssClass="auto-style9" Text="Address"></asp:Label>
                    </td>
                    <td class="auto-style22">
                        <asp:TextBox ID="txtadrs" runat="server" Width="273px"></asp:TextBox>
                    </td>
                    <td class="auto-style23"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtadrs" CssClass="auto-style17" ErrorMessage="Address is Required"></asp:RequiredFieldValidator>
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style24">
                        <asp:Label ID="pCode" runat="server" CssClass="auto-style9" Text="Product Code"></asp:Label>
                    </td>
                    <td class="auto-style25">
                        <asp:TextBox ID="txtPrCode" runat="server" Width="273px"></asp:TextBox>
                    </td>
                    <td class="auto-style26"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="txtPrCode" CssClass="auto-style17" ErrorMessage="Product Code  is Required"></asp:RequiredFieldValidator>
                        <br />
                        <br />
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style27">
                        <asp:Label ID="quant" runat="server" CssClass="auto-style9" Text="Quantity"></asp:Label>
                    </td>
                    <td class="auto-style28">
                        <asp:TextBox ID="txtQuant" runat="server" Width="273px"></asp:TextBox>
                    </td>
                    <td class="auto-style29"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="txtQuant" CssClass="auto-style17" ErrorMessage="Quantity is Required"></asp:RequiredFieldValidator>
                        <br />
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style30"></td>
                    <td class="auto-style3">Payment Process</td>
                    <td class="auto-style31"></td>
                </tr>
                <tr>
                    <td class="auto-style32">
                        <asp:Label ID="cardType" runat="server" CssClass="auto-style9" Text="Select Card Type"></asp:Label>
                    </td>
                    <td class="auto-style33">
                        <asp:DropDownList ID="DropDownList1" runat="server">
                            <asp:ListItem>Select Card Type</asp:ListItem>
                            <asp:ListItem>Master</asp:ListItem>
                            <asp:ListItem>Credit</asp:ListItem>
                            <asp:ListItem>Debit</asp:ListItem>
                            <asp:ListItem>Visa</asp:ListItem>
                            <asp:ListItem></asp:ListItem>
                        </asp:DropDownList>
                    </td>
                    <td class="auto-style34"></td>
                </tr>
                <tr>
                    <td class="auto-style35">
                        <asp:Label ID="cardNum" runat="server" CssClass="auto-style9" Text="Card Number"></asp:Label>
                    </td>
                    <td class="auto-style36">
                        <asp:TextBox ID="txtCardNo" runat="server" Width="274px"></asp:TextBox>
                    </td>
                    <td class="auto-style37"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" ControlToValidate="txtCardNo" CssClass="auto-style17" ErrorMessage="Card Number is Required"></asp:RequiredFieldValidator>
                        <br />
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style27">
                        <asp:Label ID="expDate" runat="server" CssClass="auto-style9" Text="Expire Date"></asp:Label>
                    </td>
                    <td class="auto-style28">
                        <asp:TextBox ID="txtExp" runat="server" Width="273px"></asp:TextBox>
                    </td>
                    <td class="auto-style29"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator9" runat="server" ControlToValidate="txtExp" CssClass="auto-style17" ErrorMessage="Month/Year is Required"></asp:RequiredFieldValidator>
                        </em></td>
                </tr>
                 <tr>
                    <td class="auto-style35">
                        <asp:Label ID="cvc" runat="server" CssClass="auto-style9" Text="CVC No"></asp:Label>
                     </td>
                    <td class="auto-style36">
                        <asp:TextBox ID="txtCVC" runat="server" Width="273px"></asp:TextBox>
                     </td>
                    <td class="auto-style37"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator6" runat="server" ControlToValidate="txtCVC" CssClass="auto-style17" ErrorMessage="CVC No is Required"></asp:RequiredFieldValidator>
                        <br />
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style14">
                        <asp:Label ID="nameCard" runat="server" CssClass="auto-style9" Text="Name on Card"></asp:Label>
                    </td>
                    <td class="auto-style15">
                        <asp:TextBox ID="txtFname" runat="server" Width="125px"></asp:TextBox>
                        <asp:TextBox ID="txtLname" runat="server" CssClass="auto-style5" Width="109px"></asp:TextBox>
                    </td>
                    <td class="auto-style31"><em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator7" runat="server" ControlToValidate="txtFname" CssClass="auto-style17" ErrorMessage="First Name is Required"></asp:RequiredFieldValidator>
                        </em>
                        <br />
                        <em>
                        <asp:RequiredFieldValidator ID="RequiredFieldValidator8" runat="server" ControlToValidate="txtLname" CssClass="auto-style17" ErrorMessage="Last Name is Required"></asp:RequiredFieldValidator>
                        </em></td>
                </tr>
                <tr>
                    <td class="auto-style38"></td>
                    <td class="auto-style39"></td>
                    <td class="auto-style40"></td>
                </tr>
                <tr>
                    <td class="auto-style2"></td>
                    <td class="auto-style4"></td>
                    <td></td>
                </tr>
                <tr>
                    <td class="auto-style41"></td>
                    <td class="auto-style7">
                        <asp:Button ID="Button1" runat="server" BackColor="#660033" ForeColor="White" OnClick="Button1_Click" Text="SUBMIT" />
                        <input id="Reset1" class="auto-style6" type="reset" value="RESET" /></td>
                    <td class="auto-style42"></td>
                </tr>

            </table>
        </div>
    </form>
</body>
</html>
