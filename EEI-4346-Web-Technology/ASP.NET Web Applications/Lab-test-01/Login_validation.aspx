
<head>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            text-align: center;
        }
        .auto-style3 {
            color: #660066;
        }
        .auto-style4 {
            width: 147px;
        }
        .auto-style5 {
            color: #993399;
        }
        .auto-style7 {
            width: 147px;
            height: 26px;
            text-align: right;
        }
        .auto-style8 {
            height: 26px;
        }
        .auto-style9 {
            width: 147px;
            color: #660066;
            text-align: right;
        }
        .auto-style10 {
            width: 147px;
            text-align: right;
        }
        .auto-style11 {
            color: #999999;
        }
        .auto-style12 {
            color: #FF0000;
        }
        .auto-style13 {
            color: #FFFFFF;
            background-color: #660066;
            font-weight: bold;
        }
        </style>
</head>
<form id="form1" runat="server">
    <table class="auto-style1">
        <tr>
            <td class="auto-style4">&nbsp;</td>
            <td class="auto-style2">
                <h1>
                    <asp:Label ID="Label1" runat="server" CssClass="auto-style3" Text="PLACE YOUR ORDER"></asp:Label>
                </h1>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="cus_name" runat="server" Text="Customer Name" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="txt_name" runat="server"></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txt_name" CssClass="auto-style12" ErrorMessage="Customer Name is Required"></asp:RequiredFieldValidator>
                <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="txt_name" ErrorMessage="Alphebets Only" ValidationExpression="[a-zA-Z\s]+$" CssClass="auto-style12"></asp:RegularExpressionValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="address" runat="server" Text="Address" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="txt_address" runat="server"></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txt_address" CssClass="auto-style12" ErrorMessage="Address is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="p_code" runat="server" Text="Product Code" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="txt_pcode" runat="server" ></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="txt_pcode" CssClass="auto-style12" ErrorMessage="Product Code is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="quentity" runat="server" Text="Quantity" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="txt_quentity" runat="server" ></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="txt_quentity" CssClass="auto-style12" ErrorMessage="Quentity is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style9">&nbsp;</td>
            <td class="auto-style2">
                <h2>
                    <asp:Label ID="Label12" runat="server" CssClass="auto-style5" Text="Payment Process"></asp:Label>
                </h2>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="c_type" runat="server" Text="Select Card Type" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:DropDownList ID="DropDownList1" runat="server">
                    <asp:ListItem Value="VISA">Select Card Type</asp:ListItem>
                </asp:DropDownList>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style7">
                <asp:Label ID="c_number" runat="server" Text="Card Number" CssClass="auto-style3"></asp:Label>
            </td>
            <td class="auto-style8">
                <asp:TextBox ID="txt_card_num" runat="server" ></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" ControlToValidate="txt_card_num" CssClass="auto-style12" ErrorMessage="Card Number is Required"></asp:RequiredFieldValidator>
                <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" ErrorMessage="Must consist of 16 numbers"></asp:RegularExpressionValidator>
                </em>
            </td>
            <td class="auto-style8"></td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="ex_date" runat="server" Text="Expire Date" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="txt_exdate" runat="server"></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator6" runat="server" ControlToValidate="txt_exdate" CssClass="auto-style12" ErrorMessage="Expire Date is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style7">
                <asp:Label ID="cvc_num" runat="server" Text="CVC Number" CssClass="auto-style3"></asp:Label>
            </td>
            <td class="auto-style8">
                <asp:TextBox ID="txt_cvc" runat="server" ></asp:TextBox>
                <em>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator7" runat="server" ControlToValidate="txt_cvc" CssClass="auto-style12" ErrorMessage="CVC Number is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td class="auto-style8"></td>
        </tr>
        <tr>
            <td class="auto-style10">
                <asp:Label ID="card_name" runat="server" Text="Name on Card" CssClass="auto-style3"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="fname" runat="server" CssClass="auto-style11">First Name </asp:TextBox>
                &nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="lname" runat="server" CssClass="auto-style11" placeholder="Last Name">Last Name</asp:TextBox>
                <em>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator8" runat="server" ControlToValidate="fname" CssClass="auto-style12" ErrorMessage="First Name is Required"></asp:RequiredFieldValidator>
                <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:RequiredFieldValidator ID="RequiredFieldValidator9" runat="server" ControlToValidate="lname" CssClass="auto-style12" ErrorMessage="Last Name is Required"></asp:RequiredFieldValidator>
                </em>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style4">&nbsp;</td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="Submit1" type="submit" value="SUBMIT" class="auto-style13" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                <input id="Reset1" type="reset" value="RESET" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </td>
            <td>&nbsp;</td>
        </tr>
    </table>
</form>
