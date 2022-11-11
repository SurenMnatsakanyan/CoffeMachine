import com.smnatsakanyan.service.OOP_version.AdminRequest;
import com.smnatsakanyan.service.OOP_version.CoffeeMachine;
import com.smnatsakanyan.service.OOP_version.Supplies;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class AdminRequestTester {

    @Test
    void fillValueTesterByProvidingSupplies(){
        CoffeeMachine coffeeMachine = spy(CoffeeMachine.class);
        final int waterMl = 250;
        final int milkMl = 240;
        final  int coffeeMg = 10;
        final int coffeeCups = 10;
//        doCallRealMethod().when(coffeeMachine).setSupplies(any(Supplies.class));
        coffeeMachine.setSupplies(new Supplies(waterMl,milkMl,coffeeMg,coffeeCups));
        verify(coffeeMachine,times(1)).setSupplies(new Supplies(waterMl,milkMl,coffeeMg,coffeeCups));
    }

    @Test
    void takeMoneyAfterStateIsZero(){
        CoffeeMachine coffeeMachine = mock(CoffeeMachine.class);
        ArgumentCaptor<Integer> valueCaptured = ArgumentCaptor.forClass(Integer.class);
        final int money = 0;
        doCallRealMethod().when(coffeeMachine).setMoney(valueCaptured.capture());
        coffeeMachine.setMoney(money);
        verify(coffeeMachine,times(1)).setMoney(money);
        assertEquals(0,valueCaptured.getValue());
    }

}
