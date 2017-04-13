import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   //@InjectMocks annotation is used to create and inject the mock object


   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @InjectMocks
   MathApplication mathApplication = new MathApplication();

   @Test
   public void testAdd(){
      //mathApplication.setCalculatorService(calcService);
      //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.0);
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

      //verify(calcService).add(20.0, 30.0);
   }
}