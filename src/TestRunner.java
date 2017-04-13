public class TestRunner {
   public static void main(String[] args) {
      //Result result = JUnitCore.runClasses(MathApplicationTester.class);
      
      /*for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      
      System.out.println(result.wasSuccessful());*/
      User.UserBuilder userBuilder = new User.UserBuilder("Amit","Kumar");
      userBuilder.age(22);
      User user = userBuilder.build();

   }
}  	