package com.vyng.benchmark

import android.util.Log
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.vyng.core.binarySearch
import com.vyng.core.linearSearch
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Benchmark, which will execute on an Android device.
 *
 * The body of [BenchmarkRule.measureRepeated] is measured in a loop, and Studio will
 * output the result. Modify your code to see how it affects performance.
 */
@RunWith(AndroidJUnit4::class)
class CoreUtilsBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    val input = IntArray(100000){it}

    var key = 9999

    @Test
    fun linearSearchTest() {
        benchmarkRule.measureRepeated {
            linearSearch(input,key)
            key--
        }
    }

    @Test
    fun binarySearchTest() {
        benchmarkRule.measureRepeated {
            binarySearch(input,key)
            key--
        }
    }
}