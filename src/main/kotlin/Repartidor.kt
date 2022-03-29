
class Repartidor(nombre : String, edad : Int, salario  : Double, PLUS : Double = 300.0, var zona  : String): Empleado(nombre, edad, salario, PLUS) {


    override fun plus(): Double  {

        if(edad<25 && zona == "zona 3"){
            salario = salario + PLUS
            return salario
        }else{
            salario = salario;
            return salario
        }

    }


}