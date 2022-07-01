package br.dipievil.appgeometric

/*
class GeoForm(width: Double, height: Double ) {
    var width: Double = 0.0
    var height: Double = 0.0

    init {
        this.width = width
        this.height = height
    }
}
*/

open class GeoForm(width: Double, height: Double ) {
    var area : Double = 0.0
    var height: Double = 0.0
    var base: Double = 0.0
    init {
        this.height = height
        this.base = width
        area = width * height;
    }

    open fun CalculateArea(): Double{
        return base * height;
    }

    open fun CalculatePerimeter(): Double{
        return (base + height) * 2;
    }
}
