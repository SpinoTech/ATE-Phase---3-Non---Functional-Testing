package REST_Assured.Scenario_2;

import utils.modules;

public class testCase001 {

	public static void main(String[] args) throws InterruptedException {
		modules mod=new modules();
		
		mod.init("https://dummy.restapiexample.com/");  /// Using the following URL: https://dummy.restapiexample.com/
		Thread.sleep(1000);
		mod.getEmpData("/api/v1/employees"); /// Writing a REST API code to GET all the employee data
		mod.getEmpDataByID("/api/v1/employee", 1); /// Writing a REST API code to GET all employee data by ID
		mod.updateByID("/api/v1/update", 2 , "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}"); ///Write a code to create a PUT request that will update employee data
		mod.DeleteByID("/api/v1/delete", 3); /// Write a code to delete employee record
	}

}
