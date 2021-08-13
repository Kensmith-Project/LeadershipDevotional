package com.polish.leadershipdevotional

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.polish.leadershipdevotional.adapter.LeadershipDevotionalAdapter
import com.polish.leadershipdevotional.model.LeadershipDevotionalEntity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    // creates an instance of the activity
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    val LIST_ITEM_IN_TEST = 0
    val DEVOTION_IN_TEST = LeadershipDevotionalEntity.leaderDevotionalData[LIST_ITEM_IN_TEST]

    /**
     * Recyclerview comes into view
     */
    @Test
    fun test_isListActivityVisible_onAppLaunch(){
        onView(withId(R.id.activity_main_myRecyclerview_rv)).check(matches(isDisplayed()))
    }

    @Test
    fun test_selectListItem_isDetailActivityVisible(){
        onView(withId(R.id.activity_main_myRecyclerview_rv))
            .perform(actionOnItemAtPosition<LeadershipDevotionalAdapter.LeadershipDevotionalViewHolder>(LIST_ITEM_IN_TEST, click()))

        onView(withId(R.id.activity_detailed_bible_ref_tv)).check(matches(withText(DEVOTION_IN_TEST.bibleRef)))
    }

    /**
     * select list item, nav to DetailActivity
     * pressBack
     */
    @Test
    fun test_backNavigation_toDevotionListActivity(){
        onView(withId(R.id.activity_main_myRecyclerview_rv))
            .perform(actionOnItemAtPosition<LeadershipDevotionalAdapter.LeadershipDevotionalViewHolder>(LIST_ITEM_IN_TEST, click()))

        onView(withId(R.id.activity_detailed_bible_ref_tv)).check(matches(withText(DEVOTION_IN_TEST.bibleRef)))

        pressBack()

        onView(withId(R.id.activity_main_myRecyclerview_rv)).check(matches(isDisplayed()))
    }

}