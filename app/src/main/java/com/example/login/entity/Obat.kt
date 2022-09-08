package com.example.login.entity

class Obat(var ID:String, var nama:String, var harga:Double, var jenis:String) {
    companion object {
        @JvmField
        var listOfObat = arrayOf(
            Obat("1165", "Bodrex", 8100.00, "Tablet"),
            Obat("1166", "OBH Combi Anak", 20000.00, "Sirup"),
            Obat("1167", "Insto Regular", 15000.00, "Tetes"),
            Obat("1168", "Kalmicetine", 17000.00, "Salep"),
            Obat("1169", "Inzana", 1190.00, "Tablet"),
            Obat("1170", "Konidin", 2500.00, "Tablet"),
            Obat("1171", "Cyclogynon", 13800.00, "Tablet"),
            Obat("1172", "Proris Ibuprofen", 22000.00, "Sirup"),
            Obat("1173", "Komix", 10000.00, "Sirup"),
            Obat("1174", "Promag", 9500.00, "Tablet")
        )
    }
}