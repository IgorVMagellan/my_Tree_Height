import java.lang.Math.tan

fun main() {

    println(
        """
        Расчет высоты дерева(объекта) одним из методов тригонометрии 
Условия: 
1. Смартфон с откалиброванным акселерометром
2. Строго горизонтальный взгляд попадает на само дерево (не ниже комля и не выше верхушки) 

Подготовка:
1. Измерить длину своего обычного шага в сантиметрах
2. Запустить приложение, измеряющее углы. Например "Уровень" в ~Smart ToolBox~, выбрать "Уровень лазера"
"""
    )
    val mySizeNormalWalkingPaceSm = 69.0F // мой обычный прогулочный шаг в сантиметрах
    val PI = 3.1415 // число Пи

    println("Наведитесь перекрестием на верхушку дерева")
    println("Введите угол, число без знака: ")
    val radAngle1 = readln().toFloat() * PI / 180 // получить угол в радианах

    println("Наведитесь перекрестием на основание дерева")
    println("Введите угол: ")
    val radAngle2 = readln().toFloat() * PI / 180 // получить угол в радианах

    println("Дойдите до дерева обычным шагом и введите количество шагов: ")
    val mySteps = readln()

    val objectDistanceMeter = (mySizeNormalWalkingPaceSm / 100) * mySteps.toFloat()
    val tanAngle1: Double = tan(radAngle1) * objectDistanceMeter
    val tanAngle2: Double = tan(radAngle2) * objectDistanceMeter

    /*    println("tanAngle1 = $tanAngle1")
        println("tanAngle2 = $tanAngle2")*/

    println("\nВысота дерева (объекта) = ${tanAngle1 + tanAngle2}")

}