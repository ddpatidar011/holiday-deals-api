package com.tgt.holidaydeal

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.tgt.holidaydeal")
		.start()
}

