
def modernizrVersion = ZuiUtils.getResourceVersion('zui-modernizr')

modules = {
  modernizr {
    resource id: 'js', url: "/js/modernizr-${modernizrVersion}.js", disposition: 'head'
  }
}
