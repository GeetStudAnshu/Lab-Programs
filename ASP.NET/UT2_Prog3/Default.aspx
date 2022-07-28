<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Unit 2 | State Management</title>
</head>
<body>
    <form id="form1" runat="server">
    <div><center>
        <asp:Label ID="Label1" runat="server" Text="Hidden Field Example" />
        <br/><br/><br/>
        <asp:TextBox ID="TextBox1" runat="server" placeholder="Enter Fruit Name" />&nbsp;&nbsp;<asp:Button 
            ID="Button1" runat="server" Text="Submit" onclick="Button1_Click" />
        <br/><br/>
        <asp:HiddenField ID="HiddenField1" runat="server" />
        <asp:Label ID="Label2" runat="server" Text="" />
        <br/><br/>
        <asp:Button ID="Button2" runat="server" Text="Show Data" 
            onclick="Button2_Click" />
    </div>
    </form>
</body>
</html>
