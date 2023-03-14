fun main() {
    val phones = listOf("iPhone 13", "Samsung S21", "Pixel 3", "Redmi Note 5")
    val people = listOf("Dirk", "Sam", "Matt", "Josh")
    
    phone@ for (myPhone in phones){ //this loops through the list of phones
        for(phoneOwner in people){
            if(phoneOwner == "Josh" && myPhone == "Redmi Note 5"){
                println("$phoneOwner actually owns $myPhone")
                break@phone
            }
            println("Does $phoneOwner own a $myPhone?")
        }
   
    }
}
