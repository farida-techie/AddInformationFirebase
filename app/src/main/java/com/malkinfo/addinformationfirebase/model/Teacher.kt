package com.malkinfo.addinformationfirebase.model

import com.google.firebase.database.Exclude

data class Teacher(
    var name:String? = null,
    var imageUrl:String? = null,
    var description:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null

)