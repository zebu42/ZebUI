
def jqueryVersion = ZuiUtils.getResourceVersion('zui-jquery')

def jqueryWrapper = {
  """<script src="//ajax.googleapis.com/ajax/libs/jquery/$jqueryVersion/jquery.min.js"></script>
        <script>window.jQuery || document.write('${it.replace('</', '<\\/')}')</script>"""
}

modules = {
  jquery {
    resource id: 'js', url: "/js/jquery-${jqueryVersion}.min.js", wrapper: { jqueryWrapper(it) }
  }
}
