import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class lab2_siTest {
    private <T> List<String> newArrayList(List<T> asList) {
        return  new ArrayList<>(Arrays.asList());
    }

    @Test
    void everyStatmentTest()
    {
        IllegalArgumentException ex;
        ex= assertThrows(IllegalArgumentException.class, () ->lab2_si.function(newArrayList(Arrays.asList())));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex=assertThrows(IllegalArgumentException.class, () ->lab2_si.function(new ArrayList(Arrays.asList("7","8","9","10","11"))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
    }



}

