package br.dipievil.appgeometric

class Triangle(width: Double, height: Double, var hipotenusa: Double) : GeoForm(width, height) {

    override fun CalculateArea(): Double {
        return super.CalculateArea() /2
    }

    override fun CalculatePerimeter(): Double {
        return base + height + hipotenusa
    }
}