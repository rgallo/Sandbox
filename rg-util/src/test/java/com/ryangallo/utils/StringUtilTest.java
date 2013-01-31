package com.ryangallo.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ryangallo.gwtsafe.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testIsBlank() {
		assertTrue(StringUtil.isBlank(null));
		assertTrue(StringUtil.isBlank(""));
		assertTrue(StringUtil.isBlank(" "));
		assertFalse(StringUtil.isBlank("test"));
	}

}
