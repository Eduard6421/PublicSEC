/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTesting.Controllers;

import Controllers.EmployeesController;
import Models.Employee;
import Utils.GlobalData;
import java.util.List;
import javafx.util.Pair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduard
 */
public class EmployeesControllerTest {

    public EmployeesControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of registerEmployee method, of class EmployeesController.
     */
    
     /**
     * Test of getAverageRating method, of class EmployeesController.
     */
    @Test
    public void testGetAverageRating1()
    {
        System.out.println("getAverageRating");
        int id = 0;
        Double expResult = 0d;
        Double result = EmployeesController.getAverageRating(id);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetAverageRating2()
    {
        System.out.println("getAverageRating");
        int id = 1;
        Double expResult = 5d;
        Double result = EmployeesController.getAverageRating(id);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testGetAverageRating3()
    {
        System.out.println("getAverageRating");
        int id = 2;
        boolean expResult = true;
        boolean result = (EmployeesController.getAverageRating(id) != 0d);
        assertEquals(expResult, result);
        
    }
        

    /**
     * Test of getByAccount method, of class EmployeesController.
     */
    @Test
    public void testGetByAccount1() {
        System.out.println("getByAccount");
        String username = "";
        String password = "";
        Employee expResult = null;
        Employee result = EmployeesController.getByAccount(username, password);
        assertEquals(expResult, result);
    }
   @Test
    public void testGetByAccount2() {
        System.out.println("getByAccount");
        String username = "employee1";
        String password = "employee1";
        boolean expResult = true;

        Employee result = EmployeesController.getByAccount(username, password);
        boolean trueResult = (result != null);

        assertEquals(expResult, trueResult);
    }
   @Test
    public void testGetByAccount3() {
        System.out.println("getByAccount");
        String username = "";
        String password = ";OR 1=1";
        Employee expResult = null;
        Employee result = EmployeesController.getByAccount(username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getByUsername method, of class EmployeesController.
     */
    @Test
    public void testGetByUsername1() {
        System.out.println("getByUsername");
        String username = "0";
        Employee expResult = null;
        Employee result = EmployeesController.getByUsername(username);
        assertEquals(expResult, result);
    }
       @Test
    public void testGetByUsername2() {
        System.out.println("getByUsername");
        String username = "employee1";
        boolean expResult = true;
        Employee result = EmployeesController.getByUsername(username);
        boolean trueResult = result!= null;
        
        assertEquals(expResult, trueResult);
    }
       @Test
    public void testGetByUsername3() {
        System.out.println("getByUsername");
        String username = "%";
        Employee expResult = null;
        Employee result = EmployeesController.getByUsername(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of getById method, of class EmployeesController.
     */
    @Test
    public void testGetById1() {
        System.out.println("getById");
        int id = 0;
        Employee expResult = null;
        Employee result = EmployeesController.getById(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetById2() {
        System.out.println("getById");
        int id = 1;
        boolean expResult = true;
        Employee result = EmployeesController.getById(id);
        boolean trueResult = (result!= null);
        
        assertEquals(expResult, trueResult);
    }
    

    /**
     * Test of changePassword method, of class EmployeesController.
     */
      
    /**
     * Test of updateData method, of class EmployeesController.
     */
    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String email = "";
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = EmployeesController.updateData(email, phoneNumber);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAll method, of class EmployeesController.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");

        GlobalData.setCompanyName("Firma1");
        List<Employee> result = EmployeesController.getAll(GlobalData.getCompanyName());
        boolean trueResult = result.isEmpty();
        boolean expResult = false;
        assertEquals(expResult, trueResult);

    }

    /**
     * Test of getAllOnlyGeneralData method, of class EmployeesController.
     */
    @Test
    public void testGetAllOnlyGeneralData() throws Exception {
        System.out.println("getAll");
        List<Pair<Integer, String>> result = EmployeesController.getAllOnlyGeneralData();
        boolean trueResult = result.size() != 0;
        boolean expResult = true;
        assertEquals(expResult, trueResult);

    }
}
