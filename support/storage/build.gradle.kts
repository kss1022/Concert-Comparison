allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
    annotation("jakarta.persistence.MappedSuperclass")
}


dependencies{
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")

    implementation("org.redisson:redisson-spring-boot-starter:3.34.1")

    implementation("org.springframework.boot:spring-boot-starter-aop")

    runtimeOnly("com.h2database:h2")
    runtimeOnly ("com.mysql:mysql-connector-j")
}