package courses

class String_kt {

    fun function1() {
        var str = "hello"

        str.get(2)
        str[2]

    }

    fun function2() {
        var str = "hello"

        str.compareTo("Hello", ignoreCase = true)
        str.equals("Hello", ignoreCase = true)
        str.contentEquals("hello")

    }

    fun function3() {
        var str: String = "hello"



        str.substring(1, 4)
        str.substring(1..3)

        str.substringBefore("l")
        str.substringBeforeLast("l")
        str.substringAfterLast("l")

    }
    fun function4() {
        var str = "hello"

        str.subSequence(0..3)
        var seq: CharSequence =  str

    }

}
