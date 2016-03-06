/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import java.util.Date;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FilterEntries {

	SimpleStringProperty category;
	SimpleIntegerProperty amount;
	SimpleStringProperty dt;

	public FilterEntries(int amount,String category, String dt )
	{
		this.category=new SimpleStringProperty(category);
		this.amount=new SimpleIntegerProperty(amount);
		this.dt=new SimpleStringProperty(dt);
	}

	public String getCategory()
	{
		return category.get();
	}

	public Integer getAmount()
	{
		return amount.get();
	}

	public String getDt()
	{
		return dt.get();
	}

	public void setCategory(String category)
	{
		this.category.set(category);
	}

	public void setAmount(Integer amount)
	{
		this.amount.set(amount);
	}

	public void setDate(String dt)
	{
		this.dt.set(dt);
	}
}
