
class Comercial(nombre : String, edad : Int, salario  : Double,  PLUS : Double = 300.0, var comision  : Double): Empleado(nombre, edad, salario, PLUS) {

    override fun plus(): Double {
        if(edad>30 && comision>200){
          salario = salario + PLUS
            return salario
        }else{
          salario = salario;
            return salario
        }

    }

}