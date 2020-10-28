package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Pergunta 1?",
            R.drawable.ic_launcher_background,
            "Resposta A",
            "Resposta B",
            "Resposta C",
            "Resposta 4",
            1
        )

        questionsList.add(que1)
        return questionsList

    }

}