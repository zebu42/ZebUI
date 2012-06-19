
import org.codehaus.groovy.grails.commons.ApplicationHolder as AH

def jqueryVersion = AH.application.mainContext.pluginManager.getGrailsPlugin('zui-jquery').version

def jqueryWrapper = {
  """<script src="//ajax.googleapis.com/ajax/libs/jquery/$jqueryVersion/jquery.min.js"></script>
        <script>window.jQuery || document.write('${it.replace('</', '<\\/')}')</script>"""
}

modules = {
  jquery {
    resource id: 'jquery', url: "/js/jquery-${jqueryVersion}.min.js", wrapper: { jqueryWrapper(it) }
  }
}
