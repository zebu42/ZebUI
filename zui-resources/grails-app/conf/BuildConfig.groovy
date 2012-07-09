
grails.project.dependency.resolution = {

    log 'warn'
    inherits 'global'

    repositories {
        grailsCentral()
    }

    plugins {
        runtime ':resources:1.2-RC1'
        runtime ':zipped-resources:1.0'
        runtime ':cached-resources:1.0', ':cache-headers:1.1.5'

        build(':release:2.0.3') { export = false }
    }
}
