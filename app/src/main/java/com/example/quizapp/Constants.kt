package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

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
            "Quais são meus hobbies?",
            R.drawable.pergunta2,
            "Perfume, futebol, tenis, tomate, academia, viajar e relógios",
            "Filme, futebol, roupa, jogos, viajar, músicas e sair",
            "Filme, séries, jogos, animes, livros, mangás e investimentos",
            "Filme, jogos, gastar, correr, academia, sair e desenhar",
            3
        )

        questionsList.add(que2)

        val que3 = Question(3,
            "Trabalho que eu mais gostei de fazer? (disponivel no Github)",
            R.drawable.pergunta3,
            "Jogo da Memória Eevee",
            "SugarTime",
            "Kbuy",
            "Sistema de judocas",
            2
        )

        questionsList.add(que3)

        val que4 = Question(4,
            "Quais meus pontos fortes?",
            R.drawable.pergunta4,
            "Organizado",
            "Planejado",
            "Inteligente",
            "Todos acima",
            4
        )

        questionsList.add(que4)

        val que5 = Question(5,
            "Quais meus pontos fracos?",
            R.drawable.pergunta5,
            "Ansiosidade",
            "Teimoso",
            "Curioso",
            "Todos acima",
            4
        )

        questionsList.add(que5)

        val que6 = Question(6,
            "Como as outras pessoas me descrevem?",
            R.drawable.pergunta6,
            "Legal, divertido, engraçado, carismático, inteligente e esforçado",
            "Engraçado, presente, querido, amoroso, inteligente e diferente",
            "Inteligente, carinhoso, engraçado, presente, companheiro e divertido",
            "Todos acima",
            4
        )

        questionsList.add(que6)

        val que7 = Question(7,
            "Qual o meu maior sonho?",
            R.drawable.pergunta7,
            "Independência financeira",
            "Viajar o mundo todo",
            "Ter o cabelo parecido com o do Keanu Reeves",
            "Encontrar o Keanu Reeves e Steven Carell",
            1
        )

        questionsList.add(que7)

        val que8 = Question(8,
            "Qual o último livro que eu li?",
            R.drawable.pergunta8,
            "Você não merecer ser feliz, como conseguir mesmo assim",
            "Do mil ao milhão",
            "O temor do sábio",
            "O nome do vento",
            2
        )

        questionsList.add(que8)

        val que9 = Question(9,
            "O que eu mais gosto de fazer quando eu saio?",
            R.drawable.pergunta9,
            "Ir no cinema",
            "Comer",
            "Jogar",
            "Todos acima",
            4
        )

        questionsList.add(que9)

        val que10 = Question(10,
            "Qual foi o último anime que eu vi?",
            R.drawable.pergunta10,
            "Shokugeki",
            "Mob",
            "Naruto",
            "Kimetsu no yaiba",
            3
        )

        questionsList.add(que10)


        return questionsList

    }

}