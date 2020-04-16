package com.in28minutes.junit.helper;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses( { ArrayCompareTest.class, QuickBeforeAfterTest.class} )
public class RunAll {
}
