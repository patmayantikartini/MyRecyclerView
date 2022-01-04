package com.example.myrecyclerview

import android.os.Parcel
import android.os.Parcelable

data class Hero(
    var name: String? = "",
    var detail: String? = "",
    var photo: Int = 0,
    var namaBunga: String? = "",
    var family: String? = "",
    var ordo: String? = "",
    var kingdom: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(detail)
        parcel.writeInt(photo)
        parcel.writeString(namaBunga)
        parcel.writeString(family)
        parcel.writeString(ordo)
        parcel.writeString(kingdom)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Hero> {
        override fun createFromParcel(parcel: Parcel): Hero {
            return Hero(parcel)
        }

        override fun newArray(size: Int): Array<Hero?> {
            return arrayOfNulls(size)
        }
    }
}
