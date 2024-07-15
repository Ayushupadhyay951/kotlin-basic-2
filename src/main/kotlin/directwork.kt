fun main(){
    val items= listOf("Apple","Cherry","Blackberry","mango","jackfruit")

for (item in items){
    println("items is :$item")
}
for (index in items.indices){
    println("item at $index is ${items[index]}")
}
for((index, item) in items.withIndex()){
    println("item at $index is $item")
}
    val movies= listOf("Batman","wonderwoman","Ninjas turtles")
for (movie in movies){
    println("my favourite movie is:$movie")
}
    for (index in movies.indices){
        println("movie at $index is set rankwise")
    }
    for((index, movie)in movies.withIndex()){
        println("my movie at $index is : $movie")
    }
val Brand= listOf("Nike","Flicker","ZARA","DENIM","LEVI'S")
var index =0
    while (index<Brand.size){
        println("brand at $index is ${Brand[index]}")
    index++
    }
    //Rnages codes
    val x=100
    if(x in 1..100) {
        println("fits in range")
    }
    for( x in 1..5){
        println(x)
    }
    for(x in 10 downTo 0  step 1){
        println(x)
    }

    
}