
import org.codehaus.groovy.grails.commons.ApplicationHolder as AH

def pluginManager = AH.application.mainContext.pluginManager
def modernizrVersion = pluginManager.getGrailsPlugin('zui-modernizr').version[0..-3]

modules = {
  modernizr {
    resource id: 'modernizr', url: "/js/modernizr-${modernizrVersion}.js", disposition: 'head'
  }
}
