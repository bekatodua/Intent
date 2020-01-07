package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")
        val age = intent.extras?.getString("AGE", "")

        val radioGroup = findViewById<RadioGroup>(R.id.genderCheck)


        finBtn.setOnClickListener{

            var value = radioGroup.checkedRadioButtonId
            var gender = findViewById<RadioButton>(value).text.toString()

            val intent = Intent(this, ThirdActivity::class.java)

            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("AGE",age)
            intent.putExtra("GENDER",gender)

            startActivity(intent)

            finish()




        }

    }
}
