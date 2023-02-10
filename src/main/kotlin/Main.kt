fun main() {
     if (Job().recruiting) println("Lucky") else println("UnLucky")
    val Programmer1=Programmer("Amr" ,20,true)
    if (Programmer1.recruiting) println("Lucky") else println("UnLucky")

}

// region What happend in class programmer ( Constructor ) ?
//فى الاول انا عرفت متغير من نوع boolean اسمه recruiting و خليته ب false فى كلاس اسمه Job
// واستدعيته هنا فى ال main
// فانا محتاج اغيره واخليه ب true  باستخدام كلاس تانى اسمه programmer
// طب ازاي هاستخدم متغير ف كلاس هو مش متعرف فيه ؟
// عن طريق ال ( Inheritance)
//  class programmer inherited from class Employee
//  class Employee inherited from class Job (Multi Inheritance)
//  in class Programmer , I used the (override) concept to make the "recrument" variable return true not false
// So that make the Programmer available to recrumention
//endregion

