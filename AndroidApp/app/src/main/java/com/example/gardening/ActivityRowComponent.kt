package com.example.gardening

data class ActivityRowComponent(var aId:Int, var aTitle:String, var aContent:String, var aCurrentParticipantNum:Int, var aFullParticipantNum:Int, var aParticipantName:String, var aDate:String, var aComment:String, var selected:Int) {
    constructor():this(-1,"","",0,0,"","","", 0)
}