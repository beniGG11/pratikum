package com.sanjaya.bismillah

class Makanansunda {
    private var gambar: Int = 0
    private var nama: String? = null

    fun MakananSunda(gambar: Int, nama: String): ??? {
        this.gambar = gambar
        this.nama = nama
    }

    fun getGambar(): Int {
        return gambar
    }

    fun setGambar(gambar: Int) {
        this.gambar = gambar
    }

    fun getNama(): String? {
        return nama
    }

    fun setNama(nama: String) {
        this.nama = nama
    }
}

}