package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Quem sou eu?",
            R.drawable.pergunta1,
            "Leonardo Oshima, 21 anos, São Paulo",
            "Keanu Reeves, 56 anos, Beirute",
            "Steven Carell, 58 anos, Massachusetts",
            "Henry Cavill, 37 anos, Saint Helier",
            1
        )

        questionsList.add(que1)

        val que2 = Question(2,
            "Pergunta 2?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            2
        )

        questionsList.add(que2)

        val que3 = Question(3,
            "Pergunta 3?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            3
        )

        questionsList.add(que3)

        val que4 = Question(4,
            "Pergunta 4?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que4)

        val que5 = Question(5,
            "Pergunta 5?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que5)

        val que6 = Question(6,
            "Pergunta 6?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que6)

        val que7 = Question(7,
            "Pergunta 7?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que7)

        val que8 = Question(8,
            "Pergunta 8?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que8)

        val que9 = Question(9,
            "Pergunta 9?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que9)

        val que10 = Question(10,
            "Pergunta 10?",
            R.drawable.pergunta1,
            "A",
            "B",
            "C",
            "D",
            4
        )

        questionsList.add(que10)


        return questionsList

    }

}