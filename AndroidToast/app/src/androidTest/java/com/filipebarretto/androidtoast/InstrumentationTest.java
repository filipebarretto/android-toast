package com.filipebarretto.androidtoast;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import com.filipebarretto.androidtoast.custom.ToastMatcher;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static org.hamcrest.Matchers.not;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class InstrumentationTest {

    private CountDownLatch lock = new CountDownLatch(1);

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void yodaButtonClick() throws Exception {
        lock.await(2000, TimeUnit.MILLISECONDS);
        onView(withId(R.id.biscoitoButton)).perform(click());

        onView(withText(R.string.biscoito_toast)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));

    }

    @Test
    public void vaderButtonClick() throws Exception {
        lock.await(2000, TimeUnit.MILLISECONDS);
        onView(withId(R.id.bolachaButton)).perform(click());

        onView(withText(R.string.bolacha_toast)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));

    }


}