dependencies{
    implementation(project(":platform"))
    implementation(project(":support:storage"))

    implementation(project(":domain:performance"))
    implementation(project(":domain:maps"))

    compileOnly("org.springframework:spring-context")
    compileOnly("org.springframework:spring-tx")
    compileOnly("org.springframework.boot:spring-boot-starter-data-jpa")
}