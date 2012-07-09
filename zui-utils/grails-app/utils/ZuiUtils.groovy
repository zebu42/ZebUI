
import org.codehaus.groovy.grails.commons.ApplicationHolder as AH

class ZuiUtils {

  static def getPluginManager() {
    AH.application.mainContext.pluginManager
  }

  static def getPluginVersion(def pluginName) {
    getPluginManager().getGrailsPlugin(pluginName).version
  }

  static def getResourceVersion(def resourceName) {
    getPluginVersion(resourceName)[0..-3]
  }
}
