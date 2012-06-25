
import org.codehaus.groovy.grails.commons.ApplicationHolder as AH

def pluginManager = AH.application.mainContext.pluginManager
def jqueryVersion = pluginManager.getGrailsPlugin('zui-jquery').version[0..-3]

def jqueryWrapper = {
  """<script src="//ajax.googleapis.com/ajax/libs/jquery/$jqueryVersion/jquery.min.js"></script>
        <script>window.jQuery || document.write('${it.replace('</', '<\\/')}')</script>"""
}

modules = {
  jquery {
    resource id: 'jquery', url: "/js/jquery-${jqueryVersion}.min.js", wrapper: { jqueryWrapper(it) }
  }
}
