package pad.time4.recyclerview3dtime4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager (this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Iracema", "Romance/Literatura Brasileira"))
        users.add(User("A Menina que Roubava Livros", "Drama"))
        users.add(User("Frankenstein", "Terror"))
        users.add(User("Dias Melhores Virão", "Religião"))
        users.add(User("As Crônicas Marcianas", "Ficção"))
        users.add(User("Ordem Vermelha", "Ação/Aventura"))
        users.add(User("O Retrato de Dorian Gray", "Suspense"))
        users.add(User("Use a Cabeça!", "Didático/Programação"))
        users.add(User("Laranja Mecânica", "Suspense"))
        users.add(User("Cidade de Papel", "Romance/Infanto Juvenil"))
        users.add(User("As Vantagens de Ser Invisível", "Drama/Infanto Juvenil"))
        users.add(User("O Diário de Anne Frank", "Biografia"))
        users.add(User("Necromancer", "Ficção Científica"))
        users.add(User("Necronomicon", "Ficção/Terror Cósmico"))
        users.add(User("A Cabana", "Ficção"))

        val adapter = CustomAdapter(users)


        recyclerView.adapter = adapter
    }
}
