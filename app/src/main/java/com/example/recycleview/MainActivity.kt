package com.example.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvItem: RecyclerView
    private lateinit var adapter: RvAdapter
    private var dataItems = arrayListOf<DataItem>(
        DataItem("https://cdn1.katadata.co.id/media/images/thumb/2023/02/10/SINOPSIS_REBORN_RICH-2023_02_10-17_32_07_e4f23211f8d8c67a47017fa297287e4a_960x640_thumb.png","Sinopsis Reborn Rich, Drama Terbaru Song Joong Ki","12 Februari 2023","https://katadata.co.id/intan/lifestyle/63e9f66d416c9/sinopsis-reborn-rich-drama-song-joong-ki-bersaing-dengan-the-glory"),
        DataItem("https://cdn1.katadata.co.id/media/images/thumb/2023/01/31/Song_Joong_Ki-2023_01_31-12_56_30_088838d48b58190cee6589dce3b7ea3f_960x640_thumb.jpg","Profil Song Joong Ki, Aktor Korea Nikahi Katy Louise Saunders","31 Januari, 2023","https://katadata.co.id/intan/lifestyle/63d8e6d26c374/profil-song-joong-ki-aktor-korea-nikahi-katy-louise-saunders"),
        DataItem("https://static.uc.ac.id/library/2022/01/hometown-chachacha.jpeg","Ilmu Bisnis yang Didapat Dari Drama Hometown Cha Cha Cha","27 Januari 2022","https://www.uc.ac.id/library/ilmu-bisnis-yang-didapat-dari-drama-korea-hometown-cha-cha-cha/"),
        DataItem("https://thumb.viva.id/intipseleb/1265x711/2022/08/02/62e8999c206b2-kim-seon-ho.jpg","Profil Kim Seon Ho Lengkap dengan Perjalanan Karier","2 Agustus 2022","https://www.intipseleb.com/gaya-hidup/38279-kim-seon-ho"),
        DataItem("https://thumb.viva.id/intipseleb/1265x711/2023/06/28/649b97f75658c-film-dream.jpeg","Film Dream (2023) Dimainkan IU dan Park Seo Joon Tayang di Netflix","JUNI 18, 2021","https://www.intipseleb.com/korea/74206-film-dream-2023-dimainkan-iu-dan-park-seo-joon-tayang-di-netflix-catat-tanggalnya"),
        DataItem("https://www.fakta.id/media/uploads/7/1c987be60359b7d8e29b4ba9cd8ccad1.jpg","Apa Agama Park Seo Joon yang Ingin Diketahui Oleh Penggemar","21 Agustus 2020","https://www.fakta.id/apa-agama-park-seo-joon-yang-ingin-diketahui-oleh-penggemar/"),
        DataItem("https://imgsrv2.voi.id/9Boj6gaMrpLp5UgUkV4mK2KX4B95D7OZrtGxaJi_Q6c/auto/1200/675/sm/1/bG9jYWw6Ly8vcHVibGlzaGVycy8zNTM1Mi8yMDIxMDIyNDE4MTctbWFpbi5jcm9wcGVkXzE2MTQxNjU0NjkuanBn.jpg","KBS2 Tunda Tayang Drama Korea Dear.M","24 Fevruari 2021","https://voi.id/lifestyle/35352/kbs2-tunda-tayang-drama-korea-i-dear-m-i"),
        DataItem("https://assets.pikiran-rakyat.com/crop/0x55:700x561/x/photo/2022/02/14/1253449841.jpg","Jaehyun NCT Ulang tahun, Berikut Profil Idol yang Lahir pada 14 Februari Ii","14 Februari 2022","https://bekasi.pikiran-rakyat.com/entertainment/pr-123731315/jaehyun-nct-ulang-tahun-berikut-profil-idol-yang-lahir-pada-14-februari-ini?page=3"),
        DataItem("https://cdns.klimg.com/resized/1200x600/p/headline/sinopsis-drama-hwarang-beserta-daftar-p-52ba0c.jpg","Sinopsis Drama Hwarang Beserta Daftar Pemain dan Soundtrack yang Enak Didengarkan","26 Oktober 2023","https://www.kapanlagi.com/korea/sinopsis-drama-hwarang-beserta-daftar-pemain-dan-soundtrack-yang-enak-didengarkan-52ba0c.html"),
        DataItem("https://asset-a.grid.id/crop/0x0:0x0/945x630/photo/2022/05/31/foto-cover-v-bts-mendadak-ungga-20220531084727.jpg","Bikin ARMY Auto Flashback, V BTS Mendadak Unggah Foto Lawasnya saat Bintangi Drama","31 Mei 2022","https://www.grid.id/read/043304949/bikin-army-auto-flashback-v-bts-mendadak-unggah-foto-lawasnya-saat-bintangi-drama-hwarang-isyarat-bakal-comeback-akting?page=all")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        setupUI()
    }

    private fun init() {
        rvItem = findViewById(R.id.rv_item)
        rvItem.layoutManager = LinearLayoutManager(this)
        adapter = RvAdapter(this, arrayListOf())
        rvItem.adapter = adapter
    }

    private fun setupUI() {
        getData()
    }

    private fun getData() {
        retrieveList(dataItems)
    }

    private fun retrieveList(items: List<DataItem>) {
        adapter.apply {
            addItems(items)
            notifyDataSetChanged()
        }
    }
}