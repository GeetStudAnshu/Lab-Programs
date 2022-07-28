<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Unit 2 | State Management</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <center><asp:Label ID="Label1" runat="server" Text="View State Example" Font-Names="sans-serif"></asp:Label>
        <br /><br /><br />
        <asp:Label ID="Label2" runat="server" Text="Enter Name" Font-Names="sans-serif" />
        <asp:TextBox ID="TextBox1" runat="server" Font-Names="sans-serif"/>
        <br /><br />
        <asp:Button ID="Button1" runat="server" Text="Clear" onclick="Button1_Click" />
        &nbsp;<asp:Button ID="Button2" runat="server" Text="Display" 
                onclick="Button2_Click" />
            <br /><br />
            <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
        </center>
    </div>
    </form>
    
</body>
</html>
