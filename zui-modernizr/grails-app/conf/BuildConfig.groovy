
grails.project.dependency.resolution = {

    log 'warn'
    inherits 'global'

    repositories {
        mavenLocal()
        grailsCentral()
    }

    plugins {
        compile ':zui-utils:0.1'
        runtime ':zui-resources:0.1'

        build(':release:2.0.3') { export = false }
        build(":tomcat:$grailsVersion") { export = false }
    }
}
