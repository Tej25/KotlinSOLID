package StudentPortal

fun main(){
    var students = mutableListOf(
        Students("20MIS1134","Tejas",25,MIS(),4000,8.6f,Hosteller(Room(RoomType.AC,3), Mess(MessType.SPECIAL))) ,
        Students("20MIS1134","Tejas",25,MIA(),4000,8.6f,Dayscholar(CollegeBus(4.5f,BusType.AC))),
        Students("20MIS1134","Tejas",25,MIA(),4000,8.6f,Dayscholar(PrivateTransport()))
    )

    students.forEach{
        println(it.studentType.studentFees() + Academics(it.studentRank).studentFees())
    }


    println(getDepartmentClassCount(MIA()))
}