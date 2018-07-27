plugins {
    kotlin("jvm").version(Versions.kotlin)
    maven
}

maven{
    group = "com.atlassian.test.performance"
    version = "0.0.1-SNAPSHOT"
}

dependencies {
    compile("com.atlassian.performance.tools:jvm-tasks:0.0.1")
    compile(Libs.kotlinStandard)
    testCompile(Libs.junit)
    testCompile(Libs.hamcrest)
    Libs.log4jCore().forEach { compile(it) }
}