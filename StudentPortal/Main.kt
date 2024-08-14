package StudentPortal

fun main() {
    val students = mutableListOf(
        // Dayscholar with PrivateTransport
        Students("20MIS1134", "Tejas", 25, MIA(), 4000, 8.6f, Dayscholar(PrivateTransport())),
        Students("20MIS1054", "Namra", 22, MIS(), 7800, 8.2f, Dayscholar(PrivateTransport())),
        Students("20BCE1023", "Ravi", 23, BCE(), 15000, 7.8f, Dayscholar(PrivateTransport())),
        Students("20BCS1045", "Anita", 24, BCS(), 50000, 9.1f, Dayscholar(PrivateTransport())),
        Students("20BPS1078", "Kiran", 21, BPS(), 30000, 8.4f, Dayscholar(PrivateTransport())),

        // Dayscholar with CollegeBus (AC)
        Students("20MIS1134", "Tejas", 25, MIA(), 4000, 8.6f, Dayscholar(CollegeBus(4.5f, BusType.AC))),
        Students("20MIS1054", "Namra", 22, MIS(), 7800, 8.2f, Dayscholar(CollegeBus(10f, BusType.AC))),
        Students("20BCE1023", "Ravi", 23, BCE(), 15000, 7.8f, Dayscholar(CollegeBus(15f, BusType.AC))),
        Students("20BCS1045", "Anita", 24, BCS(), 50000, 9.1f, Dayscholar(CollegeBus(20f, BusType.AC))),
        Students("20BPS1078", "Kiran", 21, BPS(), 30000, 8.4f, Dayscholar(CollegeBus(25f, BusType.AC))),

        // Dayscholar with CollegeBus (NONAC)
        Students("20MIS1134", "Tejas", 25, MIA(), 4000, 8.6f, Dayscholar(CollegeBus(4.5f, BusType.NONAC))),
        Students("20MIS1054", "Namra", 22, MIS(), 7800, 8.2f, Dayscholar(CollegeBus(10f, BusType.NONAC))),
        Students("20BCE1023", "Ravi", 23, BCE(), 15000, 7.8f, Dayscholar(CollegeBus(15f, BusType.NONAC))),
        Students("20BCS1045", "Anita", 24, BCS(), 50000, 9.1f, Dayscholar(CollegeBus(20f, BusType.NONAC))),
        Students("20BPS1078", "Kiran", 21, BPS(), 30000, 8.4f, Dayscholar(CollegeBus(25f, BusType.NONAC))),

        // Hosteller with different Room and Mess combinations
        Students("20MIS1134", "Tejas", 25, MIA(), 4000, 8.6f, Hosteller(Room(RoomType.AC, 1), Mess(MessType.VEG))),
        Students("20MIS1054", "Namra", 22, MIS(), 7800, 8.2f, Hosteller(Room(RoomType.AC, 2), Mess(MessType.NONVEG))),
        Students("20BCE1023", "Ravi", 23, BCE(), 15000, 7.8f, Hosteller(Room(RoomType.AC, 3), Mess(MessType.SPECIAL))),
        Students("20BCS1045", "Anita", 24, BCS(), 50000, 9.1f, Hosteller(Room(RoomType.NONAC, 4), Mess(MessType.VEG))),
        Students("20BPS1078", "Kiran", 21, BPS(), 30000, 8.4f, Hosteller(Room(RoomType.NONAC, 6), Mess(MessType.NONVEG))),
        Students("20MIS1099", "Sita", 22, MIS(), 10000, 8.9f, Hosteller(Room(RoomType.NONAC, 1), Mess(MessType.SPECIAL))),
        Students("20MIA1100", "Raj", 24, MIA(), 25000, 7.5f, Hosteller(Room(RoomType.AC, 2), Mess(MessType.VEG))),
        Students("20BCE1111", "Priya", 23, BCE(), 60000, 9.3f, Hosteller(Room(RoomType.AC, 3), Mess(MessType.NONVEG)))
    )

    students.forEach {
        it.studentFees = it.studentType.studentFees() + Academics(it.studentRank).studentFees()
        println(it.printDetails())
    }

    val staff = mutableListOf(
        Staffs("12SDS","Ravi",24,Professor(22),StaffDepartment.Professor)
    )

    staff.forEach {
        it.staffSalary = it.staffDesignation.calculateSalary()
        print(it.staffSalary)
    }
}

