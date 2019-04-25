package skeleton;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSceneraio {
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> list=dataTable.asLists();
		for(List<String>list2:list) {
			for(String s:list2)
			{
				System.out.println(s+"\t");
			}
			System.out.println();
		}
	    
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage(List<String> s) {
		for(String string:s)
			System.out.println(string);
	   
	}


}
