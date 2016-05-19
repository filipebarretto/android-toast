package com.filipebarretto.androidtoast;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.RunWith;

import android.support.test.espresso.Root;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import android.widget.Toast;

import com.filipebarretto.androidtoast.custom.ToastMatcher;

import junit.framework.TestSuite;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.core.deps.guava.base.CharMatcher.is;
import static org.hamcrest.Matchers.not;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
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
        onView(withId(R.id.yodaButton)).perform(click());

        onView(withText(R.string.yoda_toast)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));

    }

    @Test
    public void vaderButtonClick() throws Exception {
        lock.await(2000, TimeUnit.MILLISECONDS);
        onView(withId(R.id.vaderButton)).perform(click());

        onView(withText(R.string.vader_toast)).inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));

    }


}