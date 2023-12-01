package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Lomba>()

        list.add(Lomba(nama = "Kontes Robot Seni Tari Indonesia", deskripsi = " Kontes Robot Seni Tari Indonesia adalah lomba robot yang bergerak di bidang seni tari budaya Indonesia." +
                "Tim BADAYA_SAS TELKOM UNIVERSITY telah berhasil masuk menuju Final Nasional di ajang perlombaan KRI 2023. BADAYA_SAS akan berangkat ke Semarang tanggal 30 November 2023.", R.drawable.krsti))
        list.add(Lomba(nama = "Kontes Robot Sepak Bola Indonesia", deskripsi = " Kontes Robot Sepak Bola Indonesia adalah lomba robot yang bergerak di bidang olahraga sepak bola Indonesia." +
            "Tim ROSTU TELKOM UNIVERSITY telah berusaha memberikan yang terbaik dalam perlombaan KRI 2023, semoga tim ROSTU tahun depan bisa bersaing di finalis nasional", R.drawable.krsbi1))
        list.add(Lomba(nama = "Kontes Robot Bawah Air Indonesia", deskripsi = " Kontes Robot Bawah Air Indonesia adalah lomba robot yang bergerak di bidang SAR dan penyelaman Indonesia." +
            "Tim TECH_SAS TELKOM UNIVERSITY telah berhasil meraih juara 3 Tingkat Wilayah, dan akan maju menjadi Finalis Nasional dalam perlombaan KRI 2023 dan akan berangkat ke Semarang pada tanggal 30 November 2023. ", R.drawable.krbai))
        list.add(Lomba(nama = "Kontes Kapal Cepat Tak Berawak Nasional", deskripsi = " Kontes Kapal Cepat Tak Berawak Nasional adalah lomba robot yang bergerak di bidang perkapalan Indonesia" +
            "Tim POSEIDON TELKOM UNIVERSITY telah berhasil memasuki Final Tingkat Nasional dan akan berangkat menuju Depok untuk bertanding dalam lingkup nasional. ", R.drawable.kkctbn))
        list.add(Lomba(nama = "Singapore Autonomous Underwater Vehicle Challange", deskripsi = " SAUVC adalah lomba robot yang bergerak di bidang Autonomous penyelaman Internasional" +
            "Tim FIToplankton TELKOM UNIVERSITY telah berhasil meraih juara 3 Internasional dalam ajang perlombaan SAUVC 2022 di Singapore", R.drawable.sauvc))

        listView.adapter = LombaAdapter( mContext = this, R.layout.listlomba, list)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "KRSTI Juara", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "KRSBI Juara", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "KRBAI Juara", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "KKCTBNJuara", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "SAUVC Juara", Toast.LENGTH_SHORT).show()
            }
        }
    }
}