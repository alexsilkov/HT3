package Modal

class Circle: Figure() {
    override fun countArea() {
        area = a*a*3.14
    }

    override fun countPer() {
        perimeter = 6.28*a
    }
}