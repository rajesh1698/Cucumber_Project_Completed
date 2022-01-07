package com.SDPs;

import org.openqa.selenium.WebDriver;
import com.Pom_Automation.Address_Checkout;
import com.Pom_Automation.Bank_Page;
import com.Pom_Automation.Casual_Dress;
import com.Pom_Automation.Check_Out;
import com.Pom_Automation.Chiffon_AddtoCart;
import com.Pom_Automation.Chiffon_Bank;
import com.Pom_Automation.Chiffon_Checkout;
import com.Pom_Automation.Chiffon_Dress;
import com.Pom_Automation.Chiffon_Order;
import com.Pom_Automation.Confirm_Order;
import com.Pom_Automation.Dresses_Page;
import com.Pom_Automation.Home_Page;
import com.Pom_Automation.Logout_Page;
import com.Pom_Automation.Printed_Dress;
import com.Pom_Automation.Proceed_Checkout;
import com.Pom_Automation.Proceed_Checkout1;
import com.Pom_Automation.Product_Added;
import com.Pom_Automation.Shipping_Checkout;
import com.Pom_Automation.Shipping_Page;
import com.Pom_Automation.Signin_Button;
import com.Pom_Automation.Sleeve_Checkout;
import com.Pom_Automation.Sleeve_Tshirt;
import com.Pom_Automation.Tshirt_Address;
import com.Pom_Automation.Tshirt_Cart;
import com.Pom_Automation.Tshirt_Checkout;
import com.Pom_Automation.Tshirt_Order;
import com.Pom_Automation.Tshirt_Page;
import com.Pom_Automation.Tshirt_Payment;
import com.Pom_Automation.Tshirt_Shipping;
import com.Pom_Automation.Women_Dress;

public class Page_Object_Manager {
	public WebDriver driver;	
	private Home_Page hp;
	private Signin_Button sb;
	private Women_Dress wD;
	private Casual_Dress cd;
	private Printed_Dress pd;
	private Product_Added pa;
	private Check_Out co;
	private Proceed_Checkout pc;
	private Shipping_Page sp;
	private Bank_Page bp;
	private Confirm_Order cO;
	private Logout_Page lP;
	private Dresses_Page dP;
	private Chiffon_Dress cD;
	private Chiffon_AddtoCart cA;
	private Proceed_Checkout1 pC;
	private Chiffon_Checkout cc;
	private Address_Checkout aC;
	private Shipping_Checkout sC;
	private Chiffon_Bank cB;
	private Chiffon_Order Co;
	private Tshirt_Page tP;
	private Sleeve_Tshirt st;
	private Tshirt_Cart tC;
	private Sleeve_Checkout Sc;
	private Tshirt_Checkout Tc;
	private Tshirt_Address Ta;
	private Tshirt_Shipping Ts;
	private Tshirt_Payment Tp;
	private Tshirt_Order To;
	
	
	public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	}
	public Home_Page getInstancehp() {
		if (hp==null) {
			hp=new Home_Page(driver);
		}
		return hp;
	}
	public Signin_Button getInstancesB() {
		if (sb==null) {
			sb=new Signin_Button(driver);
		}
		return sb;
	}
	public Women_Dress getInstancewD() {
		if (wD==null) {
			wD=new Women_Dress(driver);
		}
		return wD;
	}
	public Casual_Dress getInstancecd() {
		if (cd==null) {
			cd=new Casual_Dress(driver);
		}
		return cd;
	}
	public Printed_Dress getInstancepd() {
		if (pd==null) {
			pd=new Printed_Dress(driver);
		}
		return pd;
	}
	public Product_Added getInstancepa() {
		if (pa==null) {
			pa=new Product_Added(driver);
		}
		return pa;
	}
	public Check_Out getInstanceco() {
		if (co==null) {
			co=new Check_Out(driver);
		}
		return co;
	}
	public Proceed_Checkout getInstancepc() {
		if (pc==null) {
			pc=new Proceed_Checkout(driver);
		}
		return pc;
	}
	public Shipping_Page getInstancesp() {
		if (sp==null) {
			sp=new Shipping_Page(driver);
		}
		return sp;
	}
	public Bank_Page getInstancebp() {
		if (bp==null) {
			bp=new Bank_Page(driver);
		}
		return bp;
	}
	public Confirm_Order getInstancecO() {
		if (cO==null) {
			cO=new Confirm_Order(driver);
		}
		return cO;
	}
	public Logout_Page getInstancelP() {
		if (lP==null) {
			lP=new Logout_Page(driver);
		}
		return lP;
	}
	public Dresses_Page getInstancedP() {
		if (dP==null) {
			dP=new Dresses_Page(driver);
		}
		return dP;
	}
	public Chiffon_Dress getInstancecD() {
		if (cD==null) {
			cD=new Chiffon_Dress(driver);
		}
		return cD;
	}
	public Chiffon_AddtoCart getInstancecA() {
		if (cA==null) {
			cA=new Chiffon_AddtoCart(driver);
		}
		return cA;
	}
	public Proceed_Checkout1 getInstancepC() {
		if (pC==null) {
			pC=new Proceed_Checkout1(driver);
		}
		return pC;
	}
	public Chiffon_Checkout getInstancecc() {
		if (cc==null) {
			cc=new Chiffon_Checkout(driver);
		}
		return cc;
	}
	public Address_Checkout getInstanceaC() {
		if (aC==null) {
			aC=new Address_Checkout(driver);
		}
		return aC;
	}
	public Shipping_Checkout getInstancesC() {
		if (sC==null) {
			sC=new Shipping_Checkout(driver);
		}
		return sC;
	}
	public Chiffon_Bank getInstancecB() {
		if (cB==null) {
			cB=new Chiffon_Bank(driver);
		}
		return cB;
	}
	public Chiffon_Order getInstanceCo() {
		if (Co==null) {
			Co=new Chiffon_Order(driver);
		}
		return Co;
	}
	public Tshirt_Page getInstancetP() {
		if (tP==null) {
			tP=new Tshirt_Page(driver);
		}
		return tP;
	}
	public Sleeve_Tshirt getInstancest() {
		if (st==null) {
			st=new Sleeve_Tshirt(driver);
		}
		return st;
	}
	public Tshirt_Cart getInstancetC() {
		if (tC==null) {
			tC=new Tshirt_Cart(driver);
		}
		return tC;
	}
	public Sleeve_Checkout getInstanceSc() {
		if (Sc==null) {
			Sc=new Sleeve_Checkout(driver);
		}
		return Sc;
	}
	public Tshirt_Checkout getInstanceTc() {
		if (Tc==null) {
			Tc=new Tshirt_Checkout(driver);
		}
		return Tc;
	}
	public Tshirt_Address getInstanceTa() {
		if (Ta==null) {
			Ta=new Tshirt_Address(driver);
		}
		return Ta;
	}
	public Tshirt_Shipping getInstanceTs() {
		if (Ts==null) {
			Ts=new Tshirt_Shipping(driver);
		}
		return Ts;
	}
	public Tshirt_Payment getInstanceTp() {
		if (Tp==null) {
			Tp=new Tshirt_Payment(driver);
		}
		return Tp;
	}
	public Tshirt_Order getInstanceTo() {
		if (To==null) {
			To=new Tshirt_Order(driver);
		}
		return To;
	}
}
