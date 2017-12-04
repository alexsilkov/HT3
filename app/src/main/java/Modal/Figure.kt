package Modal
open class Figure {
    var a:Double=0.0
    var b:Double=0.0
    var c:Double = 0.0
    var perimeter:Double = 0.0
    var area:Double = 0.0
    var x:Double = 0.0
    var y:Double = 0.0
    var p = (a+b+c)/2

    open fun countPer(){
        perimeter = a+b
    }

    open fun countArea(){
        area = a*b
    }
}