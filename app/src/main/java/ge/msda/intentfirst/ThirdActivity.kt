package ge.msda.intentfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("Name", "")
        val email = intent.extras?.getString("Email", "")
        val age = intent.extras?.getString("Age", "")
        val gender = intent.extras?.getString("Gender", "").toString()

        showName.text = name
        showEmail.text = email
        showAge.text = age
        showGender.text = gender

    }
}
