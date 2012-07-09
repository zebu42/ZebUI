
grails.project.dependency.resolution = {

    log 'warn'
    inherits 'global'

    repositories {
        grailsCentral()
    }

    plugins {
        build(':release:2.0.3') { export = false }
    }
}
