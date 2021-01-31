package th.ac.su.chanchon.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var out = findViewById<TextView>(R.id.out)
        var a = findViewById<EditText>(R.id.a)
        var b = findViewById<EditText>(R.id.b)
        val btn = findViewById<Button>(R.id.btn)


        btn.setOnClickListener() {
            var a1: Double = a.text.toString().toDouble()
            var b1: Double = b.text.toString().toDouble()
            var ans = (a1 * a1  + b1*b1)
            out.text = "C = "+ ans.toString()
        }

    }


}