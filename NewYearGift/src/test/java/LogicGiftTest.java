import com.academy.candy.Bounty;
import com.academy.candy.Candy;
import com.academy.candy.Mars;
import com.academy.candy.Nuts;
import com.academy.logic.gift.GiftService;
import com.academy.logic.gift.GiftServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class LogicGiftTest {

    private GiftService giftService;

    @Before
    public void init() {

        giftService = new GiftServiceImpl();

        giftService.addCandyWithGift(new Bounty());

        giftService.addCandyWithGift(new Mars());

        giftService.addCandyWithGift(new Nuts());
    }

    @Test
    public void givenGift_whenGiftNotNull_thenСalculationWeight() {

        double expected = 43;

        double actual = giftService.getGiftWeight();

        Assert.assertEquals(expected, actual, 1e-15);

    }

    @Test
    public void givenAmountOfSugar_whenSpecifiedRangeOfSugar_thenReturnCandies() {

       List<Candy> expected = new ArrayList<>();

       expected.add(new Bounty());

       List<Candy> actual = giftService.findCandyBySugar(5, 7);

       Assert.assertArrayEquals(expected.toArray(),actual.toArray());

    }

   }
