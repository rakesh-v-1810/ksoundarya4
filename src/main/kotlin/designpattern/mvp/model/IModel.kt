package designpattern.mvp.model

import java.io.File

interface IModel {

    fun readStudent(file : File) : Students
    fun saveStudent(file : File , student : Student)
    fun addStudent(student : Student)
    fun removeStudent(student: Student)
}