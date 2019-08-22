package pad.time4.recyclerview3dtime4

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuario :Map<Any, Any> = mapOf<Any, Any>("nome" to "Oberdan", "idade" to 25)

        val db :FirebaseFirestore = FirebaseFirestore.getInstance()
        db.collection(collectionPath: "usuarios").document(documentPath: "Oberdan").set(usuario)
        .addOnSuccessListener (Log.d(tag: "BAMCODEDADOS", msg: "usuario com sucesso"))



        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager (this)

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
