package `KotlinSOLID-main`.`KotlinSOLID-main`.StudentPortal

fun StudentPortal.Hosteller.roomFee():Float{
    return when(roomType){
        "AC"-> when(bedType){
            1 -> 90000.00f
            2 -> 75000.00f
            3 -> 60000.00f
            4 -> 50000.00f
            6 -> 40000.00f
            else -> 0.00f
        }
    
        "NONAC"-> when(bedType){
            1 -> 60000.00f
            2 -> 50000.00f
            3 -> 40000.00f
            4 -> 30000.00f
            6 -> 20000.00f
            else -> 0.00f
        }
    
        else->{
        println("Specified Type is not available")
        0.0f
        }
    }
}

fun StudentPortal.Hosteller.messFee():Float{
    return when(messType){
        "VEG" -> 35000.00f
        "NONVEG" -> 55000.00f
        "SPECIAL" -> 70000.00f
        else -> 0.00f
    }
}
