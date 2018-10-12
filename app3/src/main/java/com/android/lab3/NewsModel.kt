package com.android.lab3

import android.os.Parcel
import android.os.Parcelable

data class NewsModel(
        var title: String,
        var text: String): Parcelable{
        //var image: String) : Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()
            //parcel.readString()
        )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(text)
        //parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }


    companion object CREATOR : Parcelable.Creator<NewsModel> {
        override fun createFromParcel(parcel: Parcel): NewsModel {
            return NewsModel(parcel)
        }

        override fun newArray(size: Int): Array<NewsModel?> {
            return arrayOfNulls(size)
        }
    }
}