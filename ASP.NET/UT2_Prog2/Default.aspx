<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Unit 2 | State Management</title>
</head>
<body>
    <form id="form1" runat="server">
    <div><center>
        <asp:Label ID="Label1" runat="server" Text="Query String Example" /><br /><br /><br />
        <asp:TextBox ID="TextBox1" runat="server" placeholder="Enter Name"></asp:TextBox>
        <br /><br />
        <asp:TextBox ID="TextBox2" runat="server" placeholder="Enter Course Name"></asp:TextBox>
        <br /><br />
        <asp:Button ID="Button1" runat="server" Text="Go Next" 
            onclick="Button1_Click" />
    </center></div>
    </form>
</body>
</html>
