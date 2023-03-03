def call(){
   String test = "my test"
   println("this is "+test+".")
   sh "echo Hello World, This is me"
}

def sum(){
   int a = 3;
   float b = 8.4;
   
   println(a+b)
   sh "echo this is my sum"
}