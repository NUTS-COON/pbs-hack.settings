package ru.nutscoon.psb.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_settings)

        val recyclerView: RecyclerView = findViewById(R.id.rv_settings)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
    }

    private fun fillList(): List<String> {
        return mutableListOf<String>(
            "Вход и авторизция",
            "Банокматы и отделения",
            "Настройки лимитов",
            "Связь с банокм"
        )
    }
}