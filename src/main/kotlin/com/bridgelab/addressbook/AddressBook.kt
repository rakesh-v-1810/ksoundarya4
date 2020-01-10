package com.bridgelab.addressbook

class AddressBook {
    val personCollection = ArrayList<Person>()

    fun getNumberOfPerson(): Int {
        return personCollection.size
    }

    fun addPerson() {

        val id = readLine()!!.toInt()
        val firstName = readLine()!!.toString()
        val lastName = readLine()!!.toString()
        val houseNumber = readLine()!!.toString()
        val street = readLine()!!.toString()
        val locality = readLine()!!.toString()
        val city = readLine()!!.toString()
        val state = readLine()!!.toString()
        val zipCode = readLine()!!.toString()
        val phoneNumber = readLine()!!.toString()

        personCollection.add(Person(
                id = id,
                name = Name(firstName, lastName),
                address = Address(houseNumber, street, locality, city, state, zipCode
                ),
                phoneNumber = phoneNumber
        ))

    }

    fun getFullNameOfPerson(index : Int) : String {
        val person : Person = personCollection.get(index)
        return person.name.toString()
    }



}
