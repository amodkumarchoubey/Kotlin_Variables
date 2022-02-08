# Kotlin_Variables
KotlinApp


Kotlin Variable
Variable refers to a memory location. It is used to store data. The data of variable can be changed and reused depending on condition or on information passed to the program.

Variable Declaration
Kotlin variable is declared using keyword var and val.

var language ="Java"  
val salary = 30000  
The difference between var and val is specified later on this page.

Here, variable language is String type and variable salary is Int type. We don't require specifying the type of variable explicitly. 
Kotlin complier knows this by initilizer expression 




We can also explicitly specify the type of variable while declaring it.

var language: String ="Java"  
val salary: Int = 30000  
It is not necessary to initialize variable at the time of its declaration. Variable can be initialized later on when the program is executed.

var language: String  
... ... ...  
language = "Java"  
val salary: Int  
... ... ...  
salary = 30000  
Difference between var and val
var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
val (Immutable variable): We cannot change the value of variable which is declared using val keyword.
Example

var salary = 30000  
salary = 40000 //execute  
Here, the value of variable salary can be changed (from 30000 to 40000) because variable salary is declared using var keyword.

val language = "Java"  
language = "Kotlin" //Error  
Here, we cannot re-assign the variable language from "Java" to "Kotlin" because the variable is declared using val keyword.












