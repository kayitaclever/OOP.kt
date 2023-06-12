fun main() {

    var currentState1= CurrentState("Sad","Wet")
    println(currentState1.musicComposition())
    var currentState2= CurrentState("Happy","Wet")
    var food= Food(2,20.0)
    println(food.predictTaste())
    println(food.predictTexture())

}

//You are a music composer known for creating music that adapts to the listener's
//emotions and surroundings. You want to develop a software system that analyzes the
//listener's mood and environment to predict the type of music that would best suit their
//current state. Think about the classes you'll need to model the music compositions and how
//to predict the appropriate musicbased on mood and environment.

//this is using only one class

class CurrentState(var mood:String,var environment:String) {
    fun musicComposition(): List<Any> {
        if (mood == "Happy" && environment == "Dry") {


            var musicComposition = mutableListOf<Any>("Hippop", "Emineem", "60")

            return musicComposition

        } else if (mood == "Happy" && environment == "Wet") {
            var musicComposition = mutableListOf<Any>()
        } else {
            var musicComposition = mutableListOf<Any>("RNB", "Chrissbrown", "30")
            return musicComposition
        }

        return musicComposition()
    }


}
//You are a chef specializing in fusion cuisine, and you've discovered that certain ingredients react
//differently when combined based on the temperature and cooking time. You want to create a softwareco
//system that predicts the taste and texture of a dish based on the combination of ingredients, cooking
//temperature, and time. Think about the classes you'll need to model the ingredients, cooking process, and
//how to predict the final result.
//

class Food (var cookingTime:Int, var temperature:Double ){
    fun predictTaste():String{
    if (cookingTime>=1 && temperature>= 13.9){
        var food= "Sweet"
        return food
    }

else{
    var food = "salty"
    return food
    }
    }

    fun predictTexture():String{
        if(cookingTime>=1 && temperature>=13.9){
            var food = "Crunchy"
            return food
        }
        else{
            var food ="Smooth"
            return food
        }

    }
}

