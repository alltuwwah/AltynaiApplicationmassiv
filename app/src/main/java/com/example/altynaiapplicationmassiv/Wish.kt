package com.example.altynaiapplicationmassiv

import java.io.Serializable
import java.net.IDN

data class Wish(
     var id : Int,
     var name:String,
     var decriprion: String,
     var flag: Boolean
):Serializable