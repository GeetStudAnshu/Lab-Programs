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
        if (Session["click1"] != null)
        {
            clickCount = (int)Session["click1"] + 1;
            TextBox1.Text = Convert.ToString(clickCount);
            Session["click1"] = clickCount;
        }
        else
        {
            TextBox1.Text = Convert.ToString(clickCount);
            Session["click1"] = clickCount;
        }
    }
}