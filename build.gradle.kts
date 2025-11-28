group = "org.huhu"
version = "0.0.1"

plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenLocal()
    maven { url = uri("https://maven.aliyun.com/repository/public/") }
    mavenCentral()
}

dependencies {
    testImplementation(platform(libs.org.junit.junit.bom))
    testImplementation(platform(libs.org.mockito.mockito.bom))
    testImplementation(platform(libs.org.assertj.assertj.bom))
    testRuntimeOnly(libs.org.junit.platform.junit.platform.launcher)
    testImplementation(libs.bundles.test.util)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
