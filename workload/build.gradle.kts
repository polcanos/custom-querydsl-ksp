plugins {
    id("com.google.devtools.ksp")
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":processor"))
    ksp(project(":processor"))
}

ksp {
    arg("option1", "value1")
    arg("option2", "value2")
}