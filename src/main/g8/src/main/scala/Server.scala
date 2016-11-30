
import unfiltered.request.Path

object Server {
  def main(args: Array[String]) {
    unfiltered.jetty.Server.anylocal.context("/assets") {
      _.resources(Page.assets)
    }.plan(unfiltered.filter.Planify {
      case Path("/") => Page("iced venti soy")(Nil)(Nil)(
        <h1>
        <div>How do you like your <a href="http://coffeescript.org/">coffee</a>?</div>
        <div>Filtered or <a href="http://unfiltered.databinder.net/Unfiltered.html">unfiltered</a>?</div>
        </h1>)
    }).run
  }
}
