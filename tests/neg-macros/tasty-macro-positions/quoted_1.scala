import scala.quoted._

import scala.tasty._

object Macros {

  inline def fun(x: Any): Unit = ${ impl('x) }

  def impl(x: Expr[Any]) given (qctx: QuoteContext): Expr[Unit] = {
    import qctx.tasty._
    val pos = x.unseal.underlyingArgument.pos
    error("here is the the argument is " + x.unseal.underlyingArgument.show, pos)
    error("here (+5) is the the argument is " + x.unseal.underlyingArgument.show, pos.sourceFile, pos.start + 5, pos.end + 5)
    '{}
  }

}
