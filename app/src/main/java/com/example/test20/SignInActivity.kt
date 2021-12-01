package com.example.test20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.test20.common.Obj
import retrofit2.Call
import retrofit2.Response
import java.util.regex.Pattern.compile

lateinit var email: EditText

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.EditTextEmail)

    }

    val pattern = ("[a-z0-9]{1,20}" +
            "\\@" +
            "[a-z]{1,7}" +
            "\\." +
            "[a-z]{1,3}")

    fun EmailValid(email: String): Boolean {
        return compile(pattern).matcher(email).matches()
    }

    fun btnRegister(view: View) {
        val reg = Intent(this, MainActivity::class.java)
        startActivity(reg)
    }

    fun btnConnect(view: View) {
        if (email.text.isNotEmpty()) {
            if (EmailValid(email.text.toString())) {
                // val getApi = Obj.getRetrofit()
                // var hashMap:HashMap<String,String> = HashMap<String,String>()
                //hashMap.put("email",email)
                //val log_call : retrofit2.Call<login> = getApi.getAuth(hashMap)
                //log_call.enqueue(object :retrofit2.Callback<login>{
                //override fun onResponse(call: Call<login>, response: Response<login>) {
                //if(response.isSuccessful){
                val menu = Intent(this@SignInActivity, MainActivity::class.java)
                startActivity(menu)
                //  }
                // else
                // {
                //    Toast.makeText(this@SignInActivity, "Неверный пароль", Toast.LENGTH_SHORT).show()

                //}
            }

            // override fun onFailure(call: Call<login>, t: Throwable) {
            //Toast.makeText(this@SignInActivity, t.message, Toast.LENGTH_SHORT).show()
            //}
            // })
            else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Неверный email")
                    .create()
                    .show()
            }
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Не все поля заполнены епта")
                .create()
                .show()
        }
    }
}