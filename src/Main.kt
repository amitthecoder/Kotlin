import java.io.File

fun main() {
    val filePath = "path/to/your/file.txt" // Replace with the path to the file you want to delete

    // Create a File object for the specified file
    val file = File(filePath)

    if (file.exists()) {
        // Try to delete the file
        if (file.delete()) {
            println("File deleted successfully.")
        } else {
            println("Failed to delete the file.")
        }
    } else {
        println("File does not exist.")
    }
}