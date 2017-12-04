package Modal

class Triangle:Figure() {

    override fun countArea() {
        p = (a+b+c)/2
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c))
    }

    override fun countPer() {
        perimeter = a+b+c
    }
}