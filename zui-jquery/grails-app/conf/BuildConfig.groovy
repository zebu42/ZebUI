
grails.project.dependency.resolution = {

    log 'warn'
    inherits 'global'

    repositories {
        grailsCentral()
    }

    plugins {
        build(":tomcat:$grailsVersion") { export = false }
        runtime(":resources:1.2-RC1") { export = false }
    }
}
