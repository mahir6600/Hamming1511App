package com.example.hamming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        // Örnek veri (11 bit)
        val dataBits = intArrayOf(1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1)
        val encoded = HammingCode.encode(dataBits)

        // Hata simülasyonu: 1. biti boz
        encoded[0] = if (encoded[0] == 1) 0 else 1

        val decoded = HammingCode.decode(encoded)

        textView.text =
            "Veri: ${dataBits.joinToString("")}\n" +
            "Kodlanmış: ${encoded.joinToString("")}\n" +
            "Çözülen: ${decoded.joinToString("")}"
    }
}
