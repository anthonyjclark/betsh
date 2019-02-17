package betsh

import com.betsh.*

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker



fun main(args : Array<String>) {

    val input_string = """
        let variable1 = 12;
        let x = 1 + 2 * 3 - 4 ^ 5 ^ (6 + 7 * 8) + variable1;
        let some_string = "hello";""".trimIndent()
    val input = CharStreams.fromString(input_string)
//    ANTLRInputStream
    val lexer = BetshLexer(input)

    val tokens = CommonTokenStream(lexer)
    val parser = BetshParser(tokens)

    val listener = ProgramListener()
    val tree = parser.program()
    ParseTreeWalker.DEFAULT.walk(listener, tree)

    println(listener.bashString)
}
