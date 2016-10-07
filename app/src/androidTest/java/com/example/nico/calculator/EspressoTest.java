package com.example.nico.calculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.ViewAssertion;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
    public void activityIsVisible() {
        onView(withId(R.id.layout)).check(matches(isDisplayed()));
    }

    @Test
    public void button1IsVisible() {
        onView(withId(R.id.b1)).check(matches(isDisplayed()));
    }

    @Test
    public void button2IsVisible() {
        onView(withId(R.id.b2)).check(matches(isDisplayed()));
    }

    @Test
    public void button3IsVisible() {
        onView(withId(R.id.b3)).check(matches(isDisplayed()));
    }

    @Test
    public void button4IsVisible() {
        onView(withId(R.id.b4)).check(matches(isDisplayed()));
    }

    @Test
    public void button5IsVisible() {
        onView(withId(R.id.b5)).check(matches(isDisplayed()));
    }

    @Test
    public void button6IsVisible() {
        onView(withId(R.id.b6)).check(matches(isDisplayed()));
    }

    @Test
    public void button7IsVisible() {
        onView(withId(R.id.b7)).check(matches(isDisplayed()));
    }

    @Test
    public void button8IsVisible() {
        onView(withId(R.id.b8)).check(matches(isDisplayed()));
    }

    @Test
    public void button9IsVisible() {
        onView(withId(R.id.b9)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonClearIsVisible() {
        onView(withId(R.id.clear)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonDivIsVisible() {
        onView(withId(R.id.div)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonMinIsVisible() {
        onView(withId(R.id.min)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonMultIsVisible() {
        onView(withId(R.id.mult)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonAddIsVisible() {
        onView(withId(R.id.add)).check(matches(isDisplayed()));
    }

    @Test
    public void buttonEqIsVisible() {
        onView(withId(R.id.eq)).check(matches(isDisplayed()));
    }

}
