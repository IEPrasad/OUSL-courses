<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="PS1_Practce.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Practice PS1</title>

    <style>
        .sample {
            color:red;
            font-size: 33px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div class="sample">
            <% Response.Write("Hello world...!"); %>
            <br />
            <% Response.Write("The sum of 2 and 3 is: " + ( 2 + 3)); %>
            <br/>
        </div>
        
        <%Response.Write("PHP can't run with the .NET, so we can't use php inside the <?php ___?> tag"); %>

      
    </form>

    <script> 
        //alert("Hello this is an alert!");
    </script>

</body>
</html>
