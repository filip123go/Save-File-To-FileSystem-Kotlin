import java.io.File

open class WriteJsonToFileSystem {
    val fileName = """.\src\main\resources\employees.txt"""
    private val myFile = File(fileName)

    open fun writeJsonToFileSystem(employee: List<Employee>) {

        myFile.bufferedWriter().use { out ->
            employee.forEach {
                out.appendln("First Name :${it.firstName}")
                out.appendln("Last Name : ${it.lastName}")
                out.appendln("E-mail : ${it.email}")
                out.appendln("Salary : ${it.salary}")
                out.appendln(System.lineSeparator())
            }
        }
    }
}