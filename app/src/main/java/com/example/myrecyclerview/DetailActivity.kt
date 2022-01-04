package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    private var title: String = "Detail"
    companion object {
        const val EXTRA_NAME = "extra nama"
        const val EXTRA_IMAGE = "extra image"
        const val EXTRA_DETAIL = "extra detail"
        const val EXTRA_NAMA = "extra nama bunga"
        const val EXTRA_FAMILY= "extra family"
        const val EXTRA_ORDO = "extra ordo"
        const val EXTRA_KINGDOM = "extra kingdom"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        val nama_bunga: TextView = findViewById(R.id.nama_bunga)
        val img_detail: ImageView = findViewById(R.id.img_detail)
        val detail_deskripsi: TextView = findViewById(R.id.detail_deskripsi)
        val dtNama: TextView = findViewById(R.id.nama_ilmiah)
        val dtFamily: TextView = findViewById(R.id.family)
        val dtOrdo: TextView = findViewById(R.id.ordo)
        val dtKingdom: TextView = findViewById(R.id.kingdom)


        val nama = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getIntExtra(EXTRA_IMAGE,0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val namabunga = intent.getStringExtra(EXTRA_NAMA)
        val namafamily = intent.getStringExtra(EXTRA_FAMILY)
        val namaordo = intent.getStringExtra(EXTRA_ORDO)
        val namakingdom = intent.getStringExtra(EXTRA_KINGDOM)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions().override(200, 200))
            .into(img_detail)
        nama_bunga.text = nama
        detail_deskripsi.text = detail
        dtNama.text = namabunga
        dtFamily.text = namafamily
        dtOrdo.text = namaordo
        dtKingdom.text = namakingdom
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}
