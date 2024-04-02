fun main(){
    val car = Car("Toyota", "Hilux", "grey", 10)
    car.carry(15)

    car.identity()

    println(car.calculateParkingFees(3))

    val bus = Bus("Isuzu", "costa", "yellow", 50)
    println(bus.maxTripFare(200.40))
    println(bus.calculateParkingFees(8))


}




open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people <= capacity) {
            println("Carrying $people passengers")
        }
        else{
            var x = people - capacity
            println("overcapacity by $x people")

        }
    }

    fun identity(){
        println("I am a  $color $make $model")
    }

    open fun calculateParkingFees(hours:Int): Int{
        var fees = hours * 20
        return fees

    }



}

class Bus( make:String,  model:String, color:String, capacity:Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double): Double{
        var m = fare * capacity
        return m
    }

    override fun calculateParkingFees(hours:Int): Int{
        var fees = hours * capacity
        return fees

    }

}
