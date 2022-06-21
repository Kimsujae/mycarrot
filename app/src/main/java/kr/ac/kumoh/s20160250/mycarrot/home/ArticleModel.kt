package kr.ac.kumoh.s20160250.mycarrot.home

data class ArticleModel(
    val sellerId: String,
    val title: String,
    val createdAt: Long,
    val price: String,
    val imageUrl: String
){
    constructor() :this("","",0,"","")
}