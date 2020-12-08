package android.example.com.desafio3_webervices.entities

import java.io.Serializable

data class Hq(
    val id: Int,
    val title: String,
    val issueNumber: Int,
    val pageCount: Int,
    var description: String,
    val date: List<Date>,
    val image: List<Image>,
    val price: List<Price>,
    val thumbnail: Thumbnail
) : Serializable



data class Date(
    val date: String,
    val type: String
) : Serializable {
    override fun toString(): String {
        return date
    }
}

data class Image(val extension: String, val path: String) : Serializable {
    override fun toString(): String {
        return "$path.$extension".replace("http", "https")
    }
}

data class Price(
    val price: Double,
    val type: String
) : Serializable {
    override fun toString(): String {
        return "$ $price"
    }
}

data class Thumbnail(val path: String, val extension: String) : Serializable {
    override fun toString(): String {
        return "$path.$extension".replace("http", "https")
    }
}