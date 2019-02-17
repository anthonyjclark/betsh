package betsh

import com.betsh.BetshBaseListener
import com.betsh.BetshParser
import java.util.*

class ProgramListener : BetshBaseListener() {

    var bashString: String = ""
    var stack: Stack<String> = Stack()

    override fun enterDeclaration(ctx: BetshParser.DeclarationContext) {
        bashString += "${ctx.IDENTIFIER()}="
    }

    override fun enterArithmetic(ctx: BetshParser.ArithmeticContext) {
        bashString += "\$(("
    }

    override fun exitArithmetic(ctx: BetshParser.ArithmeticContext) {
        bashString += "${stack.pop()}))\n"
    }

    override fun enterString(ctx: BetshParser.StringContext?) {
//        bashString += "\""
    }

    override fun exitString(ctx: BetshParser.StringContext?) {
//        bashString += "\"\n"
    }

    override fun exitBinaryOp(ctx: BetshParser.BinaryOpContext) {
        val right = stack.pop()
        val left = stack.pop()
        val op = ctx.op.text
        stack.push("$left $op $right")
    }

    override fun exitNumber(ctx: BetshParser.NumberContext) {
        stack.push(ctx.NUMBER().toString())
    }

    override fun exitIdentifier(ctx: BetshParser.IdentifierContext) {
        stack.push("\$${ctx.IDENTIFIER().toString()}")
    }

    override fun exitParenthesized(ctx: BetshParser.ParenthesizedContext) {
        stack.push("(${stack.pop()})")
    }

    override fun exitStringExpression(ctx: BetshParser.StringExpressionContext?) {
        bashString += ctx?.STRING().toString()
    }
}
