/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import com.mycompany.facebookhomework.FacebookLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author m_gab
 */
public class LoginTest {
   FacebookLogin log;//<editor-fold defaultstate="collapsed" desc="comment">
    
    
    public LoginTest() {
//</editor-fold>
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testLogin() {
     log = new FacebookLogin( "jonsmith2022@gmail.com", "ProjectF2022" );
     assertEquals("jonsmith2022@gmail.com", log.getEmail());
     assertEquals("ProjectF2022", log.getPassword());
     }
}
