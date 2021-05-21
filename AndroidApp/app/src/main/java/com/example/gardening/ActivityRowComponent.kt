package com.example.gardening

data class ActivityRowComponent(var aTitle:String, var aContent:String, var aCurrentParticipantNum:Int, var aFullParticipantNum:Int, var aParticipantName:String, var aDate:String, var aComment:String) {
    constructor():this("","",0,0,"","","")
}