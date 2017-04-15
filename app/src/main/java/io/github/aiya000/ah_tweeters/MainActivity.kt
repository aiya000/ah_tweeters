package io.github.aiya000.ah_tweeters

import android.os.Bundle
import android.support.v7.app.*
import android.view.Menu


class MainActivity : AppCompatActivity() {
	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		getMenuInflater().inflate(R.menu.activity_main, menu)
		return true
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
}
