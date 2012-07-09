
grails.project.dependency.resolution = {

    log 'warn'
    inherits 'global'

    repositories {
        mavenLocal()
        grailsCentral()
    }

    plugins {
        compile ':zui-utils:0.1'

        build(':release:2.0.3') { export = false }
        build(":tomcat:$grailsVersion") { export = false }

        runtime(':resources:1.2-RC1') { export = false }
        runtime(':zipped-resources:1.0') { export = false }
        runtime(':cached-resources:1.0', ':cache-headers:1.1.5') { export = false }
    }
}
