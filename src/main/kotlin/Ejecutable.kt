class Ejecutable {

    fun Iniciar(){

        val comercial = Comercial("Carlos", 31, 500000.0, 300.0, 250.0 )

        val repartidor = Repartidor("Rafael", 20, 2000000.0, 300.0,  "zona 3")

        println(comercial.plus())

        println(repartidor.plus())


    }

}