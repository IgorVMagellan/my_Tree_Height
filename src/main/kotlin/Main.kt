import java.lang.Math.floor
import java.lang.Math.tan

fun main() {

    println(
        """
        Расчет высоты дерева(объекта) одним из методов тригонометрии 
Условия: 
1. Смартфон с откалиброванным на вертикаль акселерометром
2. Строго горизонтальный взгляд попадает на само дерево (не ниже комля и не выше верхушки) 

Подготовка:
1. Измерить длину своего обычного шага в сантиметрах
2. Запустить приложение, измеряющее углы. Например "Уровень" в ~Smart ToolBox~, выбрать "Уровень лазера"
""")
    val mySizeNormalWalkingPaceSm = 76.0F // мой обычный прогулочный шаг в сантиметрах
    val numPI = 3.1415 // число Пи

    println("Наведитесь перекрестием на верхушку дерева")
    println("Введите угол, целое число без знака: ")
    val radAngle1 = (inputValidInteger() * numPI) / 180 // получить угол в радианах
    //val radAngle1 = readln().toFloat() * numPI / 180 // получить угол в радианах

    println("Наведитесь перекрестием на основание дерева")
    println("Введите угол (целое число): ")
    val radAngle2 = (inputValidInteger() * numPI) / 180 // получить угол в радианах

    println("Дойдите до дерева обычным шагом и введите количество шагов: ")
    val mySteps = readln().toFloat()  // нет проверки корректости ввода

    val objectDistanceMeter = (mySizeNormalWalkingPaceSm / 100) * mySteps // мои шаги в метрах
    val tanAngle1: Double = tan(radAngle1) * objectDistanceMeter
    val tanAngle2: Double = tan(radAngle2) * objectDistanceMeter

    val resultHeight = floor((tanAngle1 + tanAngle2) * 100.0) / 100.0 // округление до 2х знаков пз

    //println("\nВысота дерева (объекта) = ${tanAngle1 + tanAngle2}")
    println("\nВысота дерева (объекта) = $resultHeight м")

}

fun inputValidInteger(): Int {
    // Возвращает пользовательский ввод, если он Integer и корректен
    // если нет - возвращает null
    val numInputted = readLine()?.toIntOrNull()
    if (numInputted != null)
        return (numInputted)
    else
        println("Ожидается ввод числа!\nПопробуйте снова.")
    System.exit(0) // обойдемся без циклов, просто выход из программы
    return (0)
}