
abstract class Empleado(var nombre : String, var edad : Int, var salario  : Double, var PLUS : Double = 300.0) {

    abstract fun plus(): Double

}