plugins {
    id("java")
    id("war")
}
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    // Source: https://mvnrepository.com/artifact/jakarta.ws.rs/jakarta.ws.rs-api
    // puede dar conflicto de versiones porque al usar las versiones distintas,
    // solo hay q dejar que use unicamente las del servidor
    compileOnly("jakarta.ws.rs:jakarta.ws.rs-api:4.0.0")

    // Source: https://mvnrepository.com/artifact/commons-collections/commons-collections
    implementation("commons-collections:commons-collections:3.2.2")
}
