package org.example

class Person {
    def test() {
        if(this.y) {
            println(this.y)
        } else {
            println("Nothing found")
        }
    }
}

println("Hello,world!")
/**
 * var - evaluated when it is assigned
 * def evaluated when it is called
 * use var for variables and def for function expression or declaration
 * */
var numbers = [1,2,3,4,5]
numbers << 6
numbers.forEach {println it}

def squares = numbers.collect { it*it}

def person = [name: "Alice", age: 30]
person.surname = "Smith"
def alice = new Person()
def bob = new Person()
alice.metaClass.y = "Alice"
alice.test()
//    bob.test()
def letters = 'a'..'e'

(0..5).each {println it}

new File("exmaple.txt").eachLine {println it}

binding.setVariable("a", 10)
def f (){
    def a = (int)binding.getVariable("a")
    return a + 10
}
println(f())