package de.exceptionex3

import de.exceptionex3.controller.StudentManagement
import de.exceptionex3.model.Student
import de.exceptionex3.view.UI

fun main() {
    val ui = UI(StudentManagement(Student("bernd", 213123)))
    ui.start()
}