package io.jwinwood.dailychallenge2

import java.util.*

const val ProblemStatement: String = "Given an array of integers, return a new array such that each element at index i " +
        "of the new array is the product of all the numbers in the original array except the one at i.\n"

fun main() {
    println(ProblemStatement)

    var input = arrayOf(1, 2, 3, 4, 5)
    var result = productOfArrayExcludingIndex(input)
    printArray(result)

    input = arrayOf(3, 2, 1)
    result = productOfArrayExcludingIndex(input)
    printArray(result)
}

private fun productOfArrayExcludingIndex(input: Array<Int>): Array<Int> {
    var result = emptyArray<Int>()

    input.forEach { n ->
        result = result.plus(
            input.filterNot { it == n }
                 .reduce {acc, i -> acc * i }
        )
    }

    return result
}

private fun <T> printArray(array: Array<T>) {
    println(Arrays.toString(array))
}