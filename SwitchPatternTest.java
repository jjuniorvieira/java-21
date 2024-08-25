import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchPatternTest {

    @Test
    void givenDifferentSwitchPattern_whenCalledBoth_thenReturnTheSameResult() {
        SwitchPattern.SavingsAccount sa = new SwitchPattern.SavingsAccount();
        SwitchPattern.TermAccount ta = new SwitchPattern.TermAccount();
        SwitchPattern.CurrentAccount ca = new SwitchPattern.CurrentAccount();

        assertEquals(SwitchPattern.getBalanceWithOutSwitchPattern(sa), SwitchPattern.getBalanceWithSwitchPattern(sa));
        assertEquals(SwitchPattern.getBalanceWithOutSwitchPattern(ta), SwitchPattern.getBalanceWithSwitchPattern(ta));
        assertEquals(SwitchPattern.getBalanceWithOutSwitchPattern(ca), SwitchPattern.getBalanceWithSwitchPattern(ca));
    }
}