import com.smnatsakanyan.service.OOP_version.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class userRequestToCoffeeMachineTester {

    @Test
    void buyTesterForCappuccino(){
        UserRequestToCoffeeMachine userRequestToCoffeeMachine = new UserRequestToCoffeeMachine(new Cappuccino());
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        userRequestToCoffeeMachine.buy(1,coffeeMachine);
        assertEquals(new CoffeeMachine(new Supplies(200,440,108,8),556),coffeeMachine);
    }

    @Test
    void buyTesterForEspresso(){
        UserRequestToCoffeeMachine userRequestToCoffeeMachine = new UserRequestToCoffeeMachine(new Espresso());
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        userRequestToCoffeeMachine.buy(1,coffeeMachine);
        assertEquals(new CoffeeMachine(new Supplies(150,540,104,8),554),coffeeMachine);
    }

    @Test
    void buyTesterForLatte(){
        UserRequestToCoffeeMachine userRequestToCoffeeMachine = new UserRequestToCoffeeMachine(new Latte());
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        userRequestToCoffeeMachine.buy(1,coffeeMachine);
        assertEquals(new CoffeeMachine(new Supplies(50,465,100,8),557),coffeeMachine);
    }

    @Test
    void buyTesterForThrowingException(){
        UserRequestToCoffeeMachine userRequestToCoffeeMachine = new UserRequestToCoffeeMachine(new Latte());
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        assertThrows(NotEnoughCoffeeException.class, () -> {
            userRequestToCoffeeMachine.buy(2,coffeeMachine);
        });
    }

}
