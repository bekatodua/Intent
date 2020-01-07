package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_age.*

class AgeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)


        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")


        ageBtn.setOnClickListener{

            val age = enterAge.text.toString()

            val intent = Intent(this,GenderActivity::class.java)

            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("AGE",age)

            startActivity(intent)

            finish()
        }

    }
}
