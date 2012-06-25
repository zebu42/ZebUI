class ZuiModernizrGrailsPlugin {

    def version = '2.5.3.0'

    def grailsVersion = '2.0 > *'

    def pluginExcludes = [
        'grails-app/views/layouts/application.gsp',
        'grails-app/views/error.gsp',
        'grails-app/views/index.gsp',
    ]

    def title = 'ZebUI Modernizr Plugin'
    def author = 'Zebu42'
    def authorEmail = 'Zebu42@gmail.com'
    def description = 'http://modernizr.com/'

    def license = 'GPL3'
    def documentation = 'https://github.com/zebu42/ZebUI/wiki'
    def issueManagement = [ url: 'https://github.com/zebu42/ZebUI/issues' ]
    def scm = [ url: 'https://github.com/zebu42/ZebUI' ]
}
