package cust;
import java.sql.*;
public class Func
{
	public int Log(String uname,String pwd)
	{
		int i=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			ResultSet res=st.executeQuery("select * from Details;");
			while(res.next())
			{
				if(uname.equals(res.getString(1))&&pwd.equals(res.getString(5)))
				{
					i=1;
					break;
				}
			}
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return i;
	}
	public int RegisCheck(String uname,String pwd,String mn,String dob,String eid)
	{
		int i=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			ResultSet res=st.executeQuery("select * from Details;");
			while(res.next())
			{
				if(uname.equals(res.getString(1)))
				{
					i=4;
					return i;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		if(mn.length()!=10)
		{
			i=1;
			return i;
		}
		return i;
	}
	public int Regis(String uname,String pwd,String mn,String dob,String eid)
	{
		int r=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			r=st.executeUpdate("insert into Details values('"+uname+"','"+mn+"','"+dob+"','"+eid+"','"+pwd+"');");
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return r;
	}
	public int Comp(String uname,String comp,int s)
	{
		int r=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			r=st.executeUpdate("insert into Complaints values('"+s+"','"+comp+"','"+uname+"');");
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return r;
	}
	public int CNo()
	{
		int r=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			ResultSet res=st.executeQuery("select * from Complaints;");
			while(res.next())
			{
				r=res.getInt(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return r;
	}
	public int payCheck(String CNum,int cvv)
	{
		int i=0,c=0,cvv1=cvv;
		while(cvv1!=0)
		{
			cvv1/=10;
			c++;
		}
		if(CNum.length()<12||CNum.length()>19)
		{
			i=1;
			return i;
		}
		else if(c!=3)
		{
			i=2;
			return i;
		}
		return i;
	}
	public int PID()
	{
		int r=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			ResultSet res=st.executeQuery("select * from Paid;");
			while(res.next())
			{
				r=res.getInt(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return r;
	}
	public int PayIns(int s,String uname,String date,String units,String price)
	{
		int r=0;
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			r=st.executeUpdate("insert into Paid values('"+s+"','"+uname+"','"+date+"','"+units+"','"+price+"');");
			st.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return r;
	}
	public String DueDate(String uname)
	{
		String s="";
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c=DriverManager.getConnection("jdbc:sqlite:D:\\Amrut\\Databases\\Jsp Project\\Cust.db");
			Statement st=c.createStatement();
			ResultSet res=st.executeQuery("select * from Deadline where UserName='"+uname+"';");
			while(res.next())
			{
				s=res.getString(1);
			}
		}
		catch(Exception e)
		{
			System.out.println("Caught");
		}
		return s;
	}
	public float price(int u)
	{
		float i;
		if(u<500)
		{
			i=(float) (u*4.45);
			return i;
		}
		else
		{
			i=(float) ((500*4.45) +((u-500)*5.45));
			return i;
		}
	}
}