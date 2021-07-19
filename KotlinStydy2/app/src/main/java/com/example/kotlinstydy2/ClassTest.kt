package com.example.kotlinstydy2

//open은 상속을 위해 필요한 기능
open class ClassTest constructor(var test : String = "default값 지정가능") { //constructor는 생략가능

    //이것도 생략이 가능하다
    private val name = test //위의 생성자로 받아올 수 있음

    //코드블록 생성
    init {
        println("생성이 되면 실행됨")
    }

    //부생성자 는 this로 위의 생성자에서 받아오는 매개변수를 가져와야함
    //주 생성자가 없으면 this는 하지 않음!
    constructor(test:String, test2:Int) : this(test){
        println("$test , $test2")
    }

    open fun testFun(){
        println("메소드")
    }
}

//상속은 : 을 붙이면 됨
class ClassTest2 : ClassTest(){
    override fun testFun(){ //오버라이드 할때도 부모 클래스에서 open필요
        //부모 클래스 메소드 호출
        super.testFun()
        test = "요로케 상속해서 사용가능"
    }
}