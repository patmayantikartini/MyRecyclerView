package com.example.myrecyclerview

object HeroesData {
    private val heroNames = arrayOf(
        "Bunga Anggrek",
        "Bunga Chalatea",
        "Bunga Kamboja",
        "Bunga Keladi",
        "Bunga Lavender",
        "Bunga Lili",
        "Bunga Matahari",
        "Bunga Mawar",
        "Bunga Melati",
        "Bunga Tulip"
    )

    private val heroDetails = arrayOf(
        "Bunga anggrek adalah salah satu bunga hias, yang banyak ditemukan diberbagai daerah bahkan dunia. Bunga anggrek ini termasuk dalam famili orchidaceae dengan ordo orchidales yang memiliki bentuk bunga menjari dan memiliki ragam warna mulai dari merah, pink, putih dan juga keungguhan.",
        "Calathea adalah genus tanaman rhizomatous neotropical. Daun Calathea digunakan di daerah tropis, khususnya di Brazil, untuk kerajinan tangan dan pembungkus makanan. Daun calathea yang berwarna-warni menjadikannya salah satu tanaman hias dengan nilai ekonomi tinggi. Popularitasnya pun kini semakin menanjak.",
        "Kemboja, kamboja atau semboja adalah sekelompok tumbuhan dalam marga Plumeria. Bentuknya berupa pohon kecil dengan daun jarang namun tebal. Bunganya yang harumnya sangat khas, dengan mahkota berwarna putih hingga merah keunguan, biasanya lima helai.",
        "Tanaman hias keladi dikenal dengan nama latin Caladium. Masuk ke dalam kelompok suku talas atau araceae. Tanaman tropis ini berasal dari Amerika Selatan dan Amerika Tengah. Adapun ciri dari keladi, yaitu bentuk daun lebar memanjang ke depan membentuk hati, daun tipis, corak warna yang mencolok seperti hijau, putih, pink, dan merah, berumbi, dan tidak memiliki batang namun memiliki tangkai daun yang panjang.",
        "Lavender atau lavendel atau Lavandula adalah genus tumbuhan berbunga dalam suku Lamiaceae yang tersusun atas 25-30 spesies. Asal tumbuhan ini adalah dari wilayah selatan Laut Tengah sampai Afrika tropis dan ke timur sampai India",
        "Bunga lili berasal dari daerah yang beriklim sedang yaitu bagian utara Eropa, Amerika Utara dan Jepang, serta merupakan tanaman herba berumbi lapis, yang tingginya 0,5 sampai 1,3 m. Bunga lili memiliki ciri berkelopak corong lancip saat belum mekar dan memiliki kelopak yang didominasi oleh warna putih.",
        "Bunga matahari adalah tumbuhan semusim dari suku kenikir-kenikiran yang populer, baik sebagai tanaman hias maupun tanaman penghasil minyak. Bunga tumbuhan ini sangat khas: besar, biasanya berwarna kuning terang, dengan kepala bunga yang besar.",
        "Bunga mawar adalah jenis tanaman semak yang berasal dari Genus rosa sekaligus menjadi nama dari bunga yang dihasilkan oleh tumbuhan ini. Mawar umumnya merupakan tanaman semak yang berduri atau tanaman memanjat yang tingginya bisa mencapai 2 sampai 5 meter.",
        "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun (Oleaceae).",
        "Tulip merupakan tumbuhan tahunan berumbi yang tingginya antara 10–70 cm, daunnya berlilin, berbentuk sempit memanjang berwarna hijau nuansa kebiru-biruan, dan bunganya berukuran besar terdiri 6 helai daun mahkota."
    )

    private val heroesImages = intArrayOf(
        R.drawable.bunga_anggrek,
        R.drawable.bunga_chalatea,
        R.drawable.bunga_kamboja,
        R.drawable.bunga_keladi,
        R.drawable.bunga_lavender,
        R.drawable.bunga_lili,
        R.drawable.bunga_matahari,
        R.drawable.bunga_mawar,
        R.drawable.bunga_melati,
        R.drawable.bunga_tulip
    )

    private val detailNama = arrayOf(
        "Orchidaceae",
        "Maranta lietzei",
        "Plumeria",
        "Caladium",
        "Lavandula",
        "Lilium",
        "Helianthus Annuus",
        "Rosa",
        "Jasminum",
        "Tulipa"
    )

    private val detailFamily = arrayOf(
        "Orchidaceae; Juss.",
        "Marantaceae",
        "Apocynaceae",
        "Araceae",
        "Lamiaceae",
        "Liliaceae",
        "Asteraceae",
        "Rosaceae",
        "Oleaceae",
        "Liliaceae"
    )

    private val detailOrdo = arrayOf(
        "Asparagales",
        "Zingiberales",
        "Gentianales",
        "Alismatales",
        "Lamiales",
        "Liliales",
        "Asterales",
        "Rosales",
        "Lamiales",
        "Liliales"
    )

    private val detailKingdom = arrayOf(
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae",
        "Plantae"
    )

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                hero.namaBunga = detailNama[position]
                hero.family = detailFamily[position]
                hero.ordo = detailOrdo[position]
                hero.kingdom = detailKingdom[position]
                list.add(hero)
            }
            return list
        }
}