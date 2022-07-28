using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Default2 : System.Web.UI.Page
{
    int clickCount = 0;
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            TextBox1.Text = Convert.ToString(clickCount);
        }
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (Application["click"] != null)
        {
            clickCount = (int)Application["click"] + 1;
            TextBox1.Text = Convert.ToString(clickCount);
            Application["click"] = clickCount;
        }
        else
        {
            TextBox1.Text = Convert.ToString(clickCount);
            Application["click"] = clickCount;
        }
    }
}