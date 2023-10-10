package com.example.practice15

import android.os.Parcel
import android.os.Parcelable

class Animal() : Parcelable{

    private var breed: String = ""
    private var year: Int = 0
    private var month: Int = 0

    constructor(parcel: Parcel) : this() {
        breed = parcel.readString().toString()
        year = parcel.readInt()
        month = parcel.readInt()
    }

    constructor(_breed : String, _year : Int, _month : Int) : this() {
        breed = _breed
        year = _year
        month = _month
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(breed)
        parcel.writeInt(year)
        parcel.writeInt(month)
    }

    fun getBreed() : String {
        return breed
    }
    fun setBreed(_breed : String) {
        breed = _breed
    }

    fun getYear() : Int {
        return year
    }
    fun setYear(_year: Int) {
        year = _year
    }

    fun getMonth() : Int {
        return month
    }
    fun setBreed(_month: Int) {
        month = _month
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }
}