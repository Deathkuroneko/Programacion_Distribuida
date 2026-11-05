plugins {
    id("java")
    id("application")
}

version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    // Source: https://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-core
    implementation("org.jboss.resteasy:resteasy-core:7.0.5.Final")
    // Source: https://mvnrepository.com/artifact/org.jboss.resteasy/resteasy-undertow
    implementation("org.jboss.resteasy:resteasy-undertow:7.0.5.Final")

}
