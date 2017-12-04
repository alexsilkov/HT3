package Modal

class Rectangle:Figure() {
    override fun countPer() {
        perimeter = 2*(a+b)
    }

    override fun countArea() {
        area = a*b
    }
}