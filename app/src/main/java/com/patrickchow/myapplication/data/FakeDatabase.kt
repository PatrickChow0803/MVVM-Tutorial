package com.patrickchow.myapplication.data

//private constructor makes it so that the instructor can't be invoked outside of this class
class FakeDatabase private constructor(){

    var quoteDao = FakeQuoteDao()
        private set

    companion object{
        //Volatile - Writes to this are made visible to other threads
        @Volatile private var instance: FakeDatabase?= null

        fun getInstance() =
                instance ?: synchronized(this){
                    instance ?: FakeDatabase().also { instance = it }
                }
    }
}