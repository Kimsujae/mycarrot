package kr.ac.kumoh.s20160250.mycarrot.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
){
    constructor(): this("","")
}