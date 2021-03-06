/* A functional language has these characteristics:

• Functional programs are made up of functions.
• A function always returns a value.
• A function, given the same inputs, will return the same values.
• Functional programs avoid changing state or mutating data.
Once you’ve set a value, you have to leave it alone.
*/

// SCALA TYPES

println("Hello, surreal World")

1 + 1

(1).+(1)

5 + 4 * 3

5.+(4.*(3))

(5).+((4).*(3))

// Everything is an object in Scala, with some small exceptions.

// STRINGS

"abc".size

// Forcing a type collision:

"abc" + 4

4 + "1.0"

// 4 * "abc"
// => ERROR

// Scala is strongly typed.
// It uses type inference.
// Unlike Ruby, Scala can do that type checking at compile time.

// ----

// EXPRESSIONS AND CONDITIONS

val a = 1
val b = 2

if(b < a){
  println("true")
} else {
  println("false")
}

// Unlike Ruby, Scala binds types at compile time.
// But unlike Java, Scala can infer the type, so you don’t have to
// type val a : Int = 1, though you can if you want.

// val is immutable; var is not

// ----

Nil
// Nil.type = List()

// if(Nil) {println("true")}
// => ERROR

// Nil is an empty list, and you can’t even test Nil or 0.
// This behavior is consistent with Scala’s strong, static typing philosophy.

// ----

// LOOPS

def whileLoop {
	var i = 1
	while(i <= 3) {
		println(i)
		i += 1
	}
}
// In Scala, public is the default visibility.

def forLoop {
	println("for loop using Java-style iteration")
	for(i <- until args.length) {
		println(args(i))
	}
}

def rubyStyleForLoop {
	println("for loop using Ruby-style iteration")
	args.foreach { arg =>
		println(arg)
	}
}

// args is a list with the inbound command-line arguments
// In Ruby would be: args.each {|arg| println(arg)}

// RANGES AND TUPLES

val range = 0 until 10

range.start

range.end

range.step
// increments

(0 to 10) by 5
(0 to 10) by 6

// the equivalent of Ruby's range, 1..10, is 1 to 10
// the equivalent of Ruby's range, 1...10, is 1 until 10
// to is inclusive:
(0 until 10 by 5)

// you can also specify direction:

val range = (10 until 0) by -1

// direction is not inferred:
(10 until 0)
// range: Range = Range()

// inclusive
val range = (0 to 10)

// you are not limited to integers:
val range = 'a' to 'e'

// tuple is a fixed-length set of objects/collection
val person = ("Elvis", "Presley")

person._1
person._2
person._3
//error

// Scala uses tuples to do multivalue assignments:
val (x, y) = (1, 2)

