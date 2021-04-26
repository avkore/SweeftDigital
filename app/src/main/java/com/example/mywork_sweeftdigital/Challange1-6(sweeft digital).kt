package com.example.mywork_sweeftdigital

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) }
    }
//სავარჯიშო 1
fun isPalindrome(word: String): Boolean {
    val Upperword = word.toUpperCase().replace(" ", "")
    val Reverse_Upperword=word.toUpperCase().replace(" ", "").reversed()
    return Upperword==Reverse_Upperword
}

//სავარჯიშო 2
fun minSplit(amount: Int): Int {
    var quantity = 0
    var amount = amount
    while(amount/50>0){
        amount -= 50
        quantity += 1}
    while(amount/20>0){
        amount -= 20
        quantity += 1}
    while(amount/10>0){
        amount -= 10
        quantity += 1}
    while(amount/5>0){
        amount -= 5
        quantity += 1}
    while(amount/1>0){
        amount -= 1
        quantity += 1}

    return quantity
}

//სავარჯიშო 3
fun notContains(array: Array<Int>): Int {
    var x = 1
    while(x in array) x+=1
    return x
}


//სავარჯიშო 4
fun count(s: String, s1: String): Int {
    return s.length - s.replace(s1, "").length
}

fun isProperly(text: String): Boolean {
    val x = count(text, ")")
    val y = count(text, "(")
    val text_new = text.replace("()", "")
    val SymbolList = listOf<String>("(", ")")
    val SequenceList = mutableListOf<String>()

    for (each in text_new) {
        if (each.toString() in SymbolList)
            SequenceList.add(each.toString()) }

    if (SequenceList.size % 2 == 0)
        if (x == y)
            if(text_new[0].toString() == "(" && text_new[SequenceList.size-1].toString() == ")")

                return true

    return false

}

//სავარჯიშო 5
fun countVariants(count: Int): Int {
    return if (count <= 2)
        count
    else
        (countVariants(count - 1) + countVariants(count - 2))
}


//სავარჯიშო 6
class DataStructure{
    val NumList: ArrayList<Int> = ArrayList()
    val hashmap: HashMap<Int, Int> = HashMap()

    fun add(x: Int){
        var length = NumList.size
        if(hashmap.get(x) != null)
            return
        else{
            NumList.add(x)
            hashmap.put(x, length)
        }
    }


    fun remove(x: Int){
        var position: Int? = hashmap.get(x)
        var size = NumList.size
        var last_element = NumList.get(size-1)

        if(position == null)
            return
        else{
            hashmap.remove(x)
            Collections.swap(NumList, position!!, size-1)
            NumList.remove(size-1)
            hashmap.put(last_element, position)
        }

    }
}

















