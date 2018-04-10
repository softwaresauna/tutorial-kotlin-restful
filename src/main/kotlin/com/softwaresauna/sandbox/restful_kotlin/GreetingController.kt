package com.softwaresauna.sandbox.restful_kotlin

import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()


    @GetMapping("/greeting")
    fun greeting(
            @RequestParam(
                    value = "name",
                    defaultValue = "World")
            name: String) =

            Greeting(
                    counter.incrementAndGet(),
                    "Hello, $name")

}