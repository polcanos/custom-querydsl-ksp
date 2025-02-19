val kspVersion: String by project

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup:kotlinpoet:2.0.0")
    implementation("com.google.devtools.ksp:symbol-processing-api:$kspVersion")
}