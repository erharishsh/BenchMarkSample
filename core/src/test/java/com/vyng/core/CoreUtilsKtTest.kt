package com.vyng.core

import org.junit.Assert.*
import org.junit.Test

class CoreUtilsKtTest{



    @Test
    fun search() {
        val array = IntArray(1000){it}
        val result = linearSearch(array,-1)
        assertTrue(result)
    }


    @Test
    fun binarySearch() {
        val array = IntArray(1000){it}
        val result = linearSearch(array,999)
        assertTrue(result)
    }



}

