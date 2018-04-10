# Kotlin Spring-Boot tutorial

This was made following [this tutorial](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html).

However, it refused to run, so we modified it. Not it should run.

Fixes:

- the default Gradle version should be updated: set the `gradle/wrapper/gradle-wrapper.properties` property `distributionUrl` to `https\://services.gradle.org/distributions/gradle-4.7-rc-1-all.zip` (or newer)
- the Kotlin version in `build.gradle` should be downgraded to `1.1.3`, otherwise Gradle will search in `/src/main/java` for the main class