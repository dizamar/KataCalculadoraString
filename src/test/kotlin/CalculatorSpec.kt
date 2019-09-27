import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class CalculatorSpec : WordSpec() {
    init {
        "Si la entrada es vacia" should {
            "deberia retornar 0 "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma()
                //prueba
                resultado.shouldBe(0)
            }
        }

        "Si la entrada es un solo numero" should {
            "deberia retornar ese numero "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1")
                //prueba
                resultado.shouldBe(1)
            }
        }
        "Si la entrada entrada del usuario son dos numeros seprados por coma" should {
            "deberia retornar la suma de ambos numeros "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1,2")
                //prueba
                resultado.shouldBe(3)
            }
        }
        "Si la entrada del usuario es un numero desconocido de numeros separados por coma" should {
            "debe regresar la suma "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1,2,3,4")
                //prueba
                resultado.shouldBe(10)
            }
        }
        "Si la entrada del usuario son multiples numeros que usan comas y nuevas lineas" should {
            "debe regresar la suma de los numeros "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1,2,2," +
                        "3,4")
                //prueba
                resultado.shouldBe(12)
            }
        }
        "Si la entrada del usuario son varios numeros separados por un delimitador personalizado " should {
            "debe regresar la suma de los numeros "{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("1v2v3v4")
                //prueba
                resultado.shouldBe(10)
            }
        }

        "Si la entrada del usuario contiene numeros mayores a 1000" should {
            "debe regresar la suma de los numeros menores a 1001"{
                var sistemaBajoPrueba = Calculadora()
                var resultado = sistemaBajoPrueba.suma("800,1010,100")
                //prueba
                resultado.shouldBe("900")
            }
        }
    }
}

//    1. Dado que la entrada del usuario es vacia debe retornar cero.
//    2. Si la entrada del usaurio es un solo numero debe regresar ese numero
//    3. Si la entrada del usaurio son dos numeros separados por coma debe regresar la suma de los dos numeros
//    4. Si la entrada del usuario es un numero desconocido de numeros separados por coma debe regresar la suma
//    5. Si la entrada del usuario son multiples numeros que usan comas y nuevas lineas como delimitadores debe regresar la suma de los numeros
//    6. Si la entrada del usuario son varios numeros separados por un delimitador personalizado debe regresar la suma de los numeros (ejemplo “//;\n1;2” debe retornar 3)
//    7. Si la entrada del usuario contiene un numero negativo debe retornar una excepcion con el mensaje "negativos no permitidos: x" donde x es el negativo
//    8. Si la entrada del usuario contiene multiples negativos debe regresar una excepcion con el mensaje "negativos no permitidos: -x, -y, -z  donde x,y,z son negativos
//    9. Si la entrada del usuario contiene numeros mayores a 1000 debe regresar la suma de los numeros menores a 1001
//    10. Si la entrada del usuario son multiples numeros separados por un delimitador multicaracter personalizado debe regresar la suma de los numeros (ejemplo: “//[***]\n1***2***3” debe retornar 6)
//    11. Si la entrada del usaurio son multiples delimitadores personalizados debe retornar la suma de los numeros (ejemplo “//[*][%]\n1*2%3” debe retornar 6)+
