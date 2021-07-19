package com.example.kotlinstydy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //array
        val arrayTest = arrayOf(1,2,3) //자동으로 Int형 배열 생성

        //List
        //1. List(읽기만 가능), MutableList(읽기 쓰기 가능)
        val listTest = listOf<Any>(1,"쌉가능", 11L)

        //arrayList
        fun litTest(){
            val arrayListTest = arrayListOf<Int>(1,2,3,4) //arrayList
            //추가 삭제 등등은 자바와 동등
            arrayListTest.add(5) //추가
            arrayListTest[0] //0번지 데이터 가져오기기

       }

        //for문 step
        for (test in arrayTest){
            Log.d(TAG, "숫자 : ${test.toString()}")
        }

        for( test in 1..3 step 2){
            Log.d(TAG, "숫자 : ${test.toString()}")
        }

        //10부터 1까지 downTo
        for( i in 10 downTo 1){
            Log.d(TAG, "숫자 : ${i.toString()}")
        }

        //1부터 10까지 10을 포함하지 않음 until
        for( i in 1 until 10){
            Log.d(TAG, "숫자 : ${i.toString()}")
        }

        //index와 데이터를 같이
        for((index, name) in arrayTest.withIndex()){
            Log.d(TAG, "index ${index} , name ${name}")
        }

        // !! -> NonNull
        fun testNull(test : String?){
            val t = test!! //컴파일러에게 null이 올리가 없다고 알려줌 이때 !!사용
        }

        //let
        val tEmail:String? = "xorud8241@naver.com"
        tEmail?.let {
            //Null체크해서 이게 null이 아니면 let내부 코드를 실행
            Log.d(TAG, "null이면 실행 안됨요~")
        }

    }
}